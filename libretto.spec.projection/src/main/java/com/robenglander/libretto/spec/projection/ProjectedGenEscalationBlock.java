package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code escalation { … }} inside {@code modelUsage}.
 */
public record ProjectedGenEscalationBlock(
		List<String> enableds,
		List<Integer> escalateAtRetries) {

	public ProjectedGenEscalationBlock {
		enableds = enableds == null ? List.of() : List.copyOf(enableds.stream().map(s -> s == null ? "" : s.trim()).toList());
		escalateAtRetries = escalateAtRetries == null ? List.of() : List.copyOf(escalateAtRetries);
	}
}
