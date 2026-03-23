package com.robenglander.libretto.spec.projection;

import java.util.List;

/** Either {@code section_context} or {@code subsection_context}. */
public sealed interface ProjectedProseRecord permits
		ProjectedProseRecord.SectionContext,
		ProjectedProseRecord.SubsectionContext {

	record SectionContext(List<ProjectedSectionContextItem> items) implements ProjectedProseRecord {
		public SectionContext {
			items = items == null ? List.of() : List.copyOf(items);
		}
	}

	record SubsectionContext(List<ProjectedSubsectionContextItem> items) implements ProjectedProseRecord {
		public SubsectionContext {
			items = items == null ? List.of() : List.copyOf(items);
		}
	}
}
