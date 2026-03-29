package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** {@code dependencies} section. */
public record ProjectedDependenciesSection(List<ProjectedDependencyRecord> dependencies) implements ProjectedSpecSection {

	public ProjectedDependenciesSection {
		dependencies = List.copyOf(Objects.requireNonNull(dependencies, "dependencies"));
	}
}
