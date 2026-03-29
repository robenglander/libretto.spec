package com.robenglander.libretto.spec.projection;

import java.util.Objects;

/**
 * Portable view of {@code escalationTo <name>} under {@code modelUsage} (optional; at most one in valid LPP).
 */
public record ProjectedGenEscalationTo(String providerName) {

	public ProjectedGenEscalationTo {
		Objects.requireNonNull(providerName, "providerName");
		String t = providerName.trim();
		if (t.isEmpty()) {
			throw new IllegalArgumentException("providerName must not be blank");
		}
		providerName = t;
	}
}
