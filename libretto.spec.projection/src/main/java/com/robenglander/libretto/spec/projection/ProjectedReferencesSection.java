package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** {@code references} section. */
public record ProjectedReferencesSection(List<ProjectedReferenceRecord> references) implements ProjectedSpecSection {

	public ProjectedReferencesSection {
		references = List.copyOf(Objects.requireNonNull(references, "references"));
	}
}
