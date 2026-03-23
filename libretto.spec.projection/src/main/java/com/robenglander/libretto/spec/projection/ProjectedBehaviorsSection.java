package com.robenglander.libretto.spec.projection;

import java.util.List;

/** {@code behaviors} section. */
public record ProjectedBehaviorsSection(List<ProjectedBehaviorRecord> behaviors) implements ProjectedSpecSection {

	public ProjectedBehaviorsSection {
		behaviors = behaviors == null ? List.of() : List.copyOf(behaviors);
	}
}
