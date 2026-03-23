package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * One {@code implements} line group: {@code implements target_spec ...} (grammar allows multiple
 * {@code ImplementsSurfaceRecordItem} per record).
 */
public record ProjectedImplementsSurfaceRecord(List<String> targetSpecs) {

	public ProjectedImplementsSurfaceRecord {
		targetSpecs = targetSpecs == null ? List.of() : List.copyOf(targetSpecs);
	}
}
