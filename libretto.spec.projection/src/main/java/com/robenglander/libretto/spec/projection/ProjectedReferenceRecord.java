package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** One {@code reference} record ({@code REF-ddd}). */
public record ProjectedReferenceRecord(String refId, List<ProjectedReferenceItem> items) {

	public ProjectedReferenceRecord {
		refId = ProjectionStrings.requireNonBlank(refId, "refId");
		items = List.copyOf(Objects.requireNonNull(items, "items"));
	}
}
