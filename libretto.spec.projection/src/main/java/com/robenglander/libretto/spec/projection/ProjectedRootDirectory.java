package com.robenglander.libretto.spec.projection;

/**
 * Portable view of {@code rootdir | rootDir} path statement under {@code project}.
 */
public record ProjectedRootDirectory(String dir) {

	public ProjectedRootDirectory {
		dir = ProjectionStrings.requireNonBlank(dir, "rootDir");
	}
}
