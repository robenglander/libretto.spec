package com.robenglander.libretto.spec.projection;

/** Item inside {@code section_context}. */
public sealed interface ProjectedSectionContextItem permits
		ProjectedSectionContextItem.SectionLine,
		ProjectedSectionContextItem.TextBody {

	record SectionLine(String sectionLabel) implements ProjectedSectionContextItem {
		public SectionLine {
			sectionLabel = ProjectionStrings.requireNonBlank(sectionLabel, "sectionLabel");
		}
	}

	record TextBody(String text) implements ProjectedSectionContextItem {
		public TextBody {
			text = ProjectionStrings.requireNonNullTrim(text, "text");
		}
	}
}
