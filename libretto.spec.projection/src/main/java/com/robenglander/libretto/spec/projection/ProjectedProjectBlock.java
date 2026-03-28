package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code project { rootdir* modules* gen* }} preserving statement order per section kind.
 */
public record ProjectedProjectBlock(
		List<ProjectedRootDirectory> rootDirs,
		List<ProjectedModulesBlock> modulesBlocks,
		List<ProjectedGenBlock> genBlocks) {

	public ProjectedProjectBlock {
		rootDirs = rootDirs == null ? List.of() : List.copyOf(rootDirs);
		modulesBlocks = modulesBlocks == null ? List.of() : List.copyOf(modulesBlocks);
		genBlocks = genBlocks == null ? List.of() : List.copyOf(genBlocks);
	}
}
