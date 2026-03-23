package com.robenglander.libretto.spec.projection;

/** Item inside {@code subsection_context}. */
public sealed interface ProjectedSubsectionContextItem permits
		ProjectedSubsectionContextItem.SectionLine,
		ProjectedSubsectionContextItem.SubsectionLine,
		ProjectedSubsectionContextItem.TextBody {

	record SectionLine(String sectionLabel) implements ProjectedSubsectionContextItem {
		public SectionLine {
			sectionLabel = sectionLabel == null ? "" : sectionLabel;
		}
	}

	record SubsectionLine(String subsectionLabel) implements ProjectedSubsectionContextItem {
		public SubsectionLine {
			subsectionLabel = subsectionLabel == null ? "" : subsectionLabel;
		}
	}

	record TextBody(String text) implements ProjectedSubsectionContextItem {
		public TextBody {
			text = text == null ? "" : text;
		}
	}
}
