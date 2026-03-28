package com.robenglander.libretto.spec.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.robenglander.libretto.spec.librettoProjectProfile.BasePackage;
import com.robenglander.libretto.spec.librettoProjectProfile.Code;
import com.robenglander.libretto.spec.librettoProjectProfile.Correction;
import com.robenglander.libretto.spec.librettoProjectProfile.DefaultCorrection;
import com.robenglander.libretto.spec.librettoProjectProfile.Endpoint;
import com.robenglander.libretto.spec.librettoProjectProfile.Directory;
import com.robenglander.libretto.spec.librettoProjectProfile.GenBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.GenDefaultRemediationRule;
import com.robenglander.libretto.spec.librettoProjectProfile.GenEscalationBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.GenRemediationRules;
import com.robenglander.libretto.spec.librettoProjectProfile.GenUsageBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.InitialInstruction;
import com.robenglander.libretto.spec.librettoProjectProfile.LlmProvidersBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.LocalModelPath;
import com.robenglander.libretto.spec.librettoProjectProfile.MainDirectory;
import com.robenglander.libretto.spec.librettoProjectProfile.MaxRetries;
import com.robenglander.libretto.spec.librettoProjectProfile.Model;
import com.robenglander.libretto.spec.librettoProjectProfile.ModulesBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.ParseCheck;
import com.robenglander.libretto.spec.librettoProjectProfile.Pattern;
import com.robenglander.libretto.spec.librettoProjectProfile.PrimaryProvider;
import com.robenglander.libretto.spec.librettoProjectProfile.Profile;
import com.robenglander.libretto.spec.librettoProjectProfile.ProviderType;
import com.robenglander.libretto.spec.librettoProjectProfile.SecondaryProvider;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.RootDirectory;
import com.robenglander.libretto.spec.librettoProjectProfile.RootDirKeyword;
import com.robenglander.libretto.spec.librettoProjectProfile.SpecDirectory;
import com.robenglander.libretto.spec.librettoProjectProfile.TestDirectory;

/**
 * Removes the model element responsible for a "duplicate / only one allowed" diagnostic, so quick fixes can mirror
 * {@link LibrettoProjectProfileValidator#TOO_MANY_ROOT_DIRS} (delete this occurrence).
 */
public final class LibrettoProjectProfileDuplicateRemoval {

	private LibrettoProjectProfileDuplicateRemoval() {
	}

	/**
	 * @param contextObject element at the diagnostic offset (often a keyword child); normalized to the removable parent
	 */
	public static void removeForIssueCode(EObject contextObject, String issueCode) {
		EObject toRemove = resolveRemovable(contextObject, issueCode);
		if (toRemove != null) {
			EcoreUtil.remove(toRemove);
		}
	}

	private static EObject resolveRemovable(EObject ctx, String code) {
		if (ctx == null || code == null) {
			return null;
		}
		return switch (code) {
			case LibrettoProjectProfileValidator.TOO_MANY_PROFILES -> firstAncestorOrSelf(ctx, Profile.class);
			case LibrettoProjectProfileValidator.TOO_MANY_PROJECT_SECTIONS -> firstAncestorOrSelf(ctx, ProjectBlock.class);
			case LibrettoProjectProfileValidator.TOO_MANY_ROOT_DIRS -> toRootDirectory(ctx);
			case LibrettoProjectProfileValidator.TOO_MANY_MODULES_SECTIONS -> firstAncestorOrSelf(ctx, ModulesBlock.class);
			case LibrettoProjectProfileValidator.TOO_MANY_LLM_PROVIDERS_SECTIONS ->
					firstAncestorOrSelf(ctx, LlmProvidersBlock.class);
			case LibrettoProjectProfileValidator.LLM_PROVIDER_TOO_MANY_TYPES ->
					firstAncestorOrSelf(ctx, ProviderType.class);
			case LibrettoProjectProfileValidator.LLM_PROVIDER_LOCAL_TOO_MANY_FILE_PATHS ->
					firstAncestorOrSelf(ctx, LocalModelPath.class);
			case LibrettoProjectProfileValidator.LLM_PROVIDER_LOCAL_FILE_PATH_VALUE_DUPLICATE_ACROSS_PROVIDERS ->
					firstAncestorOrSelf(ctx, LocalModelPath.class);
			case LibrettoProjectProfileValidator.LLM_PROVIDER_LOCAL_MUST_NOT_ENDPOINT ->
					firstAncestorOrSelf(ctx, Endpoint.class);
			case LibrettoProjectProfileValidator.LLM_PROVIDER_MANAGED_MUST_NOT_FILE_PATH ->
					firstAncestorOrSelf(ctx, LocalModelPath.class);
			case LibrettoProjectProfileValidator.LLM_PROVIDER_MANAGED_MUST_NOT_ENDPOINT ->
					firstAncestorOrSelf(ctx, Endpoint.class);
			case LibrettoProjectProfileValidator.LLM_PROVIDER_MANAGED_TOO_MANY_MODELS ->
					firstAncestorOrSelf(ctx, Model.class);
			case LibrettoProjectProfileValidator.LLM_PROVIDER_MODEL_VALUE_DUPLICATE_FOR_TYPE ->
					firstAncestorOrSelf(ctx, Model.class);
			case LibrettoProjectProfileValidator.LLM_PROVIDER_OLLAMA_TOO_MANY_ENDPOINTS ->
					firstAncestorOrSelf(ctx, Endpoint.class);
			case LibrettoProjectProfileValidator.TOO_MANY_GEN_SECTIONS -> firstAncestorOrSelf(ctx, GenBlock.class);
			case LibrettoProjectProfileValidator.MODULE_DUPLICATE_PATH_DECLARATION -> firstModulePathDeclaration(ctx);
			case LibrettoProjectProfileValidator.GEN_TOO_MANY_INITIAL_INSTRUCTIONS ->
					firstAncestorOrSelf(ctx, InitialInstruction.class);
			case LibrettoProjectProfileValidator.GEN_TOO_MANY_MAX_RETRIES -> firstAncestorOrSelf(ctx, MaxRetries.class);
			case LibrettoProjectProfileValidator.GEN_TOO_MANY_PARSE_CHECKS -> firstAncestorOrSelf(ctx, ParseCheck.class);
			case LibrettoProjectProfileValidator.GEN_TOO_MANY_DEFAULT_CORRECTIONS ->
					firstAncestorOrSelf(ctx, DefaultCorrection.class);
			case LibrettoProjectProfileValidator.GEN_TOO_MANY_RULES_SECTIONS ->
					firstAncestorOrSelf(ctx, GenRemediationRules.class);
			case LibrettoProjectProfileValidator.GEN_TOO_MANY_MODEL_USAGES ->
					firstAncestorOrSelf(ctx, GenUsageBlock.class);
			case LibrettoProjectProfileValidator.MODEL_USAGE_TOO_MANY_PRIMARIES ->
					firstAncestorOrSelf(ctx, PrimaryProvider.class);
			case LibrettoProjectProfileValidator.MODEL_USAGE_TOO_MANY_SECONDARIES ->
					firstAncestorOrSelf(ctx, SecondaryProvider.class);
			case LibrettoProjectProfileValidator.MODEL_USAGE_TOO_MANY_ESCALATIONS ->
					firstAncestorOrSelf(ctx, GenEscalationBlock.class);
			case LibrettoProjectProfileValidator.MODEL_USAGE_PRIMARY_SECONDARY_SAME_NAME ->
					removablePrimaryOrSecondary(ctx);
			case LibrettoProjectProfileValidator.RULES_TOO_MANY_DEFAULT_SECTIONS ->
					firstAncestorOrSelf(ctx, GenDefaultRemediationRule.class);
			case LibrettoProjectProfileValidator.RULE_TOO_MANY_PATTERNS -> firstAncestorOrSelf(ctx, Pattern.class);
			case LibrettoProjectProfileValidator.RULE_TOO_MANY_CODES -> firstAncestorOrSelf(ctx, Code.class);
			case LibrettoProjectProfileValidator.RULE_TOO_MANY_CORRECTIONS ->
					firstAncestorOrSelf(ctx, Correction.class);
			case LibrettoProjectProfileValidator.DEFAULT_TOO_MANY_CODES -> firstAncestorOrSelf(ctx, Code.class);
			case LibrettoProjectProfileValidator.DEFAULT_TOO_MANY_CORRECTIONS ->
					firstAncestorOrSelf(ctx, Correction.class);
			default -> null;
		};
	}

	/** Prefer removing {@code secondary} when the diagnostic is anchored there; otherwise {@code primary}. */
	private static EObject removablePrimaryOrSecondary(EObject ctx) {
		EObject sec = firstAncestorOrSelf(ctx, SecondaryProvider.class);
		if (sec != null) {
			return sec;
		}
		return firstAncestorOrSelf(ctx, PrimaryProvider.class);
	}

	private static EObject firstModulePathDeclaration(EObject ctx) {
		EObject d = firstAncestorOrSelf(ctx, Directory.class);
		if (d != null) {
			return d;
		}
		EObject sd = firstAncestorOrSelf(ctx, SpecDirectory.class);
		if (sd != null) {
			return sd;
		}
		EObject td = firstAncestorOrSelf(ctx, TestDirectory.class);
		if (td != null) {
			return td;
		}
		EObject md = firstAncestorOrSelf(ctx, MainDirectory.class);
		if (md != null) {
			return md;
		}
		return firstAncestorOrSelf(ctx, BasePackage.class);
	}

	private static <T extends EObject> T firstAncestorOrSelf(EObject ctx, Class<T> type) {
		EObject c = ctx;
		while (c != null) {
			if (type.isInstance(c)) {
				return type.cast(c);
			}
			c = c.eContainer();
		}
		return null;
	}

	/**
	 * Validation anchors {@link LibrettoProjectProfileValidator#TOO_MANY_ROOT_DIRS} on {@link RootDirKeyword} when
	 * present, otherwise on {@link RootDirectory}.
	 */
	private static RootDirectory toRootDirectory(EObject element) {
		if (element instanceof RootDirectory rd) {
			return rd;
		}
		if (element instanceof RootDirKeyword) {
			EObject container = element.eContainer();
			if (container instanceof RootDirectory rd) {
				return rd;
			}
		}
		return firstAncestorOrSelf(element, RootDirectory.class);
	}
}
