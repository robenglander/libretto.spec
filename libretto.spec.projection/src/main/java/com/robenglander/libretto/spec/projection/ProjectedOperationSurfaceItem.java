package com.robenglander.libretto.spec.projection;

public sealed interface ProjectedOperationSurfaceItem permits
		ProjectedOperationSurfaceItem.Expression,
		ProjectedOperationSurfaceItem.Outcome {

	record Expression(String operationExpression) implements ProjectedOperationSurfaceItem {
		public Expression {
			operationExpression = operationExpression == null ? "" : operationExpression;
		}
	}

	record Outcome(OperationOutcomeClass outcomeClass) implements ProjectedOperationSurfaceItem {
		public Outcome {
			if (outcomeClass == null) {
				throw new NullPointerException("outcomeClass");
			}
		}
	}
}
