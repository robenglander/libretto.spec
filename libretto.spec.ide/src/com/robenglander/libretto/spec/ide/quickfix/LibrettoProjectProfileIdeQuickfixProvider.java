/*
 * LSP / IDE quick fixes (org.eclipse.xtext.ide) — complements Eclipse UI fixes in libretto.spec.ui.
 */
package com.robenglander.libretto.spec.ide.quickfix;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.lsp4j.Diagnostic;
import org.eclipse.xtext.ide.editor.quickfix.AbstractDeclarativeIdeQuickfixProvider;
import org.eclipse.xtext.ide.editor.quickfix.DiagnosticResolution;
import org.eclipse.xtext.ide.editor.quickfix.DiagnosticResolutionAcceptor;
import org.eclipse.xtext.ide.editor.quickfix.ISemanticModification;
import org.eclipse.xtext.ide.editor.quickfix.ITextModification;
import org.eclipse.xtext.ide.editor.quickfix.QuickFix;
import org.eclipse.xtext.ide.serializer.IChangeSerializer.IModification;
import org.eclipse.xtext.ide.server.Document;
import org.eclipse.xtext.ide.server.codeActions.ICodeActionService2;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.robenglander.libretto.spec.librettoProjectProfile.Profile;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectProfile;
import com.robenglander.libretto.spec.validation.LibrettoProjectProfileDuplicateRemoval;
import com.robenglander.libretto.spec.validation.LibrettoProjectProfileValidator;
import com.robenglander.libretto.spec.validation.LlmProviderReferenceSupport;

/**
 * Declarative quick fixes for {@code .lpp} when using the Xtext language server (IntelliJ, VS Code, etc.).
 *
 * @see com.robenglander.libretto.spec.ui.quickfix.LibrettoProjectProfileQuickfixProvider Eclipse-only {@code @Fix} provider
 */
public class LibrettoProjectProfileIdeQuickfixProvider extends AbstractDeclarativeIdeQuickfixProvider {

	@Inject
	private Provider<DiagnosticResolutionAcceptor> diagnosticResolutionAcceptorProvider;

	@Override
	public boolean handlesDiagnostic(Diagnostic diagnostic) {
		if (isDeclaredProviderNameModelUsageFix(diagnostic)) {
			return true;
		}
		if (isInvalidProviderTypeNameDiagnostic(diagnostic)) {
			return true;
		}
		return super.handlesDiagnostic(diagnostic);
	}

	@Override
	public List<DiagnosticResolution> getResolutions(ICodeActionService2.Options options, Diagnostic diagnostic) {
		List<DiagnosticResolution> list = new ArrayList<>(super.getResolutions(options, diagnostic));
		if (isDeclaredProviderNameModelUsageFix(diagnostic)) {
			/*
			 * Must use DiagnosticResolutionAcceptor: it calls package-private DiagnosticResolution.configure(options,
			 * diagnostic). Resolutions created with "new DiagnosticResolution(...)" never get configured, so apply()
			 * sees null uri/document/access and produces no workspace edit.
			 */
			DiagnosticResolutionAcceptor dynamic = diagnosticResolutionAcceptorProvider.get();
			/*
			 * Match legacy Libretto UI quick fixes (e.g. LibrettoQuickfixProvider): replace text at the validation
			 * region (there IXtextDocument.replace(issue.getOffset(), length, newText); here LSP diagnostic range +
			 * TextEdit). Change-serializer semantic edits did not produce applicable workspace edits for this case.
			 * Same resolutions as {@link LibrettoProjectProfileValidator#MODEL_USAGE_UNKNOWN_PROVIDER}; for
			 * {@link LibrettoProjectProfileValidator#MODEL_USAGE_TOP_ESCALATION_PROVIDER_SAME_NAME} the primary name is
			 * excluded from candidates (see {@link #candidateDeclaredProviderNames}).
			 */
			for (String name : candidateDeclaredProviderNames(options, diagnostic)) {
				dynamic.accept(
						"Change to provider '" + name + "'",
						(ITextModification) (Diagnostic d, EObject ctx, Document doc) -> createTextEdit(d, name));
			}
			list.addAll(dynamic.getDiagnosticResolutions(options, diagnostic));
		}
		if (isInvalidProviderTypeNameDiagnostic(diagnostic)) {
			DiagnosticResolutionAcceptor dynamic = diagnosticResolutionAcceptorProvider.get();
			for (String allowed : LibrettoProjectProfileValidator.ALLOWED_LLM_PROVIDER_TYPE_NAMES) {
				dynamic.accept(
						"Change type to '" + allowed + "'",
						(ITextModification) (Diagnostic d, EObject ctx, Document doc) -> createTextEdit(d, allowed));
			}
			list.addAll(dynamic.getDiagnosticResolutions(options, diagnostic));
		}
		return list;
	}

	private static String diagnosticCodeString(Diagnostic d) {
		if (d == null || d.getCode() == null) {
			return null;
		}
		var code = d.getCode();
		return code.isLeft() ? code.getLeft() : null;
	}

	private static boolean isUnknownModelUsageProviderDiagnostic(Diagnostic diagnostic) {
		return LibrettoProjectProfileValidator.MODEL_USAGE_UNKNOWN_PROVIDER.equals(diagnosticCodeString(diagnostic));
	}

	private static boolean isTopEscalationSameNameAsPrimaryDiagnostic(Diagnostic diagnostic) {
		return LibrettoProjectProfileValidator.MODEL_USAGE_TOP_ESCALATION_PROVIDER_SAME_NAME.equals(
				diagnosticCodeString(diagnostic));
	}

	/** {@link LibrettoProjectProfileValidator#MODEL_USAGE_UNKNOWN_PROVIDER} or same-name escalation / primary. */
	private static boolean isDeclaredProviderNameModelUsageFix(Diagnostic diagnostic) {
		return isUnknownModelUsageProviderDiagnostic(diagnostic)
				|| isTopEscalationSameNameAsPrimaryDiagnostic(diagnostic);
	}

	private static boolean isInvalidProviderTypeNameDiagnostic(Diagnostic diagnostic) {
		return LibrettoProjectProfileValidator.LLM_PROVIDER_TYPE_INVALID.equals(diagnosticCodeString(diagnostic));
	}

	private static List<String> candidateDeclaredProviderNames(ICodeActionService2.Options options,
			Diagnostic diagnostic) {
		List<String> fromData;
		String excludeName = null;
		if (isTopEscalationSameNameAsPrimaryDiagnostic(diagnostic)) {
			Object d = diagnostic.getData();
			if (d instanceof List<?> list && list.size() >= 2 && list.get(0) instanceof String s0
					&& list.get(1) instanceof String s1) {
				fromData = LlmProviderReferenceSupport.splitDeclaredNamesCsv(s0);
				excludeName = s1;
			} else {
				String raw = firstStringFromDiagnosticData(diagnostic);
				if (raw != null && !raw.isBlank()) {
					String[] parsed = parseEscalationSameNameIssueData(raw);
					fromData = LlmProviderReferenceSupport.splitDeclaredNamesCsv(parsed[0]);
					excludeName = parsed[1];
				} else {
					fromData = List.of();
				}
			}
		} else {
			fromData = diagnosticDataCsvNames(diagnostic);
		}
		if (!fromData.isEmpty()) {
			return filterExcludedProviderName(fromData, excludeName);
		}
		Resource r = options.getResource();
		if (r instanceof XtextResource xr && !xr.getContents().isEmpty()) {
			EObject root = xr.getContents().get(0);
			if (root instanceof ProjectProfile pp && !pp.getProfiles().isEmpty()) {
				Profile p = pp.getProfiles().get(0);
				List<String> all = LlmProviderReferenceSupport.declaredProviderNamesSorted(p);
				return filterExcludedProviderName(all, excludeName);
			}
		}
		return List.of();
	}

	private static String firstStringFromDiagnosticData(Diagnostic diagnostic) {
		Object data = diagnostic.getData();
		if (data instanceof List<?> list && !list.isEmpty() && list.get(0) instanceof String s) {
			return s;
		}
		if (data instanceof String s) {
			return s;
		}
		return null;
	}

	private static List<String> filterExcludedProviderName(List<String> names, String excludeName) {
		if (excludeName == null || excludeName.isBlank()) {
			return names;
		}
		String ex = excludeName.trim();
		List<String> out = new ArrayList<>();
		for (String n : names) {
			if (!n.equals(ex)) {
				out.add(n);
			}
		}
		return out;
	}

	/** Same encoding as {@link LlmProviderReferenceSupport#escalationSameNameIssueData(String, String)} (Tycho classpath). */
	private static String[] parseEscalationSameNameIssueData(String issueData) {
		if (issueData == null || issueData.isBlank()) {
			return new String[] { "", "" };
		}
		int i = issueData.lastIndexOf('|');
		if (i < 0) {
			return new String[] { issueData.trim(), "" };
		}
		return new String[] { issueData.substring(0, i).trim(), issueData.substring(i + 1).trim() };
	}

	private static List<String> diagnosticDataCsvNames(Diagnostic diagnostic) {
		Object data = diagnostic.getData();
		if (data == null) {
			return List.of();
		}
		if (data instanceof String s) {
			return LlmProviderReferenceSupport.splitDeclaredNamesCsv(s);
		}
		if (data instanceof List<?> list && !list.isEmpty()) {
			Object first = list.get(0);
			if (first instanceof String s) {
				return LlmProviderReferenceSupport.splitDeclaredNamesCsv(s);
			}
		}
		return List.of();
	}

	@QuickFix(LibrettoProjectProfileValidator.TOO_MANY_PROFILES)
	public void removeDuplicateProfile(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.TOO_MANY_PROFILES, "Remove this profile block");
	}

	@QuickFix(LibrettoProjectProfileValidator.TOO_MANY_PROJECT_SECTIONS)
	public void removeDuplicateProject(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.TOO_MANY_PROJECT_SECTIONS, "Remove this project block");
	}

	@QuickFix(LibrettoProjectProfileValidator.TOO_MANY_ROOT_DIRS)
	public void removeDuplicateRootDir(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.TOO_MANY_ROOT_DIRS, "Remove this rootDir entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.TOO_MANY_MODULES_SECTIONS)
	public void removeDuplicateModulesSection(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.TOO_MANY_MODULES_SECTIONS, "Remove this modules section");
	}

	@QuickFix(LibrettoProjectProfileValidator.TOO_MANY_LLM_PROVIDERS_SECTIONS)
	public void removeDuplicateLlmProvidersSection(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.TOO_MANY_LLM_PROVIDERS_SECTIONS,
				"Remove this llmProviders section");
	}

	@QuickFix(LibrettoProjectProfileValidator.TOO_MANY_GEN_SECTIONS)
	public void removeDuplicateGenSection(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.TOO_MANY_GEN_SECTIONS, "Remove this gen section");
	}

	@QuickFix(LibrettoProjectProfileValidator.MODULE_DUPLICATE_PATH_DECLARATION)
	public void removeDuplicateModulePathDecl(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.MODULE_DUPLICATE_PATH_DECLARATION, "Remove this declaration");
	}

	@QuickFix(LibrettoProjectProfileValidator.GEN_TOO_MANY_INITIAL_INSTRUCTIONS)
	public void removeDuplicateInitialInstruction(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.GEN_TOO_MANY_INITIAL_INSTRUCTIONS,
				"Remove this initialInstruction");
	}

	@QuickFix(LibrettoProjectProfileValidator.GEN_TOO_MANY_MAX_RETRIES)
	public void removeDuplicateMaxRetries(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.GEN_TOO_MANY_MAX_RETRIES, "Remove this maxRetries");
	}

	@QuickFix(LibrettoProjectProfileValidator.GEN_TOO_MANY_PARSE_CHECKS)
	public void removeDuplicateParseCheck(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.GEN_TOO_MANY_PARSE_CHECKS, "Remove this parseCheck");
	}

	@QuickFix(LibrettoProjectProfileValidator.GEN_TOO_MANY_DEFAULT_CORRECTIONS)
	public void removeDuplicateGenDefaultCorrection(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.GEN_TOO_MANY_DEFAULT_CORRECTIONS,
				"Remove this defaultCorrection");
	}

	@QuickFix(LibrettoProjectProfileValidator.GEN_TOO_MANY_RULES_SECTIONS)
	public void removeDuplicateRulesSection(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.GEN_TOO_MANY_RULES_SECTIONS, "Remove this rules section");
	}

	@QuickFix(LibrettoProjectProfileValidator.GEN_TOO_MANY_MODEL_USAGES)
	public void removeDuplicateModelUsageSection(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.GEN_TOO_MANY_MODEL_USAGES,
				"Remove this modelUsage section");
	}

	@QuickFix(LibrettoProjectProfileValidator.MODEL_USAGE_TOO_MANY_PROVIDERS)
	public void removeDuplicateModelUsageProvider(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.MODEL_USAGE_TOO_MANY_PROVIDERS,
				"Remove this provider entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.MODEL_USAGE_TOO_MANY_ESCALATIONS)
	public void removeDuplicateEscalationTo(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.MODEL_USAGE_TOO_MANY_ESCALATIONS,
				"Remove this escalationTo line");
	}

	@QuickFix(LibrettoProjectProfileValidator.LLM_PROVIDER_TOO_MANY_TYPES)
	public void removeDuplicateProviderType(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.LLM_PROVIDER_TOO_MANY_TYPES, "Remove this type entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.LLM_PROVIDER_LOCAL_TOO_MANY_FILE_PATHS)
	public void removeDuplicateLocalFilePath(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.LLM_PROVIDER_LOCAL_TOO_MANY_FILE_PATHS,
				"Remove this filePath entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.LLM_PROVIDER_LOCAL_FILE_PATH_VALUE_DUPLICATE_ACROSS_PROVIDERS)
	public void removeDuplicateLocalFilePathAcrossProviders(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.LLM_PROVIDER_LOCAL_FILE_PATH_VALUE_DUPLICATE_ACROSS_PROVIDERS,
				"Remove this filePath entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.LLM_PROVIDER_LOCAL_MUST_NOT_ENDPOINT)
	public void removeLocalProviderEndpoint(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.LLM_PROVIDER_LOCAL_MUST_NOT_ENDPOINT,
				"Remove this endpoint entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.LLM_PROVIDER_MANAGED_MUST_NOT_FILE_PATH)
	public void removeManagedProviderFilePath(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.LLM_PROVIDER_MANAGED_MUST_NOT_FILE_PATH,
				"Remove this filePath entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.LLM_PROVIDER_MANAGED_MUST_NOT_ENDPOINT)
	public void removeManagedProviderEndpoint(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.LLM_PROVIDER_MANAGED_MUST_NOT_ENDPOINT,
				"Remove this endpoint entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.LLM_PROVIDER_MANAGED_TOO_MANY_MODELS)
	public void removeDuplicateManagedModel(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.LLM_PROVIDER_MANAGED_TOO_MANY_MODELS,
				"Remove this model entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.LLM_PROVIDER_MODEL_VALUE_DUPLICATE_FOR_TYPE)
	public void removeDuplicateModelValueForType(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.LLM_PROVIDER_MODEL_VALUE_DUPLICATE_FOR_TYPE,
				"Remove this model entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.LLM_PROVIDER_OLLAMA_TOO_MANY_ENDPOINTS)
	public void removeDuplicateOllamaEndpoint(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.LLM_PROVIDER_OLLAMA_TOO_MANY_ENDPOINTS,
				"Remove this endpoint entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.RULES_TOO_MANY_DEFAULT_SECTIONS)
	public void removeDuplicateDefaultRemediationSection(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(
				acceptor,
				LibrettoProjectProfileValidator.RULES_TOO_MANY_DEFAULT_SECTIONS,
				"Remove this default section");
	}

	@QuickFix(LibrettoProjectProfileValidator.RULE_TOO_MANY_PATTERNS)
	public void removeDuplicateRulePattern(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.RULE_TOO_MANY_PATTERNS, "Remove this pattern entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.RULE_TOO_MANY_CODES)
	public void removeDuplicateRuleCode(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.RULE_TOO_MANY_CODES, "Remove this code entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.RULE_TOO_MANY_CORRECTIONS)
	public void removeDuplicateRuleCorrection(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.RULE_TOO_MANY_CORRECTIONS, "Remove this correction entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.DEFAULT_TOO_MANY_CODES)
	public void removeDuplicateDefaultCode(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.DEFAULT_TOO_MANY_CODES, "Remove this code entry");
	}

	@QuickFix(LibrettoProjectProfileValidator.DEFAULT_TOO_MANY_CORRECTIONS)
	public void removeDuplicateDefaultCorrection(DiagnosticResolutionAcceptor acceptor) {
		acceptRemoval(acceptor, LibrettoProjectProfileValidator.DEFAULT_TOO_MANY_CORRECTIONS, "Remove this correction entry");
	}

	private static void acceptRemoval(DiagnosticResolutionAcceptor acceptor, String issueCode, String label) {
		acceptor.accept(
				label,
				(ISemanticModification) (Diagnostic diagnostic, EObject contextObject) -> (IModification<EObject>) context -> LibrettoProjectProfileDuplicateRemoval.removeForIssueCode(
						context,
						issueCode));
	}
}
