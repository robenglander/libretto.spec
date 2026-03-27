package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code testgen { … }} under {@code project}.
 */
public record ProjectedTestGenBlock(
		String initialInstruction,
		List<String> forbiddenPatterns,
		int maxRetries,
		String parseCheckRaw,
		ProjectedTestGenRemediations remediations,
		List<ProjectedTestGenLegacyRule> legacyRemediationRules,
		ProjectedTestGenUsage usage,
		List<ProjectedTestGenModulePolicy> modulePolicies) {

	public ProjectedTestGenBlock {
		initialInstruction = initialInstruction == null ? "" : initialInstruction;
		forbiddenPatterns = forbiddenPatterns == null ? List.of() : List.copyOf(forbiddenPatterns);
		parseCheckRaw = parseCheckRaw == null ? "" : parseCheckRaw.trim();
		legacyRemediationRules = legacyRemediationRules == null ? List.of() : List.copyOf(legacyRemediationRules);
		modulePolicies = modulePolicies == null ? List.of() : List.copyOf(modulePolicies);
	}
}
