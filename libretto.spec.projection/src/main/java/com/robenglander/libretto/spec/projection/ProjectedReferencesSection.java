package com.robenglander.libretto.spec.projection;

import java.util.List;

/** {@code references} section. */
public record ProjectedReferencesSection(List<ProjectedReferenceRecord> references) implements ProjectedSpecSection {

	public ProjectedReferencesSection {
		references = references == null ? List.of() : List.copyOf(references);
	}
}
