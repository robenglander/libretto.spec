package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code gen { … }} under {@code project}, lists in source order.
 */
public record ProjectedGenBlock(
		List<ProjectedGenInstruction> initialInstructions,
		List<ProjectedGenMaxRetries> maxRetries,
		List<ProjectedGenParseCheck> parseChecks,
		List<ProjectedGenDefaultCorrection> defaultCorrections,
		List<ProjectedGenRemediationRules> remediations,
		List<ProjectedGenUsageBlock> modelUsages) {

	public ProjectedGenBlock {
		initialInstructions = initialInstructions == null ? List.of() : List.copyOf(initialInstructions);
		maxRetries = maxRetries == null ? List.of() : List.copyOf(maxRetries);
		parseChecks = parseChecks == null ? List.of() : List.copyOf(parseChecks);
		defaultCorrections = defaultCorrections == null ? List.of() : List.copyOf(defaultCorrections);
		remediations = remediations == null ? List.of() : List.copyOf(remediations);
		modelUsages = modelUsages == null ? List.of() : List.copyOf(modelUsages);
	}
}
