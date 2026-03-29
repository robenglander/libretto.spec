package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** {@code boundary_exports} section. */
public record ProjectedBoundaryExportsSection(List<ProjectedBoundaryRecord> boundaries) implements ProjectedSpecSection {

	public ProjectedBoundaryExportsSection {
		boundaries = List.copyOf(Objects.requireNonNull(boundaries, "boundaries"));
	}
}
