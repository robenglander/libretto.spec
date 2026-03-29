package com.robenglander.libretto.spec.projection;

import java.util.Objects;

/**
 * Portable view of {@code project { rootdir* modules* gen* }} under validator-clean LPP: one each of rootDir,
 * modules, and gen.
 */
public record ProjectedProjectBlock(
		ProjectedRootDirectory rootDir,
		ProjectedModulesBlock modules,
		ProjectedGenBlock gen) {

	public ProjectedProjectBlock {
		rootDir = Objects.requireNonNull(rootDir, "rootDir");
		modules = Objects.requireNonNull(modules, "modules");
		gen = Objects.requireNonNull(gen, "gen");
	}
}
