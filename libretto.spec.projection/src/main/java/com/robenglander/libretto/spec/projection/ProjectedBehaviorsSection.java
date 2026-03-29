package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** {@code behaviors} section. */
public record ProjectedBehaviorsSection(List<ProjectedBehaviorRecord> behaviors) implements ProjectedSpecSection {

	public ProjectedBehaviorsSection {
		behaviors = List.copyOf(Objects.requireNonNull(behaviors, "behaviors"));
	}
}
