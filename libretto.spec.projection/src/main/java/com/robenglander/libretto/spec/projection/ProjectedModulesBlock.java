package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/**
 * Portable view of {@code modules { module … }} inside {@code project}.
 */
public record ProjectedModulesBlock(List<ProjectedProjectModule> modules) {

	public ProjectedModulesBlock {
		modules = List.copyOf(Objects.requireNonNull(modules, "modules"));
	}
}
