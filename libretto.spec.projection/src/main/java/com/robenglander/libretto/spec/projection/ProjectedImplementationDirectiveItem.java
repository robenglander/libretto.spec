package com.robenglander.libretto.spec.projection;

import java.util.List;
import java.util.Objects;

/** One {@code ImplementationDirectiveRecordItem} from the grammar. */
public sealed interface ProjectedImplementationDirectiveItem permits
		ProjectedImplementationDirectiveItem.Source,
		ProjectedImplementationDirectiveItem.AppliesTo,
		ProjectedImplementationDirectiveItem.Strength,
		ProjectedImplementationDirectiveItem.Directive,
		ProjectedImplementationDirectiveItem.Category,
		ProjectedImplementationDirectiveItem.Constraints,
		ProjectedImplementationDirectiveItem.AllowedFlexibility,
		ProjectedImplementationDirectiveItem.References,
		ProjectedImplementationDirectiveItem.Rationale,
		ProjectedImplementationDirectiveItem.Context {

	record Source(ProjectedSourceBlock source) implements ProjectedImplementationDirectiveItem {
		public Source {
			Objects.requireNonNull(source, "source");
		}
	}

	record AppliesTo(List<String> appliesTo) implements ProjectedImplementationDirectiveItem {
		public AppliesTo {
			appliesTo = List.copyOf(Objects.requireNonNull(appliesTo, "appliesTo"));
		}
	}

	record Strength(DirectiveStrength strength) implements ProjectedImplementationDirectiveItem {
		public Strength {
			Objects.requireNonNull(strength, "strength");
		}
	}

	record Directive(String directive) implements ProjectedImplementationDirectiveItem {
		public Directive {
			directive = ProjectionStrings.requireNonBlank(directive, "directive");
		}
	}

	record Category(String categoryIdentifier) implements ProjectedImplementationDirectiveItem {
		public Category {
			categoryIdentifier = ProjectionStrings.requireNonBlank(categoryIdentifier, "categoryIdentifier");
		}
	}

	record Constraints(List<String> constraints) implements ProjectedImplementationDirectiveItem {
		public Constraints {
			constraints = List.copyOf(Objects.requireNonNull(constraints, "constraints"));
		}
	}

	record AllowedFlexibility(List<String> allowedFlexibility) implements ProjectedImplementationDirectiveItem {
		public AllowedFlexibility {
			allowedFlexibility = List.copyOf(Objects.requireNonNull(allowedFlexibility, "allowedFlexibility"));
		}
	}

	record References(List<String> refIds) implements ProjectedImplementationDirectiveItem {
		public References {
			refIds = List.copyOf(Objects.requireNonNull(refIds, "refIds"));
		}
	}

	record Rationale(String rationale) implements ProjectedImplementationDirectiveItem {
		public Rationale {
			rationale = ProjectionStrings.requireNonNullTrim(rationale, "rationale");
		}
	}

	record Context(String context) implements ProjectedImplementationDirectiveItem {
		public Context {
			context = ProjectionStrings.requireNonNullTrim(context, "context");
		}
	}
}
