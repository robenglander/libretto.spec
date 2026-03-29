package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** {@code source} block (behavior, acceptance test, implementation directive). */
public record ProjectedSourceBlock(List<ProjectedSourceItem> items) {

	public ProjectedSourceBlock {
		items = List.copyOf(Objects.requireNonNull(items, "items"));
	}
}
