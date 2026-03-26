package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Dot-separated type ({@code QualifiedName} in the grammar).
 *
 * @param segments  identifier segments, e.g. {@code [java, time, YearMonth]}
 */
public record ProjectedQualifiedJavaType(List<String> segments) implements ProjectedJavaType {

	public ProjectedQualifiedJavaType {
		segments = segments == null ? List.of() : List.copyOf(segments);
	}
}
