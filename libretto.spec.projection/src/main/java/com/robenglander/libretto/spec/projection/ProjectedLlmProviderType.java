package com.robenglander.libretto.spec.projection;

/** Portable view of {@code type ValidID} under {@code provider}. */
public record ProjectedLlmProviderType(String name) {

	public ProjectedLlmProviderType {
		name = ProjectionStrings.requireNonBlank(name, "type");
	}
}
