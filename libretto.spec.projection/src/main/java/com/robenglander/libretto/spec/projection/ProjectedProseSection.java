package com.robenglander.libretto.spec.projection;

import java.util.List;

/** {@code prose} section. */
public record ProjectedProseSection(List<ProjectedProseRecord> records) implements ProjectedSpecSection {

	public ProjectedProseSection {
		records = records == null ? List.of() : List.copyOf(records);
	}
}
