package com.robenglander.libretto.spec.projection;

/** Portable view of {@code basepackage | basePackage} (STRING value) under {@code module}. */
public record ProjectedModuleBasePackage(String value) {

	public ProjectedModuleBasePackage {
		value = ProjectionStrings.requireNonBlank(value, "basePackage");
	}
}
