package com.robenglander.libretto.spec.projection;

import java.util.Objects;

/** Portable view of {@code rule { … }} inside {@code rules}. */
public record ProjectedGenPatternRemediationRule(
		ProjectedGenPattern pattern,
		ProjectedGenRemediationCode code,
		ProjectedGenRemediationCorrection correction) {

	public ProjectedGenPatternRemediationRule {
		pattern = Objects.requireNonNull(pattern, "pattern");
		code = Objects.requireNonNull(code, "code");
		correction = Objects.requireNonNull(correction, "correction");
	}
}
