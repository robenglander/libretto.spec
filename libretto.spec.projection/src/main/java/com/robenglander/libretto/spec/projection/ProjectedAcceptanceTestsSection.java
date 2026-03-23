package com.robenglander.libretto.spec.projection;

import java.util.List;

/** {@code acceptance_tests} section. */
public record ProjectedAcceptanceTestsSection(List<ProjectedAcceptanceTestRecord> tests) implements ProjectedSpecSection {

	public ProjectedAcceptanceTestsSection {
		tests = tests == null ? List.of() : List.copyOf(tests);
	}
}
