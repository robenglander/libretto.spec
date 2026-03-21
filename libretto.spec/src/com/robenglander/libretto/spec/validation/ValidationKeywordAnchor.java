/*
 * Maps EMF nodes to grammar keyword text for validation underline anchoring.
 */
package com.robenglander.libretto.spec.validation;

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
import com.robenglander.libretto.spec.librettoSpec.ProseSection;
import com.robenglander.libretto.spec.librettoSpec.ReferenceRecord;
import com.robenglander.libretto.spec.librettoSpec.ReferencesSection;
import com.robenglander.libretto.spec.librettoSpec.SectionContextRecord;
import com.robenglander.libretto.spec.librettoSpec.SourceBlock;
import com.robenglander.libretto.spec.librettoSpec.Spec;
import com.robenglander.libretto.spec.librettoSpec.SpecSection;
import com.robenglander.libretto.spec.librettoSpec.SubsectionContextRecord;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

/** Resolves grammar-keyword spans in the parse tree for diagnostics. */
public final class ValidationKeywordAnchor {

	private ValidationKeywordAnchor() {
	}

	/**
	 * Leading keyword for a record-like construct (the parent keyword for nested field issues).
	 */
	public static String recordConstructKeyword(EObject record) {
		if (record instanceof BehaviorRecord) {
			return "behavior";
		}
		if (record instanceof SourceBlock) {
			return "source";
		}
		if (record instanceof DependencyRecord) {
			return "dependency";
		}
		if (record instanceof ReferenceRecord) {
			return "reference";
		}
		if (record instanceof SectionContextRecord) {
			return "section_context";
		}
		if (record instanceof SubsectionContextRecord) {
			return "subsection_context";
		}
		if (record instanceof OutOfScopeRecord) {
			return "out_of_scope_item";
		}
		if (record instanceof OperationSurfaceRecord) {
			return "operation";
		}
		if (record instanceof ImplementsSurfaceRecord) {
			return "implements";
		}
		if (record instanceof BoundaryRecord) {
			return "boundary";
		}
		if (record instanceof AcceptanceTestRecord) {
			return "acceptance_test";
		}
		if (record instanceof ImplementationDirectiveRecord) {
			return "implementation_directive";
		}
		if (record instanceof Spec) {
			return "spec";
		}
		return null;
	}

	public static String topLevelSectionKeyword(SpecSection sec) {
		if (sec instanceof MetadataSection) {
			return "metadata";
		}
		if (sec instanceof DependenciesSection) {
			return "dependencies";
		}
		if (sec instanceof ReferencesSection) {
			return "references";
		}
		if (sec instanceof ProseSection) {
			return "prose";
		}
		if (sec instanceof OutOfScopeSection) {
			return "out_of_scope";
		}
		if (sec instanceof OperationSurfaceSection) {
			return "operation_surface";
		}
		if (sec instanceof ImplementsSurfaceSection) {
			return "implements_surface";
		}
		if (sec instanceof BoundaryExportsSection) {
			return "boundary_exports";
		}
		if (sec instanceof BoundaryImportsSection) {
			return "boundary_imports";
		}
		if (sec instanceof BehaviorsSection) {
			return "behaviors";
		}
		if (sec instanceof AcceptanceTestsSection) {
			return "acceptance_tests";
		}
		if (sec instanceof ImplementationDirectivesSection) {
			return "implementation_directives";
		}
		return null;
	}

	/**
	 * @param keyword if non-null, prefer a visible leaf with this exact text; otherwise first
	 *                non-hidden leaf
	 * @return {@code [offset, length]} or {@code null} if no node / no visible leaf
	 */
	public static int[] spanForKeyword(EObject object, String keyword) {
		INode node = NodeModelUtils.getNode(object);
		if (node == null) {
			return null;
		}
		if (keyword != null && !keyword.isEmpty()) {
			for (ILeafNode leaf : node.getLeafNodes()) {
				if (!leaf.isHidden() && keyword.equals(leaf.getText())) {
					return new int[] { leaf.getOffset(), leaf.getLength() };
				}
			}
		}
		for (ILeafNode leaf : node.getLeafNodes()) {
			if (!leaf.isHidden()) {
				return new int[] { leaf.getOffset(), leaf.getLength() };
			}
		}
		return null;
	}
}
