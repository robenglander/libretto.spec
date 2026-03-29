package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** {@code acceptance_tests} section. */
public record ProjectedAcceptanceTestsSection(List<ProjectedAcceptanceTestRecord> tests) implements ProjectedSpecSection {

	public ProjectedAcceptanceTestsSection {
		tests = List.copyOf(Objects.requireNonNull(tests, "tests"));
	}
}
