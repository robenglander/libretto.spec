package com.robenglander.libretto.spec.projection;

import java.util.List;

/** One {@code reference} record ({@code REF-ddd}). */
public record ProjectedReferenceRecord(String refId, List<ProjectedReferenceItem> items) {

	public ProjectedReferenceRecord {
		refId = refId == null ? "" : refId.trim();
		items = items == null ? List.of() : List.copyOf(items);
	}
}
