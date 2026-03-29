package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/**
 * {@code metadata} block: fields may repeat in the grammar; validation enforces structure.
 */
public record ProjectedMetadataSection(List<ProjectedMetadataField> fields) implements ProjectedSpecSection {

	public ProjectedMetadataSection {
		fields = List.copyOf(Objects.requireNonNull(fields, "fields"));
	}
}
