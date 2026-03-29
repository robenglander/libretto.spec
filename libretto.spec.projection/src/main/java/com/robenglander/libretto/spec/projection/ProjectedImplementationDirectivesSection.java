package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** {@code implementation_directives} section. */
public record ProjectedImplementationDirectivesSection(List<ProjectedImplementationDirectiveRecord> directives)
		implements ProjectedSpecSection {

	public ProjectedImplementationDirectivesSection {
		directives = List.copyOf(Objects.requireNonNull(directives, "directives"));
	}
}
