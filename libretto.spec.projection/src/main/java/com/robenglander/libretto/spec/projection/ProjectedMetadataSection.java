package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * {@code metadata} block: fields may repeat in the grammar; validation enforces structure.
 */
public record ProjectedMetadataSection(List<ProjectedMetadataField> fields) implements ProjectedSpecSection {

	public ProjectedMetadataSection {
		fields = fields == null ? List.of() : List.copyOf(fields);
	}
}
