package com.robenglander.libretto.spec.projection;

/**
 * Java type in a project profile ({@code PrimitiveType} or {@code QualifiedName} in the grammar).
 */
public sealed interface ProjectedJavaType permits ProjectedPrimitiveJavaType, ProjectedQualifiedJavaType {
}
