package com.robenglander.libretto.spec.headless;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;
import com.robenglander.libretto.spec.LibrettoProjectProfileStandaloneSetup;
import com.robenglander.libretto.spec.librettoProjectProfile.Profile;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectProfile;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModelProjection;
import com.robenglander.libretto.spec.projection.ProjectedProfile;
import com.robenglander.libretto.spec.projection.mapper.LibrettoProjectProfileProjectionMapper;

/**
 * Headless native Libretto project profile: Xtext parse → EMF {@link ProjectProfile} (file root).
 * <p>
 * The portable projection is built only when the resource has <strong>no</strong> syntax errors and
 * <strong>no</strong> semantic validation {@linkplain Severity#ERROR errors}. Invalid profiles yield
 * {@link ProjectedProfile#empty()} (see {@link ParseResult#project()}).
 * <p>
 * Use {@link LibrettoProjectProfileProjectionMapper} only on validator-clean models, or use
 * {@link ParseResult#project()} after {@link #parse(String)}.
 */
public final class LibrettoProjectProfileHeadless {

	private static final Injector INJECTOR =
			new LibrettoProjectProfileStandaloneSetup().createInjectorAndDoEMFRegistration();

	private LibrettoProjectProfileHeadless() {
	}

	/**
	 * Parse result: EMF file root, resource-level syntax diagnostics (Xtext lexer/parser), and the
	 * {@link Resource} for semantic validation.
	 */
	public record ParseResult(ProjectProfile fileRoot, List<String> syntaxErrors, Resource resource) {
		public ParseResult {
			syntaxErrors = syntaxErrors == null ? List.of() : List.copyOf(syntaxErrors);
		}

		public boolean hasSyntaxErrors() {
			return !syntaxErrors.isEmpty();
		}

		/**
		 * Semantic validation messages with severity {@link Severity#ERROR} (Libretto project profile validator).
		 */
		public List<String> semanticErrors() {
			return LibrettoProjectProfileHeadless.semanticValidationErrors(resource);
		}

		public boolean hasSemanticErrors() {
			return !semanticErrors().isEmpty();
		}

		/**
		 * First {@code profile "…"} block from the parse tree, or {@code null} when absent.
		 *
		 * @deprecated Prefer {@link #fileRoot()} and {@link LibrettoProjectProfileDomainModelProjection#domainModel()};
		 *             retained for callers that assume a single profile block.
		 */
		@Deprecated
		public Profile projectProfile() {
			if (fileRoot == null || fileRoot.getProfiles().isEmpty()) {
				return null;
			}
			return fileRoot.getProfiles().get(0);
		}

		/**
		 * Portable projection only when {@link #hasSyntaxErrors()} is false and there are no semantic
		 * {@linkplain Severity#ERROR validation errors}; otherwise {@link ProjectedProfile#empty()}.
		 */
		public LibrettoProjectProfileDomainModelProjection project() {
			if (fileRoot == null || hasSyntaxErrors()) {
				return new LibrettoProjectProfileDomainModelProjection(ProjectedProfile.empty());
			}
			if (!semanticErrors().isEmpty()) {
				return new LibrettoProjectProfileDomainModelProjection(ProjectedProfile.empty());
			}
			return LibrettoProjectProfileProjectionMapper.project(fileRoot);
		}
	}

	public static ParseResult parse(String text) {
		if (text == null) {
			return new ParseResult(null, List.of("null project profile text"), null);
		}
		XtextResourceSet resourceSet = INJECTOR.getInstance(XtextResourceSet.class);
		URI uri = URI.createURI("synthetic:/inmemory.lpp");
		Resource resource = resourceSet.createResource(uri);
		Map<String, Object> loadOptions = new HashMap<>();
		loadOptions.put(XtextResource.OPTION_ENCODING, "UTF-8");
		try {
			resource.load(new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8)), loadOptions);
		} catch (IOException e) {
			return new ParseResult(null, List.of("I/O: " + e.getMessage()), null);
		}
		List<String> errors = new ArrayList<>();
		for (Resource.Diagnostic d : resource.getErrors()) {
			errors.add(d.getMessage());
		}
		if (resource.getContents().isEmpty()) {
			return new ParseResult(null, errors.isEmpty() ? List.of("empty parse model") : errors, resource);
		}
		Object root = resource.getContents().get(0);
		ProjectProfile fileRoot = root instanceof ProjectProfile pp ? pp : null;
		return new ParseResult(fileRoot, errors, resource);
	}

	public static LibrettoProjectProfileDomainModelProjection parseAndProject(String text) {
		return parse(text).project();
	}

	private static List<String> semanticValidationErrors(Resource resource) {
		if (resource == null) {
			return List.of();
		}
		IResourceValidator validator = INJECTOR.getInstance(IResourceValidator.class);
		List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		List<String> out = new ArrayList<>();
		for (Issue issue : issues) {
			if (issue.getSeverity() == Severity.ERROR) {
				out.add(issue.getMessage());
			}
		}
		return List.copyOf(out);
	}
}
