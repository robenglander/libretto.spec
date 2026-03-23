package com.robenglander.libretto.spec.projection;

/**
 * One {@code ReferenceRecordItem} from the grammar ({@code type} uses a decoded identifier string).
 */
public sealed interface ProjectedReferenceItem permits
		ProjectedReferenceItem.Title,
		ProjectedReferenceItem.Type,
		ProjectedReferenceItem.Citation,
		ProjectedReferenceItem.Locator,
		ProjectedReferenceItem.AuthorityNotes,
		ProjectedReferenceItem.Metadata,
		ProjectedReferenceItem.Context {

	record Title(String title) implements ProjectedReferenceItem {
		public Title {
			title = title == null ? "" : title;
		}
	}

	record Type(String typeIdentifier) implements ProjectedReferenceItem {
		public Type {
			typeIdentifier = typeIdentifier == null ? "" : typeIdentifier;
		}
	}

	record Citation(String citation) implements ProjectedReferenceItem {
		public Citation {
			citation = citation == null ? "" : citation;
		}
	}

	record Locator(String locator) implements ProjectedReferenceItem {
		public Locator {
			locator = locator == null ? "" : locator;
		}
	}

	record AuthorityNotes(String authorityNotes) implements ProjectedReferenceItem {
		public AuthorityNotes {
			authorityNotes = authorityNotes == null ? "" : authorityNotes;
		}
	}

	record Metadata(String metadata) implements ProjectedReferenceItem {
		public Metadata {
			metadata = metadata == null ? "" : metadata;
		}
	}

	record Context(String context) implements ProjectedReferenceItem {
		public Context {
			context = context == null ? "" : context;
		}
	}
}
