package com.robenglander.libretto.spec.projection;

import java.util.List;

/** {@code implementation_directives} section. */
public record ProjectedImplementationDirectivesSection(List<ProjectedImplementationDirectiveRecord> directives)
		implements ProjectedSpecSection {

	public ProjectedImplementationDirectivesSection {
		directives = directives == null ? List.of() : List.copyOf(directives);
	}
}
