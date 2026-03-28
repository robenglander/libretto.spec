package com.robenglander.libretto.spec.projection;

/** Portable view of {@code enabled} true/false under {@code escalation}. */
public record ProjectedGenEnabled(String value) {

	public ProjectedGenEnabled {
		value = value == null ? "" : value.trim();
	}
}
