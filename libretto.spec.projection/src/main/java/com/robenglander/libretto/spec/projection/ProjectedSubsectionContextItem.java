package com.robenglander.libretto.spec.projection;

/** Item inside {@code subsection_context}. */
public sealed interface ProjectedSubsectionContextItem permits
		ProjectedSubsectionContextItem.SectionLine,
		ProjectedSubsectionContextItem.SubsectionLine,
		ProjectedSubsectionContextItem.TextBody {

	record SectionLine(String sectionLabel) implements ProjectedSubsectionContextItem {
		public SectionLine {
			sectionLabel = ProjectionStrings.requireNonBlank(sectionLabel, "sectionLabel");
		}
	}

	record SubsectionLine(String subsectionLabel) implements ProjectedSubsectionContextItem {
		public SubsectionLine {
			subsectionLabel = ProjectionStrings.requireNonBlank(subsectionLabel, "subsectionLabel");
		}
	}

	record TextBody(String text) implements ProjectedSubsectionContextItem {
		public TextBody {
			text = ProjectionStrings.requireNonNullTrim(text, "text");
		}
	}
}
