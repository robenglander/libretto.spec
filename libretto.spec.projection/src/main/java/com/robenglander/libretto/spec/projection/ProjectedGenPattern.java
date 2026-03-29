package com.robenglander.libretto.spec.projection;

/** Portable view of {@code pattern} STRING inside a {@code rule} block. */
public record ProjectedGenPattern(String pattern) {

	public ProjectedGenPattern {
		pattern = ProjectionStrings.requireNonBlank(pattern, "pattern");
	}
}
