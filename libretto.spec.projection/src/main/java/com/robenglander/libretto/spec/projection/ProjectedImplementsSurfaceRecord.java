package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/**
 * One {@code implements} line group: {@code implements target_spec ...} (grammar allows multiple
 * {@code ImplementsSurfaceRecordItem} per record).
 */
public record ProjectedImplementsSurfaceRecord(List<String> targetSpecs) {

	public ProjectedImplementsSurfaceRecord {
		targetSpecs = List.copyOf(Objects.requireNonNull(targetSpecs, "targetSpecs"));
	}
}
