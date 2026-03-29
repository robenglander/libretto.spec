package com.robenglander.libretto.spec.projection;

/** Portable view of {@code correction} STRING inside remediation {@code rule} or {@code default}. */
public record ProjectedGenRemediationCorrection(String correction) {

	public ProjectedGenRemediationCorrection {
		correction = ProjectionStrings.requireNonBlank(correction, "correction");
	}
}
