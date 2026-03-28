package com.robenglander.libretto.spec.projection;

/** Portable view of {@code primary} provider reference under {@code modelUsage}. */
public record ProjectedGenPrimaryProvider(String name) {

	public ProjectedGenPrimaryProvider {
		name = name == null ? "" : name.trim();
	}
}
