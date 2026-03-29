package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** One {@code out_of_scope_item} ({@code OOS-ddd}). */
public record ProjectedOutOfScopeRecord(String id, List<String> statements) {

	public ProjectedOutOfScopeRecord {
		id = ProjectionStrings.requireNonBlank(id, "id");
		statements = List.copyOf(Objects.requireNonNull(statements, "statements"));
	}
}
