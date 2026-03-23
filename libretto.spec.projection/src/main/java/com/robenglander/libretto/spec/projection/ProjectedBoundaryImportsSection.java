package com.robenglander.libretto.spec.projection;

import java.util.List;

/** {@code boundary_imports} section. */
public record ProjectedBoundaryImportsSection(List<ProjectedBoundaryRecord> boundaries) implements ProjectedSpecSection {

	public ProjectedBoundaryImportsSection {
		boundaries = boundaries == null ? List.of() : List.copyOf(boundaries);
	}
}
