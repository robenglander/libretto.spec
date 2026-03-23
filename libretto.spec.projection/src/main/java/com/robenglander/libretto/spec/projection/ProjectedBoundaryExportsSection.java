package com.robenglander.libretto.spec.projection;

import java.util.List;

/** {@code boundary_exports} section. */
public record ProjectedBoundaryExportsSection(List<ProjectedBoundaryRecord> boundaries) implements ProjectedSpecSection {

	public ProjectedBoundaryExportsSection {
		boundaries = boundaries == null ? List.of() : List.copyOf(boundaries);
	}
}
