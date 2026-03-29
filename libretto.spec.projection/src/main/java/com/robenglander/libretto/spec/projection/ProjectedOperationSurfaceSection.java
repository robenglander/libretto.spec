package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** {@code operation_surface} section. */
public record ProjectedOperationSurfaceSection(List<ProjectedOperationSurfaceRecord> operations) implements ProjectedSpecSection {

	public ProjectedOperationSurfaceSection {
		operations = List.copyOf(Objects.requireNonNull(operations, "operations"));
	}
}
