package com.robenglander.libretto.spec.projection;

/** Portable view of {@code testdir | testDir} under {@code module}. */
public record ProjectedModuleTestDir(String dir) {

	public ProjectedModuleTestDir {
		dir = dir == null ? "" : dir.trim();
	}
}
