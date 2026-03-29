package com.robenglander.libretto.spec.projection;

/** Portable view of {@code specdir | specDir} under {@code module}. */
public record ProjectedModuleSpecDir(String dir) {

	public ProjectedModuleSpecDir {
		dir = ProjectionStrings.requireNonBlank(dir, "specDir");
	}
}
