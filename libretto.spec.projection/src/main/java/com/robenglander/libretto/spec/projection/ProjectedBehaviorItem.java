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
			if (source == null) {
				throw new NullPointerException("source");
			}
		}
	}

	record Actor(String actor) implements ProjectedBehaviorItem {
		public Actor {
			actor = actor == null ? "" : actor;
		}
	}

	record Action(String action) implements ProjectedBehaviorItem {
		public Action {
			action = action == null ? "" : action;
		}
	}

	record Objects(List<String> objectIds) implements ProjectedBehaviorItem {
		public Objects {
			objectIds = objectIds == null ? List.of() : List.copyOf(objectIds);
		}
	}

	record Reads(List<String> reads) implements ProjectedBehaviorItem {
		public Reads {
			reads = reads == null ? List.of() : List.copyOf(reads);
		}
	}

	record Writes(List<String> writes) implements ProjectedBehaviorItem {
		public Writes {
			writes = writes == null ? List.of() : List.copyOf(writes);
		}
	}

	record Conditions(List<String> conditions) implements ProjectedBehaviorItem {
		public Conditions {
			conditions = conditions == null ? List.of() : List.copyOf(conditions);
		}
	}

	record Outcomes(List<String> outcomes) implements ProjectedBehaviorItem {
		public Outcomes {
			outcomes = outcomes == null ? List.of() : List.copyOf(outcomes);
		}
	}

	record Label(String label) implements ProjectedBehaviorItem {
		public Label {
			label = label == null ? "" : label;
		}
	}

	record References(List<String> refIds) implements ProjectedBehaviorItem {
		public References {
			refIds = refIds == null ? List.of() : List.copyOf(refIds);
		}
	}

	record Notes(String notes) implements ProjectedBehaviorItem {
		public Notes {
			notes = notes == null ? "" : notes;
		}
	}

	record Context(String context) implements ProjectedBehaviorItem {
		public Context {
			context = context == null ? "" : context;
		}
	}

	record Dependencies(List<String> dependencyIds) implements ProjectedBehaviorItem {
		public Dependencies {
			dependencyIds = dependencyIds == null ? List.of() : List.copyOf(dependencyIds);
		}
	}
}
