package com.robenglander.libretto.spec.projection;

/** {@code section} or {@code subsection} line inside {@code source}. */
public sealed interface ProjectedSourceItem permits ProjectedSourceItem.SectionLine, ProjectedSourceItem.SubsectionLine {

	record SectionLine(String section) implements ProjectedSourceItem {
		public SectionLine {
			section = ProjectionStrings.requireNonBlank(section, "section");
		}
	}

	record SubsectionLine(String subsection) implements ProjectedSourceItem {
		public SubsectionLine {
			subsection = ProjectionStrings.requireNonBlank(subsection, "subsection");
		}
	}
}
