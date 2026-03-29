package com.robenglander.libretto.spec.projection;

import java.util.Objects;

public sealed interface ProjectedOperationSurfaceItem permits
		ProjectedOperationSurfaceItem.Expression,
		ProjectedOperationSurfaceItem.Outcome {

	record Expression(String operationExpression) implements ProjectedOperationSurfaceItem {
		public Expression {
			operationExpression = ProjectionStrings.requireNonBlank(operationExpression, "operationExpression");
		}
	}

	record Outcome(OperationOutcomeClass outcomeClass) implements ProjectedOperationSurfaceItem {
		public Outcome {
			Objects.requireNonNull(outcomeClass, "outcomeClass");
		}
	}
}
