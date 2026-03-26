package com.robenglander.libretto.spec.projection;

/**
 * One item in the {@code surface} block: a scope or a top-level rule.
 */
public sealed interface ProjectedSurfaceElement permits ProjectedScopedSurface, ProjectedReturnTypeRule,
		ProjectedParamTypeRule, ProjectedRecordSelfReturnRule, ProjectedMethodOverrideRule {
}
