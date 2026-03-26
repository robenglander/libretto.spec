package com.robenglander.libretto.spec.projection;

/**
 * {@code paramType name <paramName> as <JavaType> ;}
 */
public record ProjectedParamTypeRule(String paramName, ProjectedJavaType javaType)
		implements ProjectedSurfaceRule, ProjectedSurfaceElement {

	public ProjectedParamTypeRule {
		paramName = paramName == null ? "" : paramName.trim();
	}
}
