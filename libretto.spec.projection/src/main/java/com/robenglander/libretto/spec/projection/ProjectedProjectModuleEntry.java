package com.robenglander.libretto.spec.projection;

/**
 * Portable view of {@code module "id" { dir; specsDir; … }}.
 */
public record ProjectedProjectModuleEntry(
		String name,
		String dir,
		String specsDir,
		String testsDir,
		String mainJavaDir,
		String basePackage) {

	public ProjectedProjectModuleEntry {
		name = name == null ? "" : name.trim();
		dir = dir == null ? "" : dir.trim();
		specsDir = specsDir == null ? "" : specsDir.trim();
		testsDir = testsDir == null ? "" : testsDir.trim();
		mainJavaDir = mainJavaDir == null ? "" : mainJavaDir.trim();
		basePackage = basePackage == null ? "" : basePackage.trim();
	}
}
