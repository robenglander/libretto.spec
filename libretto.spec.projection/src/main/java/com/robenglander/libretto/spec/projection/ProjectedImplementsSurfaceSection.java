package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** {@code implements_surface} section. */
public record ProjectedImplementsSurfaceSection(List<ProjectedImplementsSurfaceRecord> records) implements ProjectedSpecSection {

	public ProjectedImplementsSurfaceSection {
		records = List.copyOf(Objects.requireNonNull(records, "records"));
	}
}
