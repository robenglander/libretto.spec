package com.robenglander.libretto.spec.projection;

import java.util.List;

/** One {@code behavior} record ({@code B-ddd}). */
public record ProjectedBehaviorRecord(String behaviorId, List<ProjectedBehaviorItem> items) {

	public ProjectedBehaviorRecord {
		behaviorId = behaviorId == null ? "" : behaviorId.trim();
		items = items == null ? List.of() : List.copyOf(items);
	}
}
