package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** Either {@code section_context} or {@code subsection_context}. */
public sealed interface ProjectedProseRecord permits
		ProjectedProseRecord.SectionContext,
		ProjectedProseRecord.SubsectionContext {

	record SectionContext(List<ProjectedSectionContextItem> items) implements ProjectedProseRecord {
		public SectionContext {
			items = List.copyOf(Objects.requireNonNull(items, "items"));
		}
	}

	record SubsectionContext(List<ProjectedSubsectionContextItem> items) implements ProjectedProseRecord {
		public SubsectionContext {
			items = List.copyOf(Objects.requireNonNull(items, "items"));
		}
	}
}
