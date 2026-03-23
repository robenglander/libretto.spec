package com.robenglander.libretto.spec.projection;

import java.util.List;

/** One {@code acceptance_test} record ({@code AT-ddd}). */
public record ProjectedAcceptanceTestRecord(String testId, List<ProjectedAcceptanceTestItem> items) {

	public ProjectedAcceptanceTestRecord {
		testId = testId == null ? "" : testId.trim();
		items = items == null ? List.of() : List.copyOf(items);
	}
}
