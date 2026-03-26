package com.robenglander.libretto.spec.projection;

/**
 * {@code methodOverride <signature> returns <JavaType> ;}
 */
public record ProjectedMethodOverrideRule(ProjectedOperationSignature signature, ProjectedJavaType returnType)
		implements ProjectedSurfaceRule, ProjectedSurfaceElement {
}
