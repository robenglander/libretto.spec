package com.robenglander.libretto.spec.projection;

/**
 * Portable view of {@code escalation { … }} under testgen usage.
 */
public record ProjectedTestGenEscalation(
		boolean enabled,
		int escalateAtRetry,
		boolean targetSecondary) {
}
