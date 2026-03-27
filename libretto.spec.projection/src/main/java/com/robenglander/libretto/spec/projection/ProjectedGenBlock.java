package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code gen { … }} under {@code project}.
 */
public record ProjectedGenBlock(
		List<String> initialInstructions,
		List<Integer> maxRetries,
		List<String> parseChecks,
		List<String> defaultCorrections,
		List<ProjectedGenRemediationRules> remediations,
		List<ProjectedGenUsageBlock> modelUsages) {

	public ProjectedGenBlock {
		initialInstructions = normalizeStrings(initialInstructions);
		maxRetries = maxRetries == null ? List.of() : List.copyOf(maxRetries);
		parseChecks = normalizeStrings(parseChecks);
		defaultCorrections = normalizeStrings(defaultCorrections);
		remediations = remediations == null ? List.of() : List.copyOf(remediations);
		modelUsages = modelUsages == null ? List.of() : List.copyOf(modelUsages);
	}

	private static List<String> normalizeStrings(List<String> in) {
		if (in == null || in.isEmpty()) {
			return List.of();
		}
		return List.copyOf(in.stream().map(s -> s == null ? "" : s.trim()).toList());
	}
}
