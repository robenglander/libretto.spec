package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * {@code recordSelfReturn <id>, … ;}
 */
public record ProjectedRecordSelfReturnRule(List<String> methodNames)
		implements ProjectedSurfaceRule, ProjectedSurfaceElement {

	public ProjectedRecordSelfReturnRule {
		methodNames = methodNames == null ? List.of()
				: List.copyOf(methodNames.stream().map(s -> s == null ? "" : s.trim()).toList());
	}
}
