package com.robenglander.libretto.spec.projection;

import java.util.Objects;

public record ProjectedProjectModule(
		ProjectedModuleName name,
		ProjectedModuleDir dir,
		ProjectedModuleSpecDir specDir,
		ProjectedModuleTestDir testDir,
		ProjectedModuleMainDir mainDir,
		ProjectedModuleBasePackage basePackage) {

	public ProjectedProjectModule {
		name = Objects.requireNonNull(name, "name");
		dir = Objects.requireNonNull(dir, "dir");
		specDir = Objects.requireNonNull(specDir, "specDir");
		testDir = Objects.requireNonNull(testDir, "testDir");
		mainDir = Objects.requireNonNull(mainDir, "mainDir");
		basePackage = Objects.requireNonNull(basePackage, "basePackage");
	}
}
