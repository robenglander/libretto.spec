package com.robenglander.libretto.spec.projection;

import java.util.List;

/** Portable view of {@code escalation { enabled* atRetry* }} inside {@code modelUsage}. */
public record ProjectedGenEscalationBlock(
		List<ProjectedGenEnabled> enableds,
		List<ProjectedGenAtRetry> atRetries) {

	public ProjectedGenEscalationBlock {
		enableds = enableds == null ? List.of() : List.copyOf(enableds);
		atRetries = atRetries == null ? List.of() : List.copyOf(atRetries);
	}
}
