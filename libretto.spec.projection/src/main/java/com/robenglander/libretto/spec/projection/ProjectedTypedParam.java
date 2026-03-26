package com.robenglander.libretto.spec.projection;

/**
 * Parameter in an {@link ProjectedOperationSignature} ({@code TypedParam}: type then name).
 */
public record ProjectedTypedParam(ProjectedJavaType type, String paramName) {

	public ProjectedTypedParam {
		paramName = paramName == null ? "" : paramName.trim();
	}
}
