package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** {@code boundary_imports} section. */
public record ProjectedBoundaryImportsSection(List<ProjectedBoundaryRecord> boundaries) implements ProjectedSpecSection {

	public ProjectedBoundaryImportsSection {
		boundaries = List.copyOf(Objects.requireNonNull(boundaries, "boundaries"));
	}
}
