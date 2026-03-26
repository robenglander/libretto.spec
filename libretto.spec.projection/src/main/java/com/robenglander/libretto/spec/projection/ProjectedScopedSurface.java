package com.robenglander.libretto.spec.projection;

import java.util.List;

/**
 * {@code for module "…" { … }} or {@code for spec "…" { … }}.
 *
 * @param scopeId  module or spec id string (decoded STRING literal)
 * @param rules    rules inside the block (never nested scopes)
 */
public record ProjectedScopedSurface(ProjectProfileScopeKind scopeKind, String scopeId, List<ProjectedSurfaceRule> rules)
		implements ProjectedSurfaceElement {

	public ProjectedScopedSurface {
		scopeKind = scopeKind == null ? ProjectProfileScopeKind.MODULE : scopeKind;
		scopeId = scopeId == null ? "" : scopeId.trim();
		rules = rules == null ? List.of() : List.copyOf(rules);
	}
}
