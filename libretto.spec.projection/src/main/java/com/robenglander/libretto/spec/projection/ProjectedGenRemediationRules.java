package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/**
 * Portable view of {@code rules { … }} inside {@code gen}. Validator-clean LPP has one {@code default { … }} and
 * zero or more {@code rule { … }} blocks.
 */
public record ProjectedGenRemediationRules(
		List<ProjectedGenPatternRemediationRule> patternRules,
		ProjectedGenDefaultRemediationRule defaultRemediation) {

	public ProjectedGenRemediationRules {
		patternRules = List.copyOf(Objects.requireNonNull(patternRules, "patternRules"));
		defaultRemediation = Objects.requireNonNull(defaultRemediation, "defaultRemediation");
	}

	/** Placeholder when tests need an empty pattern list with a minimal default rule. */
	public static ProjectedGenRemediationRules empty() {
		return new ProjectedGenRemediationRules(
				List.of(),
				new ProjectedGenDefaultRemediationRule(
						new ProjectedGenRemediationCode("shell"),
						new ProjectedGenRemediationCorrection("shell")));
	}
}
