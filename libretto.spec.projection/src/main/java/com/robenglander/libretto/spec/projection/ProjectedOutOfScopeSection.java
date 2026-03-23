package com.robenglander.libretto.spec.projection;

import java.util.List;

/** {@code out_of_scope} section. */
public record ProjectedOutOfScopeSection(List<ProjectedOutOfScopeRecord> items) implements ProjectedSpecSection {

	public ProjectedOutOfScopeSection {
		items = items == null ? List.of() : List.copyOf(items);
	}
}
