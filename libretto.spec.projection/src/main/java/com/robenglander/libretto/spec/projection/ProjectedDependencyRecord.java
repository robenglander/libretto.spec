package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** One {@code dependency} record. */
public record ProjectedDependencyRecord(String id, List<ProjectedDependencyItem> items) {

	public ProjectedDependencyRecord {
		id = ProjectionStrings.requireNonBlank(id, "id");
		items = List.copyOf(Objects.requireNonNull(items, "items"));
	}
}
