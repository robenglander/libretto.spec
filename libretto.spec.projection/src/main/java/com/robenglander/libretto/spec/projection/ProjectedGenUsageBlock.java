package com.robenglander.libretto.spec.projection;

import java.util.List;

/** Portable view of {@code modelUsage { primary* secondary* escalation* }} under {@code gen}. */
public record ProjectedGenUsageBlock(
		List<ProjectedGenPrimaryProvider> primaryProviders,
		List<ProjectedGenSecondaryProvider> secondaryProviders,
		List<ProjectedGenEscalationBlock> escalations) {

	public ProjectedGenUsageBlock {
		primaryProviders = primaryProviders == null ? List.of() : List.copyOf(primaryProviders);
		secondaryProviders = secondaryProviders == null ? List.of() : List.copyOf(secondaryProviders);
		escalations = escalations == null ? List.of() : List.copyOf(escalations);
	}
}
