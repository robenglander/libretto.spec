package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** One {@code behavior} record ({@code B-ddd}). */
public record ProjectedBehaviorRecord(String behaviorId, List<ProjectedBehaviorItem> items) {

	public ProjectedBehaviorRecord {
		behaviorId = ProjectionStrings.requireNonBlank(behaviorId, "behaviorId");
		items = List.copyOf(Objects.requireNonNull(items, "items"));
	}
}
