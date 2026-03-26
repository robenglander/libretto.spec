package com.robenglander.libretto.spec.projection;

/**
 * {@code returnType method <name> as <JavaType> ;}
 *
 * @param methodName  method identifier from the grammar
 */
public record ProjectedReturnTypeRule(String methodName, ProjectedJavaType javaType)
		implements ProjectedSurfaceRule, ProjectedSurfaceElement {

	public ProjectedReturnTypeRule {
		methodName = methodName == null ? "" : methodName.trim();
	}
}
