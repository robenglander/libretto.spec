package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** {@code prose} section. */
public record ProjectedProseSection(List<ProjectedProseRecord> records) implements ProjectedSpecSection {

	public ProjectedProseSection {
		records = List.copyOf(Objects.requireNonNull(records, "records"));
	}
}
