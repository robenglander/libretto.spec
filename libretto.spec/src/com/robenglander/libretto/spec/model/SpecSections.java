/*
 * Helpers for {@link com.robenglander.libretto.spec.librettoSpec.Spec} after top-level sections became an
 * order-independent {@code sections} list ({@link com.robenglander.libretto.spec.librettoSpec.SpecSection}).
 */
package com.robenglander.libretto.spec.model;

import com.robenglander.libretto.spec.librettoSpec.AcceptanceTestRecord;
import com.robenglander.libretto.spec.librettoSpec.AcceptanceTestsSection;
import com.robenglander.libretto.spec.librettoSpec.BehaviorRecord;
import com.robenglander.libretto.spec.librettoSpec.BehaviorsSection;
import com.robenglander.libretto.spec.librettoSpec.BoundaryExportsSection;
import com.robenglander.libretto.spec.librettoSpec.BoundaryImportsSection;
import com.robenglander.libretto.spec.librettoSpec.BoundaryRecord;
import com.robenglander.libretto.spec.librettoSpec.DependenciesSection;
import com.robenglander.libretto.spec.librettoSpec.DependencyRecord;
import com.robenglander.libretto.spec.librettoSpec.ImplementsSurfaceRecord;
import com.robenglander.libretto.spec.librettoSpec.ImplementsSurfaceSection;
import com.robenglander.libretto.spec.librettoSpec.ImplementationDirectiveRecord;
import com.robenglander.libretto.spec.librettoSpec.ImplementationDirectivesSection;
import com.robenglander.libretto.spec.librettoSpec.MetadataSection;
import com.robenglander.libretto.spec.librettoSpec.OperationSurfaceRecord;
import com.robenglander.libretto.spec.librettoSpec.OperationSurfaceSection;
import com.robenglander.libretto.spec.librettoSpec.OutOfScopeRecord;
import com.robenglander.libretto.spec.librettoSpec.OutOfScopeSection;
import com.robenglander.libretto.spec.librettoSpec.ProseRecord;
import com.robenglander.libretto.spec.librettoSpec.ProseSection;
import com.robenglander.libretto.spec.librettoSpec.ReferenceRecord;
import com.robenglander.libretto.spec.librettoSpec.ReferencesSection;
import com.robenglander.libretto.spec.librettoSpec.Spec;
import com.robenglander.libretto.spec.librettoSpec.SpecSection;
import java.util.ArrayList;
import java.util.List;

public final class SpecSections {

	private SpecSections() {
	}

	public static List<MetadataSection> metadataSections(Spec spec) {
		List<MetadataSection> out = new ArrayList<>();
		for (SpecSection s : spec.getSections()) {
			if (s instanceof MetadataSection ms) {
				out.add(ms);
			}
		}
		return out;
	}

	public static List<DependencyRecord> dependencyRecords(Spec spec) {
		List<DependencyRecord> out = new ArrayList<>();
		for (SpecSection s : spec.getSections()) {
			if (s instanceof DependenciesSection ds) {
				out.addAll(ds.getRecords());
			}
		}
		return out;
	}

	public static List<ReferenceRecord> referenceRecords(Spec spec) {
		List<ReferenceRecord> out = new ArrayList<>();
		for (SpecSection s : spec.getSections()) {
			if (s instanceof ReferencesSection rs) {
				out.addAll(rs.getRecords());
			}
		}
		return out;
	}

	public static List<ProseRecord> proseRecords(Spec spec) {
		List<ProseRecord> out = new ArrayList<>();
		for (SpecSection s : spec.getSections()) {
			if (s instanceof ProseSection ps) {
				out.addAll(ps.getRecords());
			}
		}
		return out;
	}

	public static List<OutOfScopeRecord> outOfScopeRecords(Spec spec) {
		List<OutOfScopeRecord> out = new ArrayList<>();
		for (SpecSection s : spec.getSections()) {
			if (s instanceof OutOfScopeSection os) {
				out.addAll(os.getRecords());
			}
		}
		return out;
	}

	public static List<OperationSurfaceRecord> operationSurfaceRecords(Spec spec) {
		List<OperationSurfaceRecord> out = new ArrayList<>();
		for (SpecSection s : spec.getSections()) {
			if (s instanceof OperationSurfaceSection op) {
				out.addAll(op.getRecords());
			}
		}
		return out;
	}

	public static List<ImplementsSurfaceRecord> implementsSurfaceRecords(Spec spec) {
		List<ImplementsSurfaceRecord> out = new ArrayList<>();
		for (SpecSection s : spec.getSections()) {
			if (s instanceof ImplementsSurfaceSection is) {
				out.addAll(is.getRecords());
			}
		}
		return out;
	}

	public static List<BoundaryRecord> boundaryExportRecords(Spec spec) {
		List<BoundaryRecord> out = new ArrayList<>();
		for (SpecSection s : spec.getSections()) {
			if (s instanceof BoundaryExportsSection be) {
				out.addAll(be.getRecords());
			}
		}
		return out;
	}

	public static List<BoundaryRecord> boundaryImportRecords(Spec spec) {
		List<BoundaryRecord> out = new ArrayList<>();
		for (SpecSection s : spec.getSections()) {
			if (s instanceof BoundaryImportsSection bi) {
				out.addAll(bi.getRecords());
			}
		}
		return out;
	}

	public static List<BehaviorRecord> behaviorRecords(Spec spec) {
		List<BehaviorRecord> out = new ArrayList<>();
		for (SpecSection s : spec.getSections()) {
			if (s instanceof BehaviorsSection bs) {
				out.addAll(bs.getRecords());
			}
		}
		return out;
	}

	public static List<AcceptanceTestRecord> acceptanceTestRecords(Spec spec) {
		List<AcceptanceTestRecord> out = new ArrayList<>();
		for (SpecSection s : spec.getSections()) {
			if (s instanceof AcceptanceTestsSection ats) {
				out.addAll(ats.getRecords());
			}
		}
		return out;
	}

	public static List<ImplementationDirectiveRecord> implementationDirectiveRecords(Spec spec) {
		List<ImplementationDirectiveRecord> out = new ArrayList<>();
		for (SpecSection s : spec.getSections()) {
			if (s instanceof ImplementationDirectivesSection ids) {
				out.addAll(ids.getRecords());
			}
		}
		return out;
	}
}
