package com.robenglander.libretto.spec.projection;

import java.util.List;

/** {@code dependencies} section. */
public record ProjectedDependenciesSection(List<ProjectedDependencyRecord> dependencies) implements ProjectedSpecSection {

	public ProjectedDependenciesSection {
		dependencies = dependencies == null ? List.of() : List.copyOf(dependencies);
	}
}
