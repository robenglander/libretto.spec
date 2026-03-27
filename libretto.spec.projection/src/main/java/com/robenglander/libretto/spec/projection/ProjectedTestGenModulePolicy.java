package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code forModule "moduleId" { … }} under testgen.
 */
public record ProjectedTestGenModulePolicy(
		String moduleId,
		String initialInstruction,
		List<String> forbiddenPatterns,
		int maxRetries,
		String parseCheckRaw,
		ProjectedTestGenRemediations remediations,
		List<ProjectedTestGenLegacyRule> legacyRemediationRules,
		ProjectedTestGenUsage usage) {

	public ProjectedTestGenModulePolicy {
		moduleId = moduleId == null ? "" : moduleId.trim();
		initialInstruction = initialInstruction == null ? "" : initialInstruction;
		forbiddenPatterns = forbiddenPatterns == null ? List.of() : List.copyOf(forbiddenPatterns);
		parseCheckRaw = parseCheckRaw == null ? "" : parseCheckRaw.trim();
		legacyRemediationRules = legacyRemediationRules == null ? List.of() : List.copyOf(legacyRemediationRules);
	}
}
