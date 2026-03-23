package com.robenglander.libretto.spec.projection;

import java.util.List;

/** One {@code out_of_scope_item} ({@code OOS-ddd}). */
public record ProjectedOutOfScopeRecord(String id, List<String> statements) {

	public ProjectedOutOfScopeRecord {
		id = id == null ? "" : id.trim();
		statements = statements == null ? List.of() : List.copyOf(statements);
	}
}
