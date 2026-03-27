package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code module id { dir* specDir* testDir* mainDir* basePackage* }}.
 */
public record ProjectedProjectModuleEntry(
		String name,
		List<String> dirs,
		List<String> specDirs,
		List<String> testDirs,
		List<String> mainDirs,
		List<String> basePackages) {

	public ProjectedProjectModuleEntry {
		name = name == null ? "" : name.trim();
		dirs = normalizeList(dirs);
		specDirs = normalizeList(specDirs);
		testDirs = normalizeList(testDirs);
		mainDirs = normalizeList(mainDirs);
		basePackages = normalizeList(basePackages);
	}

	private static List<String> normalizeList(List<String> in) {
		if (in == null || in.isEmpty()) {
			return List.of();
		}
		return List.copyOf(in.stream().map(s -> s == null ? "" : s.trim()).toList());
	}
}
