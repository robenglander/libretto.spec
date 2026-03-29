package com.robenglander.libretto.spec.projection;

/** Portable view of {@code module} name ({@code ValidID}) under {@code modules}. */
public record ProjectedModuleName(String name) {

	public ProjectedModuleName {
		name = ProjectionStrings.requireNonBlank(name, "name");
	}
}
