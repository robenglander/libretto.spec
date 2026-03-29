package com.robenglander.libretto.spec.projection;

import java.util.Objects;
import java.util.Optional;

/**
 * Portable view of {@code gen { … }} under {@code project}. Validator-clean LPP has one each of
 * {@code initialInstruction}, {@code parseCheck}, {@code defaultCorrection}, {@code rules}, and {@code modelUsage}.
 */
public record ProjectedGenBlock(
		ProjectedGenInstruction initialInstruction,
		ProjectedGenParseCheck parseCheck,
		ProjectedGenDefaultCorrection defaultCorrection,
		ProjectedGenRemediationRules remediation,
		Optional<ProjectedGenUsageBlock> modelUsage) {

	public ProjectedGenBlock {
		initialInstruction = Objects.requireNonNull(initialInstruction, "initialInstruction");
		parseCheck = Objects.requireNonNull(parseCheck, "parseCheck");
		defaultCorrection = Objects.requireNonNull(defaultCorrection, "defaultCorrection");
		remediation = Objects.requireNonNull(remediation, "remediation");
		modelUsage = Objects.requireNonNull(modelUsage, "modelUsage");
	}

	/**
	 * Placeholder for tests or tooling that need a structural shell; not a validator-clean LPP {@code gen} block.
	 */
	public static ProjectedGenBlock empty() {
		return new ProjectedGenBlock(
				new ProjectedGenInstruction("shell"),
				new ProjectedGenParseCheck(true),
				new ProjectedGenDefaultCorrection("shell"),
				ProjectedGenRemediationRules.empty(),
				Optional.empty());
	}
}
