package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** One {@code AcceptanceTestRecordItem} from the grammar. */
public sealed interface ProjectedAcceptanceTestItem permits
		ProjectedAcceptanceTestItem.Source,
		ProjectedAcceptanceTestItem.Validates,
		ProjectedAcceptanceTestItem.Preconditions,
		ProjectedAcceptanceTestItem.Actions,
		ProjectedAcceptanceTestItem.Assertions,
		ProjectedAcceptanceTestItem.Title,
		ProjectedAcceptanceTestItem.References,
		ProjectedAcceptanceTestItem.Notes,
		ProjectedAcceptanceTestItem.Context {

	record Source(ProjectedSourceBlock source) implements ProjectedAcceptanceTestItem {
		public Source {
			Objects.requireNonNull(source, "source");
		}
	}

	/** {@code validates} behavior ids ({@code B-ddd}). */
	record Validates(List<String> behaviorIds) implements ProjectedAcceptanceTestItem {
		public Validates {
			behaviorIds = List.copyOf(Objects.requireNonNull(behaviorIds, "behaviorIds"));
		}
	}

	record Preconditions(List<String> preconditions) implements ProjectedAcceptanceTestItem {
		public Preconditions {
			preconditions = List.copyOf(Objects.requireNonNull(preconditions, "preconditions"));
		}
	}

	record Actions(List<String> actions) implements ProjectedAcceptanceTestItem {
		public Actions {
			actions = List.copyOf(Objects.requireNonNull(actions, "actions"));
		}
	}

	record Assertions(List<String> assertions) implements ProjectedAcceptanceTestItem {
		public Assertions {
			assertions = List.copyOf(Objects.requireNonNull(assertions, "assertions"));
		}
	}

	record Title(String title) implements ProjectedAcceptanceTestItem {
		public Title {
			title = ProjectionStrings.requireNonBlank(title, "title");
		}
	}

	record References(List<String> refIds) implements ProjectedAcceptanceTestItem {
		public References {
			refIds = List.copyOf(Objects.requireNonNull(refIds, "refIds"));
		}
	}

	record Notes(String notes) implements ProjectedAcceptanceTestItem {
		public Notes {
			notes = ProjectionStrings.requireNonNullTrim(notes, "notes");
		}
	}

	record Context(String context) implements ProjectedAcceptanceTestItem {
		public Context {
			context = ProjectionStrings.requireNonNullTrim(context, "context");
		}
	}
}
