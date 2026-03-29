package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** One {@code operation} record inside {@code operation_surface}. */
public record ProjectedOperationSurfaceRecord(String operationId, List<ProjectedOperationSurfaceItem> items) {

	public ProjectedOperationSurfaceRecord {
		operationId = ProjectionStrings.requireNonBlank(operationId, "operationId");
		items = List.copyOf(Objects.requireNonNull(items, "items"));
	}
}
