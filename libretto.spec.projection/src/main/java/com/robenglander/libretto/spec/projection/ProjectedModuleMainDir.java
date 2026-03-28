package com.robenglander.libretto.spec.projection;

/** Portable view of {@code maindir | mainDir} under {@code module}. */
public record ProjectedModuleMainDir(String dir) {

	public ProjectedModuleMainDir {
		dir = dir == null ? "" : dir.trim();
	}
}
