package com.robenglander.libretto.spec.projection;

/** Portable view of {@code model} STRING under {@code provider}. */
public record ProjectedLlmModel(String mode) {

	public ProjectedLlmModel {
		mode = mode == null ? "" : mode.trim();
	}
}
