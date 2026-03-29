package com.robenglander.libretto.spec.projection;

import java.util.Objects;

/** Portable view of {@code default { … }} inside {@code rules}. */
public record ProjectedGenDefaultRemediationRule(
		ProjectedGenRemediationCode code,
		ProjectedGenRemediationCorrection correction) {

	public ProjectedGenDefaultRemediationRule {
		code = Objects.requireNonNull(code, "code");
		correction = Objects.requireNonNull(correction, "correction");
	}
}
