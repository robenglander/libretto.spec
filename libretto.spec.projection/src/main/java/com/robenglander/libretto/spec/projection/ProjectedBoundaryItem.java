package com.robenglander.libretto.spec.projection;

public sealed interface ProjectedBoundaryItem permits
		ProjectedBoundaryItem.SpecId,
		ProjectedBoundaryItem.OperationId,
		ProjectedBoundaryItem.ProfileId,
		ProjectedBoundaryItem.Raw {

	record SpecId(String specId) implements ProjectedBoundaryItem {
		public SpecId {
			specId = ProjectionStrings.requireNonBlank(specId, "specId");
		}
	}

	record OperationId(String operationId) implements ProjectedBoundaryItem {
		public OperationId {
			operationId = ProjectionStrings.requireNonBlank(operationId, "operationId");
		}
	}

	record ProfileId(String profileId) implements ProjectedBoundaryItem {
		public ProfileId {
			profileId = ProjectionStrings.requireNonBlank(profileId, "profileId");
		}
	}

	record Raw(String raw) implements ProjectedBoundaryItem {
		public Raw {
			raw = ProjectionStrings.requireNonNullTrim(raw, "raw");
		}
	}
}
