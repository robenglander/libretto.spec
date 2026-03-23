package com.robenglander.libretto.spec.projection;

import java.util.List;

/** {@code implements_surface} section. */
public record ProjectedImplementsSurfaceSection(List<ProjectedImplementsSurfaceRecord> records) implements ProjectedSpecSection {

	public ProjectedImplementsSurfaceSection {
		records = records == null ? List.of() : List.copyOf(records);
	}
}
