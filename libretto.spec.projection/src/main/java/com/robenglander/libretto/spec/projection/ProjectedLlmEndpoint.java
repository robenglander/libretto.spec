package com.robenglander.libretto.spec.projection;

/** Portable view of {@code endPoint} STRING under {@code provider}. */
public record ProjectedLlmEndpoint(String mode) {

	public ProjectedLlmEndpoint {
		mode = mode == null ? "" : mode.trim();
	}
}
