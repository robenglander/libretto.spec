package com.robenglander.libretto.spec.projection;

import java.util.List;

/** One {@code implementation_directive} record ({@code ID-ddd}). */
public record ProjectedImplementationDirectiveRecord(String directiveId, List<ProjectedImplementationDirectiveItem> items) {

	public ProjectedImplementationDirectiveRecord {
		directiveId = directiveId == null ? "" : directiveId.trim();
		items = items == null ? List.of() : List.copyOf(items);
	}
}
