package com.robenglander.libretto.spec.projection;

/** Portable view of {@code dir} under {@code module}. */
public record ProjectedModuleDir(String dir) {

	public ProjectedModuleDir {
		dir = dir == null ? "" : dir.trim();
	}
}
