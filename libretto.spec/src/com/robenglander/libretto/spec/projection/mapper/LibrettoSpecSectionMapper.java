package com.robenglander.libretto.spec.projection.mapper;

import java.util.ArrayList;
import java.util.List;

import com.robenglander.libretto.spec.librettoSpec.AcceptanceTestRecord;
import com.robenglander.libretto.spec.librettoSpec.AcceptanceTestRecordItem;
import com.robenglander.libretto.spec.librettoSpec.AcceptanceTestsSection;
import com.robenglander.libretto.spec.librettoSpec.BehaviorRecord;
import com.robenglander.libretto.spec.librettoSpec.BehaviorRecordItem;
import com.robenglander.libretto.spec.librettoSpec.BehaviorsSection;
import com.robenglander.libretto.spec.librettoSpec.BoundaryExportsSection;
import com.robenglander.libretto.spec.librettoSpec.BoundaryImportsSection;
import com.robenglander.libretto.spec.librettoSpec.BoundaryRecord;
import com.robenglander.libretto.spec.librettoSpec.BoundaryRecordItem;
import com.robenglander.libretto.spec.librettoSpec.ConditionsField;
import com.robenglander.libretto.spec.librettoSpec.DependencyRecord;
import com.robenglander.libretto.spec.librettoSpec.DependencyRecordItem;
import com.robenglander.libretto.spec.librettoSpec.DependenciesSection;
import com.robenglander.libretto.spec.librettoSpec.ImplementationDirectiveRecord;
import com.robenglander.libretto.spec.librettoSpec.ImplementationDirectiveRecordItem;
import com.robenglander.libretto.spec.librettoSpec.ImplementationDirectivesSection;
import com.robenglander.libretto.spec.librettoSpec.ImplementsSurfaceRecord;
import com.robenglander.libretto.spec.librettoSpec.ImplementsSurfaceRecordItem;
import com.robenglander.libretto.spec.librettoSpec.ImplementsSurfaceSection;
import com.robenglander.libretto.spec.librettoSpec.MetadataField;
import com.robenglander.libretto.spec.librettoSpec.MetadataSection;
import com.robenglander.libretto.spec.librettoSpec.MetadataStatusValue;
import com.robenglander.libretto.spec.librettoSpec.OperationSurfaceRecord;
import com.robenglander.libretto.spec.librettoSpec.OperationSurfaceRecordItem;
import com.robenglander.libretto.spec.librettoSpec.OperationSurfaceSection;
import com.robenglander.libretto.spec.librettoSpec.OutcomeClassValue;
import com.robenglander.libretto.spec.librettoSpec.OutOfScopeRecord;
import com.robenglander.libretto.spec.librettoSpec.OutOfScopeRecordItem;
import com.robenglander.libretto.spec.librettoSpec.OutOfScopeSection;
import com.robenglander.libretto.spec.librettoSpec.OutcomesField;
import com.robenglander.libretto.spec.librettoSpec.ProseRecord;
import com.robenglander.libretto.spec.librettoSpec.ProseSection;
import com.robenglander.libretto.spec.librettoSpec.ReferenceRecord;
import com.robenglander.libretto.spec.librettoSpec.ReferenceRecordItem;
import com.robenglander.libretto.spec.librettoSpec.ReferencesSection;
import com.robenglander.libretto.spec.librettoSpec.SectionContextRecord;
import com.robenglander.libretto.spec.librettoSpec.SectionContextRecordItem;
import com.robenglander.libretto.spec.librettoSpec.SourceBlock;
import com.robenglander.libretto.spec.librettoSpec.SourceBlockItem;
import com.robenglander.libretto.spec.librettoSpec.SpecSection;
import com.robenglander.libretto.spec.librettoSpec.StrengthValue;
import com.robenglander.libretto.spec.librettoSpec.SubsectionContextRecord;
import com.robenglander.libretto.spec.librettoSpec.SubsectionContextRecordItem;
import com.robenglander.libretto.spec.projection.DirectiveStrength;
import com.robenglander.libretto.spec.projection.MetadataPublicationStatus;
import com.robenglander.libretto.spec.projection.OperationOutcomeClass;
import com.robenglander.libretto.spec.projection.ProjectedAcceptanceTestItem;
import com.robenglander.libretto.spec.projection.ProjectedAcceptanceTestRecord;
import com.robenglander.libretto.spec.projection.ProjectedAcceptanceTestsSection;
import com.robenglander.libretto.spec.projection.ProjectedBehaviorItem;
import com.robenglander.libretto.spec.projection.ProjectedBehaviorRecord;
import com.robenglander.libretto.spec.projection.ProjectedBehaviorsSection;
import com.robenglander.libretto.spec.projection.ProjectedBoundaryExportsSection;
import com.robenglander.libretto.spec.projection.ProjectedBoundaryImportsSection;
import com.robenglander.libretto.spec.projection.ProjectedBoundaryItem;
import com.robenglander.libretto.spec.projection.ProjectedBoundaryRecord;
import com.robenglander.libretto.spec.projection.ProjectedDependencyItem;
import com.robenglander.libretto.spec.projection.ProjectedDependencyRecord;
import com.robenglander.libretto.spec.projection.ProjectedDependenciesSection;
import com.robenglander.libretto.spec.projection.ProjectedImplementationDirectiveItem;
import com.robenglander.libretto.spec.projection.ProjectedImplementationDirectiveRecord;
import com.robenglander.libretto.spec.projection.ProjectedImplementationDirectivesSection;
import com.robenglander.libretto.spec.projection.ProjectedImplementsSurfaceRecord;
import com.robenglander.libretto.spec.projection.ProjectedImplementsSurfaceSection;
import com.robenglander.libretto.spec.projection.ProjectedMetadataField;
import com.robenglander.libretto.spec.projection.ProjectedMetadataSection;
import com.robenglander.libretto.spec.projection.ProjectedOperationSurfaceItem;
import com.robenglander.libretto.spec.projection.ProjectedOperationSurfaceRecord;
import com.robenglander.libretto.spec.projection.ProjectedOperationSurfaceSection;
import com.robenglander.libretto.spec.projection.ProjectedOutOfScopeRecord;
import com.robenglander.libretto.spec.projection.ProjectedOutOfScopeSection;
import com.robenglander.libretto.spec.projection.ProjectedProseRecord;
import com.robenglander.libretto.spec.projection.ProjectedProseSection;
import com.robenglander.libretto.spec.projection.ProjectedReferenceItem;
import com.robenglander.libretto.spec.projection.ProjectedReferenceRecord;
import com.robenglander.libretto.spec.projection.ProjectedReferencesSection;
import com.robenglander.libretto.spec.projection.ProjectedSectionContextItem;
import com.robenglander.libretto.spec.projection.ProjectedSourceBlock;
import com.robenglander.libretto.spec.projection.ProjectedSourceItem;
import com.robenglander.libretto.spec.projection.ProjectedSpecSection;
import com.robenglander.libretto.spec.projection.ProjectedSubsectionContextItem;

final class LibrettoSpecSectionMapper {

	private LibrettoSpecSectionMapper() {
	}

	static ProjectedSpecSection mapSection(SpecSection sec) {
		if (sec instanceof MetadataSection ms) {
			return mapMetadata(ms);
		}
		if (sec instanceof DependenciesSection ds) {
			return mapDependencies(ds);
		}
		if (sec instanceof ReferencesSection rs) {
			return mapReferences(rs);
		}
		if (sec instanceof ProseSection ps) {
			return mapProse(ps);
		}
		if (sec instanceof OutOfScopeSection oss) {
			return mapOutOfScope(oss);
		}
		if (sec instanceof OperationSurfaceSection opss) {
			return mapOperationSurface(opss);
		}
		if (sec instanceof ImplementsSurfaceSection imps) {
			return mapImplementsSurface(imps);
		}
		if (sec instanceof BoundaryExportsSection bes) {
			return mapBoundaryExports(bes);
		}
		if (sec instanceof BoundaryImportsSection bis) {
			return mapBoundaryImports(bis);
		}
		if (sec instanceof BehaviorsSection bs) {
			return mapBehaviors(bs);
		}
		if (sec instanceof AcceptanceTestsSection ats) {
			return mapAcceptanceTests(ats);
		}
		if (sec instanceof ImplementationDirectivesSection ids) {
			return mapImplementationDirectives(ids);
		}
		return null;
	}

	private static ProjectedMetadataSection mapMetadata(MetadataSection ms) {
		List<ProjectedMetadataField> fields = new ArrayList<>();
		for (MetadataField f : ms.getFields()) {
			ProjectedMetadataField p = mapMetadataField(f);
			if (p != null) {
				fields.add(p);
			}
		}
		return new ProjectedMetadataSection(fields);
	}

	private static ProjectedMetadataField mapMetadataField(MetadataField f) {
		if (f.getTitle() != null) {
			return new ProjectedMetadataField.Title(ProjectionValues.text(f.getTitle()));
		}
		if (f.getVersion() != null) {
			return new ProjectedMetadataField.Version(ProjectionValues.text(f.getVersion()));
		}
		if (f.getStatus() != null) {
			return new ProjectedMetadataField.Status(mapMetaStatus(f.getStatus()));
		}
		if (f.getModuleName() != null) {
			return new ProjectedMetadataField.ModuleName(ProjectionValues.text(f.getModuleName()));
		}
		if (f.getJavaPackage() != null) {
			return new ProjectedMetadataField.JavaPackage(ProjectionValues.text(f.getJavaPackage()));
		}
		if (f.getCompiledAt() != null) {
			return new ProjectedMetadataField.CompiledAt(ProjectionValues.text(f.getCompiledAt()));
		}
		if (f.getCompilerVersion() != null) {
			return new ProjectedMetadataField.CompilerVersion(ProjectionValues.text(f.getCompilerVersion()));
		}
		if (f.getModelMetadata() != null) {
			return new ProjectedMetadataField.ModelMetadata(ProjectionValues.text(f.getModelMetadata()));
		}
		return null;
	}

	private static MetadataPublicationStatus mapMetaStatus(MetadataStatusValue v) {
		return switch (v) {
			case DRAFT -> MetadataPublicationStatus.DRAFT;
			case PUBLIC -> MetadataPublicationStatus.PUBLIC;
			default -> MetadataPublicationStatus.DRAFT;
		};
	}

	private static ProjectedDependenciesSection mapDependencies(DependenciesSection ds) {
		List<ProjectedDependencyRecord> deps = new ArrayList<>();
		for (DependencyRecord dr : ds.getRecords()) {
			List<ProjectedDependencyItem> items = new ArrayList<>();
			for (DependencyRecordItem it : dr.getItems()) {
				if (it.getTargetSpec() != null && it.getTargetSpec().getValue() != null) {
					items.add(new ProjectedDependencyItem.TargetSpec(
							ProjectionValues.text(it.getTargetSpec().getValue())));
				} else if (it.getNotes() != null && it.getNotes().getValue() != null) {
					items.add(new ProjectedDependencyItem.Notes(
							ProjectionValues.text(it.getNotes().getValue())));
				}
			}
			deps.add(new ProjectedDependencyRecord(dr.getId(), items));
		}
		return new ProjectedDependenciesSection(deps);
	}

	private static ProjectedReferencesSection mapReferences(ReferencesSection rs) {
		List<ProjectedReferenceRecord> refs = new ArrayList<>();
		for (ReferenceRecord rr : rs.getRecords()) {
			List<ProjectedReferenceItem> items = new ArrayList<>();
			for (ReferenceRecordItem it : rr.getItems()) {
				ProjectedReferenceItem p = mapReferenceItem(it);
				if (p != null) {
					items.add(p);
				}
			}
			refs.add(new ProjectedReferenceRecord(rr.getId(), items));
		}
		return new ProjectedReferencesSection(refs);
	}

	private static ProjectedReferenceItem mapReferenceItem(ReferenceRecordItem it) {
		if (it.getTitle() != null && it.getTitle().getValue() != null) {
			return new ProjectedReferenceItem.Title(ProjectionValues.text(it.getTitle().getValue()));
		}
		if (it.getType() != null && it.getType().getValue() != null) {
			return new ProjectedReferenceItem.Type(ProjectionNodeText.identifierText(it.getType().getValue()));
		}
		if (it.getCitation() != null && it.getCitation().getValue() != null) {
			return new ProjectedReferenceItem.Citation(ProjectionValues.text(it.getCitation().getValue()));
		}
		if (it.getLocator() != null && it.getLocator().getValue() != null) {
			return new ProjectedReferenceItem.Locator(ProjectionValues.text(it.getLocator().getValue()));
		}
		if (it.getAuthorityNotes() != null && it.getAuthorityNotes().getValue() != null) {
			return new ProjectedReferenceItem.AuthorityNotes(
					ProjectionValues.text(it.getAuthorityNotes().getValue()));
		}
		if (it.getMetadataText() != null && it.getMetadataText().getValue() != null) {
			return new ProjectedReferenceItem.Metadata(ProjectionValues.text(it.getMetadataText().getValue()));
		}
		if (it.getContext() != null && it.getContext().getValue() != null) {
			return new ProjectedReferenceItem.Context(ProjectionValues.text(it.getContext().getValue()));
		}
		return null;
	}

	private static ProjectedProseSection mapProse(ProseSection ps) {
		List<ProjectedProseRecord> records = new ArrayList<>();
		for (ProseRecord pr : ps.getRecords()) {
			ProjectedProseRecord r = mapProseRecord(pr);
			if (r != null) {
				records.add(r);
			}
		}
		return new ProjectedProseSection(records);
	}

	private static ProjectedProseRecord mapProseRecord(ProseRecord pr) {
		if (pr instanceof SectionContextRecord scr) {
			List<ProjectedSectionContextItem> items = new ArrayList<>();
			for (SectionContextRecordItem it : scr.getItems()) {
				if (it.getSection() != null && it.getSection().getValue() != null) {
					items.add(new ProjectedSectionContextItem.SectionLine(
							ProjectionValues.text(it.getSection().getValue())));
				} else if (it.getText() != null && it.getText().getValue() != null) {
					items.add(new ProjectedSectionContextItem.TextBody(
							ProjectionValues.text(it.getText().getValue())));
				}
			}
			return new ProjectedProseRecord.SectionContext(items);
		}
		if (pr instanceof SubsectionContextRecord sscr) {
			List<ProjectedSubsectionContextItem> items = new ArrayList<>();
			for (SubsectionContextRecordItem it : sscr.getItems()) {
				if (it.getSection() != null && it.getSection().getValue() != null) {
					items.add(new ProjectedSubsectionContextItem.SectionLine(
							ProjectionValues.text(it.getSection().getValue())));
				} else if (it.getSubsection() != null && it.getSubsection().getValue() != null) {
					items.add(new ProjectedSubsectionContextItem.SubsectionLine(
							ProjectionValues.text(it.getSubsection().getValue())));
				} else if (it.getText() != null && it.getText().getValue() != null) {
					items.add(new ProjectedSubsectionContextItem.TextBody(
							ProjectionValues.text(it.getText().getValue())));
				}
			}
			return new ProjectedProseRecord.SubsectionContext(items);
		}
		return null;
	}

	private static ProjectedOutOfScopeSection mapOutOfScope(OutOfScopeSection oss) {
		List<ProjectedOutOfScopeRecord> items = new ArrayList<>();
		for (OutOfScopeRecord r : oss.getRecords()) {
			List<String> stmts = new ArrayList<>();
			for (OutOfScopeRecordItem it : r.getItems()) {
				if (it.getStatement() != null && it.getStatement().getValue() != null) {
					stmts.add(ProjectionValues.text(it.getStatement().getValue()));
				}
			}
			items.add(new ProjectedOutOfScopeRecord(r.getId(), stmts));
		}
		return new ProjectedOutOfScopeSection(items);
	}

	private static ProjectedOperationSurfaceSection mapOperationSurface(OperationSurfaceSection opss) {
		List<ProjectedOperationSurfaceRecord> ops = new ArrayList<>();
		for (OperationSurfaceRecord r : opss.getRecords()) {
			List<ProjectedOperationSurfaceItem> items = new ArrayList<>();
			for (OperationSurfaceRecordItem it : r.getItems()) {
				if (it.getOperationExpression() != null && it.getOperationExpression().getValue() != null) {
					items.add(new ProjectedOperationSurfaceItem.Expression(
							ProjectionValues.text(it.getOperationExpression().getValue())));
				} else if (it.getOutcomeClass() != null && it.getOutcomeClass().getValue() != null) {
					items.add(new ProjectedOperationSurfaceItem.Outcome(
							mapOutcome(it.getOutcomeClass().getValue())));
				}
			}
			ops.add(new ProjectedOperationSurfaceRecord(r.getId(), items));
		}
		return new ProjectedOperationSurfaceSection(ops);
	}

	private static OperationOutcomeClass mapOutcome(OutcomeClassValue v) {
		return switch (v) {
			case RETURNS -> OperationOutcomeClass.RETURNS;
			case REJECTS -> OperationOutcomeClass.REJECTS;
			default -> OperationOutcomeClass.RETURNS;
		};
	}

	private static ProjectedImplementsSurfaceSection mapImplementsSurface(ImplementsSurfaceSection imps) {
		List<ProjectedImplementsSurfaceRecord> recs = new ArrayList<>();
		for (ImplementsSurfaceRecord r : imps.getRecords()) {
			List<String> targets = new ArrayList<>();
			for (ImplementsSurfaceRecordItem it : r.getItems()) {
				if (it.getTargetSpec() != null && it.getTargetSpec().getValue() != null) {
					targets.add(ProjectionValues.text(it.getTargetSpec().getValue()));
				}
			}
			recs.add(new ProjectedImplementsSurfaceRecord(targets));
		}
		return new ProjectedImplementsSurfaceSection(recs);
	}

	private static ProjectedBoundaryExportsSection mapBoundaryExports(BoundaryExportsSection bes) {
		return new ProjectedBoundaryExportsSection(mapBoundaryRecords(bes.getRecords()));
	}

	private static ProjectedBoundaryImportsSection mapBoundaryImports(BoundaryImportsSection bis) {
		return new ProjectedBoundaryImportsSection(mapBoundaryRecords(bis.getRecords()));
	}

	private static List<ProjectedBoundaryRecord> mapBoundaryRecords(
			List<com.robenglander.libretto.spec.librettoSpec.BoundaryRecord> records) {
		List<ProjectedBoundaryRecord> out = new ArrayList<>();
		for (BoundaryRecord br : records) {
			List<ProjectedBoundaryItem> items = new ArrayList<>();
			for (BoundaryRecordItem it : br.getItems()) {
				if (it.getSpecIdField() != null && it.getSpecIdField().getValue() != null) {
					items.add(new ProjectedBoundaryItem.SpecId(
							ProjectionValues.text(it.getSpecIdField().getValue())));
				} else if (it.getOperationIdField() != null && it.getOperationIdField().getValue() != null) {
					items.add(new ProjectedBoundaryItem.OperationId(
							ProjectionValues.text(it.getOperationIdField().getValue())));
				} else if (it.getProfileIdField() != null && it.getProfileIdField().getValue() != null) {
					items.add(new ProjectedBoundaryItem.ProfileId(
							ProjectionValues.text(it.getProfileIdField().getValue())));
				} else if (it.getRawField() != null && it.getRawField().getValue() != null) {
					items.add(new ProjectedBoundaryItem.Raw(
							ProjectionValues.text(it.getRawField().getValue())));
				}
			}
			out.add(new ProjectedBoundaryRecord(items));
		}
		return out;
	}

	private static ProjectedBehaviorsSection mapBehaviors(BehaviorsSection bs) {
		List<ProjectedBehaviorRecord> behaviors = new ArrayList<>();
		for (BehaviorRecord br : bs.getRecords()) {
			List<ProjectedBehaviorItem> items = new ArrayList<>();
			for (BehaviorRecordItem it : br.getItems()) {
				ProjectedBehaviorItem p = mapBehaviorItem(it);
				if (p != null) {
					items.add(p);
				}
			}
			behaviors.add(new ProjectedBehaviorRecord(br.getId(), items));
		}
		return new ProjectedBehaviorsSection(behaviors);
	}

	private static ProjectedBehaviorItem mapBehaviorItem(BehaviorRecordItem it) {
		if (it.getSource() != null) {
			return new ProjectedBehaviorItem.Source(mapSourceBlock(it.getSource()));
		}
		if (it.getActor() != null && it.getActor().getValue() != null) {
			return new ProjectedBehaviorItem.Actor(ProjectionNodeText.identifierText(it.getActor().getValue()));
		}
		if (it.getAction() != null && it.getAction().getValue() != null) {
			return new ProjectedBehaviorItem.Action(ProjectionNodeText.identifierText(it.getAction().getValue()));
		}
		if (it.getObjects() != null) {
			return new ProjectedBehaviorItem.Objects(ProjectionValues.identifierList(it.getObjects().getValue()));
		}
		if (it.getReads() != null) {
			return new ProjectedBehaviorItem.Reads(ProjectionValues.identifierList(it.getReads().getValue()));
		}
		if (it.getWrites() != null) {
			return new ProjectedBehaviorItem.Writes(ProjectionValues.identifierList(it.getWrites().getValue()));
		}
		if (it.getConditions() != null) {
			return new ProjectedBehaviorItem.Conditions(textListFromConditions(it.getConditions()));
		}
		if (it.getOutcomes() != null) {
			return new ProjectedBehaviorItem.Outcomes(textListFromOutcomes(it.getOutcomes()));
		}
		if (it.getLabel() != null && it.getLabel().getValue() != null) {
			return new ProjectedBehaviorItem.Label(ProjectionValues.text(it.getLabel().getValue()));
		}
		if (it.getReferences() != null) {
			return new ProjectedBehaviorItem.References(ProjectionValues.refIdList(it.getReferences().getValue()));
		}
		if (it.getNotes() != null && it.getNotes().getValue() != null) {
			return new ProjectedBehaviorItem.Notes(ProjectionValues.text(it.getNotes().getValue()));
		}
		if (it.getContext() != null && it.getContext().getValue() != null) {
			return new ProjectedBehaviorItem.Context(ProjectionValues.text(it.getContext().getValue()));
		}
		if (it.getDependencies() != null) {
			return new ProjectedBehaviorItem.Dependencies(
					ProjectionValues.identifierList(it.getDependencies().getValue()));
		}
		return null;
	}

	private static List<String> textListFromConditions(ConditionsField cf) {
		return cf.getValue() == null ? List.of() : ProjectionValues.textList(cf.getValue());
	}

	private static List<String> textListFromOutcomes(OutcomesField of) {
		return of.getValue() == null ? List.of() : ProjectionValues.textList(of.getValue());
	}

	private static ProjectedSourceBlock mapSourceBlock(SourceBlock sb) {
		List<ProjectedSourceItem> items = new ArrayList<>();
		for (SourceBlockItem it : sb.getItems()) {
			if (it.getSection() != null && it.getSection().getValue() != null) {
				items.add(new ProjectedSourceItem.SectionLine(
						ProjectionValues.text(it.getSection().getValue())));
			} else if (it.getSubsection() != null && it.getSubsection().getValue() != null) {
				items.add(new ProjectedSourceItem.SubsectionLine(
						ProjectionValues.text(it.getSubsection().getValue())));
			}
		}
		return new ProjectedSourceBlock(items);
	}

	private static ProjectedAcceptanceTestsSection mapAcceptanceTests(AcceptanceTestsSection ats) {
		List<ProjectedAcceptanceTestRecord> tests = new ArrayList<>();
		for (AcceptanceTestRecord tr : ats.getRecords()) {
			List<ProjectedAcceptanceTestItem> items = new ArrayList<>();
			for (AcceptanceTestRecordItem it : tr.getItems()) {
				ProjectedAcceptanceTestItem p = mapAcceptanceItem(it);
				if (p != null) {
					items.add(p);
				}
			}
			tests.add(new ProjectedAcceptanceTestRecord(tr.getId(), items));
		}
		return new ProjectedAcceptanceTestsSection(tests);
	}

	private static ProjectedAcceptanceTestItem mapAcceptanceItem(AcceptanceTestRecordItem it) {
		if (it.getSource() != null) {
			return new ProjectedAcceptanceTestItem.Source(mapSourceBlock(it.getSource()));
		}
		if (it.getValidates() != null) {
			return new ProjectedAcceptanceTestItem.Validates(
					ProjectionValues.behaviorIdList(it.getValidates().getValue()));
		}
		if (it.getPreconditions() != null) {
			return new ProjectedAcceptanceTestItem.Preconditions(
					ProjectionValues.textList(it.getPreconditions().getValue()));
		}
		if (it.getActions() != null) {
			return new ProjectedAcceptanceTestItem.Actions(ProjectionValues.textList(it.getActions().getValue()));
		}
		if (it.getAssertions() != null) {
			return new ProjectedAcceptanceTestItem.Assertions(
					ProjectionValues.textList(it.getAssertions().getValue()));
		}
		if (it.getTitle() != null && it.getTitle().getValue() != null) {
			return new ProjectedAcceptanceTestItem.Title(ProjectionValues.text(it.getTitle().getValue()));
		}
		if (it.getReferences() != null) {
			return new ProjectedAcceptanceTestItem.References(
					ProjectionValues.refIdList(it.getReferences().getValue()));
		}
		if (it.getNotes() != null && it.getNotes().getValue() != null) {
			return new ProjectedAcceptanceTestItem.Notes(ProjectionValues.text(it.getNotes().getValue()));
		}
		if (it.getContext() != null && it.getContext().getValue() != null) {
			return new ProjectedAcceptanceTestItem.Context(ProjectionValues.text(it.getContext().getValue()));
		}
		return null;
	}

	private static ProjectedImplementationDirectivesSection mapImplementationDirectives(
			ImplementationDirectivesSection ids) {
		List<ProjectedImplementationDirectiveRecord> dirs = new ArrayList<>();
		for (ImplementationDirectiveRecord dr : ids.getRecords()) {
			List<ProjectedImplementationDirectiveItem> items = new ArrayList<>();
			for (ImplementationDirectiveRecordItem it : dr.getItems()) {
				ProjectedImplementationDirectiveItem p = mapDirectiveItem(it);
				if (p != null) {
					items.add(p);
				}
			}
			dirs.add(new ProjectedImplementationDirectiveRecord(dr.getId(), items));
		}
		return new ProjectedImplementationDirectivesSection(dirs);
	}

	private static ProjectedImplementationDirectiveItem mapDirectiveItem(ImplementationDirectiveRecordItem it) {
		if (it.getSource() != null) {
			return new ProjectedImplementationDirectiveItem.Source(mapSourceBlock(it.getSource()));
		}
		if (it.getAppliesTo() != null) {
			return new ProjectedImplementationDirectiveItem.AppliesTo(
					ProjectionValues.identifierList(it.getAppliesTo().getValue()));
		}
		if (it.getStrength() != null && it.getStrength().getValue() != null) {
			return new ProjectedImplementationDirectiveItem.Strength(
					mapStrength(it.getStrength().getValue()));
		}
		if (it.getDirective() != null && it.getDirective().getValue() != null) {
			return new ProjectedImplementationDirectiveItem.Directive(
					ProjectionValues.text(it.getDirective().getValue()));
		}
		if (it.getCategory() != null && it.getCategory().getValue() != null) {
			return new ProjectedImplementationDirectiveItem.Category(
					ProjectionNodeText.identifierText(it.getCategory().getValue()));
		}
		if (it.getConstraints() != null) {
			return new ProjectedImplementationDirectiveItem.Constraints(
					ProjectionValues.textList(it.getConstraints().getValue()));
		}
		if (it.getAllowedFlexibility() != null) {
			return new ProjectedImplementationDirectiveItem.AllowedFlexibility(
					ProjectionValues.textList(it.getAllowedFlexibility().getValue()));
		}
		if (it.getReferences() != null) {
			return new ProjectedImplementationDirectiveItem.References(
					ProjectionValues.refIdList(it.getReferences().getValue()));
		}
		if (it.getRationale() != null && it.getRationale().getValue() != null) {
			return new ProjectedImplementationDirectiveItem.Rationale(
					ProjectionValues.text(it.getRationale().getValue()));
		}
		if (it.getContext() != null && it.getContext().getValue() != null) {
			return new ProjectedImplementationDirectiveItem.Context(
					ProjectionValues.text(it.getContext().getValue()));
		}
		return null;
	}

	private static DirectiveStrength mapStrength(StrengthValue v) {
		return switch (v) {
			case REQUIRED -> DirectiveStrength.REQUIRED;
			case STRONGLY_PREFERRED -> DirectiveStrength.STRONGLY_PREFERRED;
			case PREFERRED -> DirectiveStrength.PREFERRED;
			case ADVISORY -> DirectiveStrength.ADVISORY;
			default -> DirectiveStrength.ADVISORY;
		};
	}
}
