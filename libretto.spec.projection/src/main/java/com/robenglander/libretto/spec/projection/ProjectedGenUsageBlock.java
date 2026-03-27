package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code modelUsage { primary … secondary … escalation … }} inside {@code gen}.
 */
public record ProjectedGenUsageBlock(
		List<String> primaryProviders,
		List<String> secondaryProviders,
		List<ProjectedGenEscalationBlock> escalations) {

	public ProjectedGenUsageBlock {
		primaryProviders = normalizeList(primaryProviders);
		secondaryProviders = normalizeList(secondaryProviders);
		escalations = escalations == null ? List.of() : List.copyOf(escalations);
	}

	private static List<String> normalizeList(List<String> in) {
		if (in == null || in.isEmpty()) {
			return List.of();
		}
		return List.copyOf(in.stream().map(s -> s == null ? "" : s.trim()).toList());
	}
}
