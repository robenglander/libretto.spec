package com.robenglander.libretto.spec.projection;

/** Portable view of {@code secondary} provider reference under {@code modelUsage}. */
public record ProjectedGenSecondaryProvider(String name) {

	public ProjectedGenSecondaryProvider {
		name = name == null ? "" : name.trim();
	}
}
