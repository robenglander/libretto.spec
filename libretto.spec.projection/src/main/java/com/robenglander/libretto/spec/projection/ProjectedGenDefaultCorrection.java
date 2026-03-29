package com.robenglander.libretto.spec.projection;

/** Portable view of {@code defaultCorrection} STRING under {@code gen}. */
public record ProjectedGenDefaultCorrection(String correction) {

	public ProjectedGenDefaultCorrection {
		correction = ProjectionStrings.requireNonBlank(correction, "correction");
	}
}
