package com.robenglander.libretto.spec.projection;

import java.util.List;

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
			if (source == null) {
				throw new NullPointerException("source");
			}
		}
	}

	record AppliesTo(List<String> appliesTo) implements ProjectedImplementationDirectiveItem {
		public AppliesTo {
			appliesTo = appliesTo == null ? List.of() : List.copyOf(appliesTo);
		}
	}

	record Strength(DirectiveStrength strength) implements ProjectedImplementationDirectiveItem {
		public Strength {
			if (strength == null) {
				throw new NullPointerException("strength");
			}
		}
	}

	record Directive(String directive) implements ProjectedImplementationDirectiveItem {
		public Directive {
			directive = directive == null ? "" : directive;
		}
	}

	record Category(String categoryIdentifier) implements ProjectedImplementationDirectiveItem {
		public Category {
			categoryIdentifier = categoryIdentifier == null ? "" : categoryIdentifier;
		}
	}

	record Constraints(List<String> constraints) implements ProjectedImplementationDirectiveItem {
		public Constraints {
			constraints = constraints == null ? List.of() : List.copyOf(constraints);
		}
	}

	record AllowedFlexibility(List<String> allowedFlexibility) implements ProjectedImplementationDirectiveItem {
		public AllowedFlexibility {
			allowedFlexibility = allowedFlexibility == null ? List.of() : List.copyOf(allowedFlexibility);
		}
	}

	record References(List<String> refIds) implements ProjectedImplementationDirectiveItem {
		public References {
			refIds = refIds == null ? List.of() : List.copyOf(refIds);
		}
	}

	record Rationale(String rationale) implements ProjectedImplementationDirectiveItem {
		public Rationale {
			rationale = rationale == null ? "" : rationale;
		}
	}

	record Context(String context) implements ProjectedImplementationDirectiveItem {
		public Context {
			context = context == null ? "" : context;
		}
	}
}
