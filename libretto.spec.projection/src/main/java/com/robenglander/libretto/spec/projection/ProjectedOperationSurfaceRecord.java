package com.robenglander.libretto.spec.projection;

import java.util.List;

/** One {@code operation} record inside {@code operation_surface}. */
public record ProjectedOperationSurfaceRecord(String operationId, List<ProjectedOperationSurfaceItem> items) {

	public ProjectedOperationSurfaceRecord {
		operationId = operationId == null ? "" : operationId.trim();
		items = items == null ? List.of() : List.copyOf(items);
	}
}
