package com.robenglander.libretto.spec.projection;

/**
 * A rule inside {@link ProjectedScopedSurface} ({@code SurfaceRule} in the grammar).
 */
public sealed interface ProjectedSurfaceRule permits ProjectedReturnTypeRule, ProjectedParamTypeRule,
		ProjectedRecordSelfReturnRule, ProjectedMethodOverrideRule {
}
