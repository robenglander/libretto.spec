package com.robenglander.libretto.spec.projection;

import java.util.Objects;
import java.util.Optional;

/**
 * Portable view of one {@code modelUsage { … }} under {@code gen}. Matches valid LPP: one top-level {@code provider},
 * one {@code maxRetries}, and at most one {@code escalationTo <name>}. The canonical projection keeps the first
 * {@code modelUsage} under {@code gen} only (see
 * {@link com.robenglander.libretto.spec.projection.mapper.LibrettoProjectProfileProjectionMapper}).
 */
public record ProjectedGenUsageBlock(
		ProjectedGenProvider provider,
		ProjectedGenMaxRetries maxRetries,
		Optional<ProjectedGenEscalationTo> escalationTo) {

	public ProjectedGenUsageBlock {
		provider = Objects.requireNonNull(provider, "provider");
		maxRetries = Objects.requireNonNull(maxRetries, "maxRetries");
		escalationTo = Objects.requireNonNull(escalationTo, "escalationTo");
	}

	/** Structural shell for tests; not a validator-clean {@code modelUsage} block. */
	public static ProjectedGenUsageBlock empty() {
		return new ProjectedGenUsageBlock(
				new ProjectedGenProvider("shell"),
				new ProjectedGenMaxRetries(0),
				Optional.empty());
	}
}
