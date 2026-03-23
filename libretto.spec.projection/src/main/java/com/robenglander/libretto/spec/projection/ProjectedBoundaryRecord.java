package com.robenglander.libretto.spec.projection;

import java.util.List;

/** One {@code boundary} record (exports or imports). */
public record ProjectedBoundaryRecord(List<ProjectedBoundaryItem> items) {

	public ProjectedBoundaryRecord {
		items = items == null ? List.of() : List.copyOf(items);
	}
}
