package com.robenglander.libretto.spec.projection;

public sealed interface ProjectedBoundaryItem permits
		ProjectedBoundaryItem.SpecId,
		ProjectedBoundaryItem.OperationId,
		ProjectedBoundaryItem.ProfileId,
		ProjectedBoundaryItem.Raw {

	record SpecId(String specId) implements ProjectedBoundaryItem {
		public SpecId {
			specId = specId == null ? "" : specId;
		}
	}

	record OperationId(String operationId) implements ProjectedBoundaryItem {
		public OperationId {
			operationId = operationId == null ? "" : operationId;
		}
	}

	record ProfileId(String profileId) implements ProjectedBoundaryItem {
		public ProfileId {
			profileId = profileId == null ? "" : profileId;
		}
	}

	record Raw(String raw) implements ProjectedBoundaryItem {
		public Raw {
			raw = raw == null ? "" : raw;
		}
	}
}
