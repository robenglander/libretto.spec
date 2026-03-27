package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code project { rootDir* modules* gen* }} preserving block order as lists.
 */
public record ProjectedProjectBlock(
		List<String> rootDirs,
		List<ProjectedModulesBlock> modulesBlocks,
		List<ProjectedGenBlock> genBlocks) {

	public ProjectedProjectBlock {
		rootDirs = normalizeStrings(rootDirs);
		modulesBlocks = modulesBlocks == null ? List.of() : List.copyOf(modulesBlocks);
		genBlocks = genBlocks == null ? List.of() : List.copyOf(genBlocks);
	}

	private static List<String> normalizeStrings(List<String> in) {
		if (in == null || in.isEmpty()) {
			return List.of();
		}
		return List.copyOf(in.stream().map(s -> s == null ? "" : s.trim()).toList());
	}
}
