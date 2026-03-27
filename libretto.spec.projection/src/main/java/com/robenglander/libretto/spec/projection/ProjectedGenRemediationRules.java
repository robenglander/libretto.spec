package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code rules { … }} inside {@code gen}.
 */
public record ProjectedGenRemediationRules(
		List<ProjectedGenPatternRemediationRule> patternRules,
		List<ProjectedGenDefaultRemediationRule> defaultRemediations) {

	public ProjectedGenRemediationRules {
		patternRules = patternRules == null ? List.of() : List.copyOf(patternRules);
		defaultRemediations = defaultRemediations == null ? List.of() : List.copyOf(defaultRemediations);
	}
}
