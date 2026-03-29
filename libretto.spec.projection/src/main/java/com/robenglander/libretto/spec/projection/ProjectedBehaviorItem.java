package com.robenglander.libretto.spec.projection;

import java.util.List;

/** One {@code BehaviorRecordItem} from the grammar. */
public sealed interface ProjectedBehaviorItem permits
		ProjectedBehaviorItem.Source,
		ProjectedBehaviorItem.Actor,
		ProjectedBehaviorItem.Action,
		ProjectedBehaviorItem.Objects,
		ProjectedBehaviorItem.Reads,
		ProjectedBehaviorItem.Writes,
		ProjectedBehaviorItem.Conditions,
		ProjectedBehaviorItem.Outcomes,
		ProjectedBehaviorItem.Label,
		ProjectedBehaviorItem.References,
		ProjectedBehaviorItem.Notes,
		ProjectedBehaviorItem.Context,
		ProjectedBehaviorItem.Dependencies {

	record Source(ProjectedSourceBlock source) implements ProjectedBehaviorItem {
		public Source {
			java.util.Objects.requireNonNull(source, "source");
		}
	}

	record Actor(String actor) implements ProjectedBehaviorItem {
		public Actor {
			actor = ProjectionStrings.requireNonBlank(actor, "actor");
		}
	}

	record Action(String action) implements ProjectedBehaviorItem {
		public Action {
			action = ProjectionStrings.requireNonBlank(action, "action");
		}
	}

	record Objects(List<String> objectIds) implements ProjectedBehaviorItem {
		public Objects {
			objectIds = List.copyOf(java.util.Objects.requireNonNull(objectIds, "objectIds"));
		}
	}

	record Reads(List<String> reads) implements ProjectedBehaviorItem {
		public Reads {
			reads = List.copyOf(java.util.Objects.requireNonNull(reads, "reads"));
		}
	}

	record Writes(List<String> writes) implements ProjectedBehaviorItem {
		public Writes {
			writes = List.copyOf(java.util.Objects.requireNonNull(writes, "writes"));
		}
	}

	record Conditions(List<String> conditions) implements ProjectedBehaviorItem {
		public Conditions {
			conditions = List.copyOf(java.util.Objects.requireNonNull(conditions, "conditions"));
		}
	}

	record Outcomes(List<String> outcomes) implements ProjectedBehaviorItem {
		public Outcomes {
			outcomes = List.copyOf(java.util.Objects.requireNonNull(outcomes, "outcomes"));
		}
	}

	record Label(String label) implements ProjectedBehaviorItem {
		public Label {
			label = ProjectionStrings.requireNonBlank(label, "label");
		}
	}

	record References(List<String> refIds) implements ProjectedBehaviorItem {
		public References {
			refIds = List.copyOf(java.util.Objects.requireNonNull(refIds, "refIds"));
		}
	}

	record Notes(String notes) implements ProjectedBehaviorItem {
		public Notes {
			notes = ProjectionStrings.requireNonNullTrim(notes, "notes");
		}
	}

	record Context(String context) implements ProjectedBehaviorItem {
		public Context {
			context = ProjectionStrings.requireNonNullTrim(context, "context");
		}
	}

	record Dependencies(List<String> dependencyIds) implements ProjectedBehaviorItem {
		public Dependencies {
			dependencyIds = List.copyOf(java.util.Objects.requireNonNull(dependencyIds, "dependencyIds"));
		}
	}
}
