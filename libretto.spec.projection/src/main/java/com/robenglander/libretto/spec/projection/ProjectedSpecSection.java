package com.robenglander.libretto.spec.projection;

/**
 * One top-level {@code SpecSection} from the grammar, in document order.
 */
public sealed interface ProjectedSpecSection permits
		ProjectedMetadataSection,
		ProjectedDependenciesSection,
		ProjectedReferencesSection,
		ProjectedProseSection,
		ProjectedOutOfScopeSection,
		ProjectedOperationSurfaceSection,
		ProjectedImplementsSurfaceSection,
		ProjectedBoundaryExportsSection,
		ProjectedBoundaryImportsSection,
		ProjectedBehaviorsSection,
		ProjectedAcceptanceTestsSection,
		ProjectedImplementationDirectivesSection {
}
