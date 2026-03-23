package com.robenglander.libretto.spec.projection;

import java.util.List;

/** {@code source} block (behavior, acceptance test, implementation directive). */
public record ProjectedSourceBlock(List<ProjectedSourceItem> items) {

	public ProjectedSourceBlock {
		items = items == null ? List.of() : List.copyOf(items);
	}
}
