package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * Method name and formal parameters for {@link ProjectedMethodOverrideRule}.
 */
public record ProjectedOperationSignature(String name, List<ProjectedTypedParam> params) {

	public ProjectedOperationSignature {
		name = name == null ? "" : name.trim();
		params = params == null ? List.of() : List.copyOf(params);
	}
}
