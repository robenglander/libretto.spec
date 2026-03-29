package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** One {@code acceptance_test} record ({@code AT-ddd}). */
public record ProjectedAcceptanceTestRecord(String testId, List<ProjectedAcceptanceTestItem> items) {

	public ProjectedAcceptanceTestRecord {
		testId = ProjectionStrings.requireNonBlank(testId, "testId");
		items = List.copyOf(Objects.requireNonNull(items, "items"));
	}
}
