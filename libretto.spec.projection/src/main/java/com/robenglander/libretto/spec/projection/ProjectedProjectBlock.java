package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code project { rootDir; modules { … } testgen { … } }}.
 */
public record ProjectedProjectBlock(
		String rootDir,
		List<ProjectedProjectModuleEntry> modules,
		ProjectedTestGenBlock testGen) {

	public ProjectedProjectBlock {
		rootDir = rootDir == null ? "" : rootDir.trim();
		modules = modules == null ? List.of() : List.copyOf(modules);
	}
}
