package com.robenglander.libretto.spec.projection;

import java.util.List;

/** One {@code dependency} record. */
public record ProjectedDependencyRecord(String id, List<ProjectedDependencyItem> items) {

	public ProjectedDependencyRecord {
		id = id == null ? "" : id.trim();
		items = items == null ? List.of() : List.copyOf(items);
	}
}
