package com.robenglander.libretto.spec.projection;

import java.util.List;

/** {@code operation_surface} section. */
public record ProjectedOperationSurfaceSection(List<ProjectedOperationSurfaceRecord> operations) implements ProjectedSpecSection {

	public ProjectedOperationSurfaceSection {
		operations = operations == null ? List.of() : List.copyOf(operations);
	}
}
