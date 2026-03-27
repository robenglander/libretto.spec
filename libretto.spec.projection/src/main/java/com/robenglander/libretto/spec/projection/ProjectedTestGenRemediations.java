package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code remediations { … }} under testgen (or module testgen overlay).
 */
public record ProjectedTestGenRemediations(
		Integer maxRetries,
		Boolean parseCheck,
		String defaultCorrection,
		List<String> extraForbiddenPatterns,
		List<ProjectedTestGenPatternRemediation> patternRules,
		ProjectedTestGenDefaultRemediation defaultRemediation) {

	public ProjectedTestGenRemediations {
		defaultCorrection = defaultCorrection == null ? "" : defaultCorrection;
		extraForbiddenPatterns = extraForbiddenPatterns == null ? List.of() : List.copyOf(extraForbiddenPatterns);
		patternRules = patternRules == null ? List.of() : List.copyOf(patternRules);
	}
}
