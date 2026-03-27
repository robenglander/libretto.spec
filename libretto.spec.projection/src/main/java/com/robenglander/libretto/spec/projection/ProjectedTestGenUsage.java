package com.robenglander.libretto.spec.projection;

/**
 * Portable view of {@code usage { primary … secondary … escalation … }} under testgen.
 */
public record ProjectedTestGenUsage(
		String primaryProvider,
		String secondaryProvider,
		ProjectedTestGenEscalation escalation) {

	public ProjectedTestGenUsage {
		primaryProvider = primaryProvider == null ? "" : primaryProvider.trim();
		secondaryProvider = secondaryProvider == null ? "" : secondaryProvider.trim();
	}
}
