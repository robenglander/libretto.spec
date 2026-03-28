package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Portable view of {@code modules { module … }} inside {@code project}.
 */
public record ProjectedModulesBlock(List<ProjectedProjectModule> modules) {

	public ProjectedModulesBlock {
		modules = modules == null ? List.of() : List.copyOf(modules);
	}
}
