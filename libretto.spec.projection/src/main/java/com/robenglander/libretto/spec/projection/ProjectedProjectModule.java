package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code module ValidID { … }} under {@code modules}.
 */
public record ProjectedProjectModule(
		String name,
		List<ProjectedModuleDir> dirs,
		List<ProjectedModuleSpecDir> specDirs,
		List<ProjectedModuleTestDir> testDirs,
		List<ProjectedModuleMainDir> mainDirs,
		List<ProjectedModuleBasePackage> basePackages) {

	public ProjectedProjectModule {
		name = name == null ? "" : name.trim();
		dirs = dirs == null ? List.of() : List.copyOf(dirs);
		specDirs = specDirs == null ? List.of() : List.copyOf(specDirs);
		testDirs = testDirs == null ? List.of() : List.copyOf(testDirs);
		mainDirs = mainDirs == null ? List.of() : List.copyOf(mainDirs);
		basePackages = basePackages == null ? List.of() : List.copyOf(basePackages);
	}
}
