package com.robenglander.libretto.spec.projection;

/**
 * Portable view of a {@code provider} name reference under {@code modelUsage} or inside {@code escalation}.
 */
public record ProjectedGenProvider(String name) {

	public ProjectedGenProvider {
		name = ProjectionStrings.requireNonBlank(name, "name");
	}
}
