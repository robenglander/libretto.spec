package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** One {@code implementation_directive} record ({@code ID-ddd}). */
public record ProjectedImplementationDirectiveRecord(String directiveId, List<ProjectedImplementationDirectiveItem> items) {

	public ProjectedImplementationDirectiveRecord {
		directiveId = ProjectionStrings.requireNonBlank(directiveId, "directiveId");
		items = List.copyOf(Objects.requireNonNull(items, "items"));
	}
}
