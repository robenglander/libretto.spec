package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** {@code out_of_scope} section. */
public record ProjectedOutOfScopeSection(List<ProjectedOutOfScopeRecord> items) implements ProjectedSpecSection {

	public ProjectedOutOfScopeSection {
		items = List.copyOf(Objects.requireNonNull(items, "items"));
	}
}
