package com.robenglander.libretto.spec.projection;

public sealed interface ProjectedDependencyItem permits ProjectedDependencyItem.TargetSpec, ProjectedDependencyItem.Notes {

	record TargetSpec(String targetSpec) implements ProjectedDependencyItem {
		public TargetSpec {
			targetSpec = ProjectionStrings.requireNonBlank(targetSpec, "targetSpec");
		}
	}

	record Notes(String notes) implements ProjectedDependencyItem {
		public Notes {
			notes = ProjectionStrings.requireNonNullTrim(notes, "notes");
		}
	}
}
