package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** One {@code boundary} record (exports or imports). */
public record ProjectedBoundaryRecord(List<ProjectedBoundaryItem> items) {

	public ProjectedBoundaryRecord {
		items = List.copyOf(Objects.requireNonNull(items, "items"));
	}
}
