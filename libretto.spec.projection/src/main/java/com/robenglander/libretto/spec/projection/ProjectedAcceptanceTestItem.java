package com.robenglander.libretto.spec.projection;

import java.util.List;

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
			if (source == null) {
				throw new NullPointerException("source");
			}
		}
	}

	/** {@code validates} behavior ids ({@code B-ddd}). */
	record Validates(List<String> behaviorIds) implements ProjectedAcceptanceTestItem {
		public Validates {
			behaviorIds = behaviorIds == null ? List.of() : List.copyOf(behaviorIds);
		}
	}

	record Preconditions(List<String> preconditions) implements ProjectedAcceptanceTestItem {
		public Preconditions {
			preconditions = preconditions == null ? List.of() : List.copyOf(preconditions);
		}
	}

	record Actions(List<String> actions) implements ProjectedAcceptanceTestItem {
		public Actions {
			actions = actions == null ? List.of() : List.copyOf(actions);
		}
	}

	record Assertions(List<String> assertions) implements ProjectedAcceptanceTestItem {
		public Assertions {
			assertions = assertions == null ? List.of() : List.copyOf(assertions);
		}
	}

	record Title(String title) implements ProjectedAcceptanceTestItem {
		public Title {
			title = title == null ? "" : title;
		}
	}

	record References(List<String> refIds) implements ProjectedAcceptanceTestItem {
		public References {
			refIds = refIds == null ? List.of() : List.copyOf(refIds);
		}
	}

	record Notes(String notes) implements ProjectedAcceptanceTestItem {
		public Notes {
			notes = notes == null ? "" : notes;
		}
	}

	record Context(String context) implements ProjectedAcceptanceTestItem {
		public Context {
			context = context == null ? "" : context;
		}
	}
}
