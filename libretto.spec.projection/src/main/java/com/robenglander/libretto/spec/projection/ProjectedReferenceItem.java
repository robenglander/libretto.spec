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
			title = ProjectionStrings.requireNonBlank(title, "title");
		}
	}

	record Type(String typeIdentifier) implements ProjectedReferenceItem {
		public Type {
			typeIdentifier = ProjectionStrings.requireNonBlank(typeIdentifier, "typeIdentifier");
		}
	}

	record Citation(String citation) implements ProjectedReferenceItem {
		public Citation {
			citation = ProjectionStrings.requireNonNullTrim(citation, "citation");
		}
	}

	record Locator(String locator) implements ProjectedReferenceItem {
		public Locator {
			locator = ProjectionStrings.requireNonBlank(locator, "locator");
		}
	}

	record AuthorityNotes(String authorityNotes) implements ProjectedReferenceItem {
		public AuthorityNotes {
			authorityNotes = ProjectionStrings.requireNonNullTrim(authorityNotes, "authorityNotes");
		}
	}

	record Metadata(String metadata) implements ProjectedReferenceItem {
		public Metadata {
			metadata = ProjectionStrings.requireNonNullTrim(metadata, "metadata");
		}
	}

	record Context(String context) implements ProjectedReferenceItem {
		public Context {
			context = ProjectionStrings.requireNonNullTrim(context, "context");
		}
	}
}
