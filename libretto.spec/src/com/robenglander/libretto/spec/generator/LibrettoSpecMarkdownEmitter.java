package com.robenglander.libretto.spec.generator;

import com.robenglander.libretto.spec.librettoSpec.AcceptanceTestRecord;
import com.robenglander.libretto.spec.librettoSpec.AcceptanceTestsSection;
import com.robenglander.libretto.spec.librettoSpec.BehaviorRecord;
import com.robenglander.libretto.spec.librettoSpec.BehaviorRecordItem;
import com.robenglander.libretto.spec.librettoSpec.BehaviorsSection;
import com.robenglander.libretto.spec.librettoSpec.BoundaryExportsSection;
import com.robenglander.libretto.spec.librettoSpec.BoundaryImportsSection;
import com.robenglander.libretto.spec.librettoSpec.BoundaryRecord;
import com.robenglander.libretto.spec.librettoSpec.BoundaryRecordItem;
import com.robenglander.libretto.spec.librettoSpec.DependenciesSection;
import com.robenglander.libretto.spec.librettoSpec.DependencyRecord;
import com.robenglander.libretto.spec.librettoSpec.DependencyRecordItem;
import com.robenglander.libretto.spec.librettoSpec.IdentifierList;
import com.robenglander.libretto.spec.librettoSpec.IdentifierValue;
import com.robenglander.libretto.spec.librettoSpec.ImplementsSurfaceRecord;
import com.robenglander.libretto.spec.librettoSpec.ImplementsSurfaceSection;
import com.robenglander.libretto.spec.librettoSpec.MetadataField;
import com.robenglander.libretto.spec.librettoSpec.MetadataSection;
import com.robenglander.libretto.spec.librettoSpec.MetadataStatusValue;
import com.robenglander.libretto.spec.librettoSpec.OperationSurfaceRecord;
import com.robenglander.libretto.spec.librettoSpec.OperationSurfaceRecordItem;
import com.robenglander.libretto.spec.librettoSpec.OperationSurfaceSection;
import com.robenglander.libretto.spec.librettoSpec.OutcomeClassField;
import com.robenglander.libretto.spec.librettoSpec.OutOfScopeRecord;
import com.robenglander.libretto.spec.librettoSpec.OutOfScopeSection;
import com.robenglander.libretto.spec.librettoSpec.ProseRecord;
import com.robenglander.libretto.spec.librettoSpec.ProseSection;
import com.robenglander.libretto.spec.librettoSpec.ReferenceRecord;
import com.robenglander.libretto.spec.librettoSpec.ReferenceRecordItem;
import com.robenglander.libretto.spec.librettoSpec.ReferencesSection;
import com.robenglander.libretto.spec.librettoSpec.SectionContextRecord;
import com.robenglander.libretto.spec.librettoSpec.SectionContextRecordItem;
import com.robenglander.libretto.spec.librettoSpec.Spec;
import com.robenglander.libretto.spec.librettoSpec.SpecSection;
import com.robenglander.libretto.spec.librettoSpec.SubsectionContextRecord;
import com.robenglander.libretto.spec.librettoSpec.SubsectionContextRecordItem;
import com.robenglander.libretto.spec.librettoSpec.TextValue;
import com.robenglander.libretto.spec.librettoSpec.LibrettoSpecPackage;
import com.robenglander.libretto.spec.model.LibrettoSpecTextValues;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * Deterministic Markdown projection from the Xtext/EMF Libretto model, aligned with
 * {@code LibrettoMarkdownProjection} + {@code AuthoredMarkdownEmitter} in the {@code libretto-core} module.
 */
public final class LibrettoSpecMarkdownEmitter {

    private static final Map<String, String> HEADER_KEY_LABEL = Map.of(
            "spec", "Spec",
            "module", "Module",
            "visibility", "Visibility",
            "package", "Package");

    /** Sections excluded from authored prose when ingesting Libretto (matches {@code LibrettoMarkdownProjection}). */
    private static final Set<String> INGEST_PROSE_SKIP = Set.of(
            "Architecture Metadata",
            "File Organization",
            "Operation Surface",
            "Implements Surface",
            "Boundary Exports",
            "Boundary Imports");

    /** Sections not emitted as free {@code ##} blocks (matches {@code AuthoredMarkdownEmitter}). */
    private static final Set<String> EMIT_PROSE_SKIP = Set.of(
            "architecture metadata",
            "file organization",
            "out of scope (non-goals)",
            "core behaviors",
            "acceptance tests",
            "references",
            "operation surface",
            "implements surface",
            "boundary exports",
            "boundary imports");

    private LibrettoSpecMarkdownEmitter() {
    }

    public static String emit(Spec spec) {
        if (spec == null) {
            throw new IllegalArgumentException("spec must not be null");
        }
        var header = new LinkedHashMap<String, String>();
        header.put("spec", nullToEmpty(spec.getSpecId()).trim());

        var architecture = new LinkedHashMap<String, String>();
        var fileRows = new ArrayList<FileOrganizationRow>();
        var proseContexts = new ArrayList<ProseContext>();
        var outOfScope = new ArrayList<OutOfScopeEntry>();
        var operationSurface = new ArrayList<OperationEntry>();
        var implementsTargets = new ArrayList<String>();
        var boundaryExports = new ArrayList<BoundaryEntry>();
        var boundaryImports = new ArrayList<BoundaryEntry>();
        var behaviors = new ArrayList<BehaviorEntry>();
        var acceptanceTests = new ArrayList<AcceptanceEntry>();
        var references = new ArrayList<ReferenceEntry>();

        for (SpecSection section : spec.getSections()) {
            if (section instanceof MetadataSection ms) {
                ingestMetadataHeader(ms, header);
            } else if (section instanceof DependenciesSection ds) {
                ingestDependencies(ds, architecture);
            } else if (section instanceof ProseSection ps) {
                ingestProse(ps, architecture, fileRows, proseContexts);
            } else if (section instanceof ReferencesSection rs) {
                ingestReferences(rs, references);
            } else if (section instanceof OutOfScopeSection oss) {
                ingestOutOfScope(oss, outOfScope);
            } else if (section instanceof OperationSurfaceSection opss) {
                ingestOperationSurface(opss, operationSurface);
            } else if (section instanceof ImplementsSurfaceSection imps) {
                ingestImplementsSurface(imps, implementsTargets);
            } else if (section instanceof BoundaryExportsSection bes) {
                ingestBoundaries(bes.getRecords(), boundaryExports);
            } else if (section instanceof BoundaryImportsSection bis) {
                ingestBoundaries(bis.getRecords(), boundaryImports);
            } else if (section instanceof BehaviorsSection bs) {
                ingestBehaviors(bs, behaviors);
            } else if (section instanceof AcceptanceTestsSection ats) {
                ingestAcceptanceTests(ats, acceptanceTests);
            }
        }

        StringBuilder sb = new StringBuilder();
        emitHeader(header, sb);
        emitArchitectureTable(architecture, sb);
        emitFileOrganizationTable(fileRows, sb);
        emitFreeProse(proseContexts, sb);
        emitOutOfScope(outOfScope, sb);
        emitOperationSurface(operationSurface, sb);
        emitImplementsSurface(implementsTargets, sb);
        emitBoundaries(boundaryExports, "Boundary Exports", sb);
        emitBoundaries(boundaryImports, "Boundary Imports", sb);
        emitBehaviors(behaviors, sb);
        emitAcceptanceTests(acceptanceTests, sb);
        emitReferences(references, sb);

        return sb.toString().replaceAll("(\\n{3,})", "\n\n").trim() + "\n";
    }

    private static void ingestMetadataHeader(MetadataSection ms, Map<String, String> header) {
        for (MetadataField f : ms.getFields()) {
            String mod = textAttr(f.getModuleName());
            if (!mod.isBlank()) {
                header.put("module", mod);
            }
            String pkg = textAttr(f.getJavaPackage());
            if (!pkg.isBlank()) {
                header.put("package", pkg);
            }
            if (f.getStatus() != null) {
                MetadataStatusValue st = f.getStatus();
                header.put("visibility", st.getLiteral());
            }
        }
    }

    private static void ingestDependencies(DependenciesSection ds, Map<String, String> architecture) {
        List<String> arch = new ArrayList<>();
        for (DependencyRecord dep : ds.getRecords()) {
            for (DependencyRecordItem item : dep.getItems()) {
                if (item.getTargetSpec() == null || item.getTargetSpec().getValue() == null) {
                    continue;
                }
                String target = textAttr(item.getTargetSpec().getValue());
                if (!target.isBlank() && !"none".equalsIgnoreCase(target)) {
                    arch.add(target);
                }
            }
        }
        if (!arch.isEmpty()) {
            architecture.put("dependencies", String.join(", ", arch));
        }
    }

    private static void ingestProse(
            ProseSection ps,
            Map<String, String> architecture,
            List<FileOrganizationRow> fileRows,
            List<ProseContext> proseContexts) {
        for (ProseRecord pr : ps.getRecords()) {
            if (pr instanceof SectionContextRecord scr) {
                var secF = firstSectionField(scr.getItems());
                var textF = firstTextField(scr.getItems());
                if (secF == null || textF == null) {
                    continue;
                }
                String section = textAttr(secF.getValue());
                String text = textAttr(textF.getValue());
                if (!INGEST_PROSE_SKIP.contains(section)) {
                    proseContexts.add(new ProseContext(section, "", text));
                }
            } else if (pr instanceof SubsectionContextRecord sscr) {
                var sSec = firstSubsectionSectionField(sscr.getItems());
                var sSub = firstSubsectionSubsectionField(sscr.getItems());
                var sText = firstSubsectionTextField(sscr.getItems());
                if (sSec == null || sSub == null || sText == null) {
                    continue;
                }
                String section = textAttr(sSec.getValue());
                String subsection = textAttr(sSub.getValue());
                String text = textAttr(sText.getValue());
                if ("Architecture Metadata".equals(section)) {
                    architecture.put(subsection, text);
                } else if ("File Organization".equals(section)) {
                    FileOrganizationRow row = parseFileOrganizationText(subsection, text);
                    if (row != null) {
                        fileRows.add(row);
                    }
                } else if (!INGEST_PROSE_SKIP.contains(section)) {
                    proseContexts.add(new ProseContext(section, subsection, text));
                }
            }
        }
    }

    private static com.robenglander.libretto.spec.librettoSpec.SectionField firstSectionField(
            List<SectionContextRecordItem> items) {
        for (SectionContextRecordItem it : items) {
            if (it.getSection() != null) {
                return it.getSection();
            }
        }
        return null;
    }

    private static com.robenglander.libretto.spec.librettoSpec.TextField firstTextField(
            List<SectionContextRecordItem> items) {
        for (SectionContextRecordItem it : items) {
            if (it.getText() != null) {
                return it.getText();
            }
        }
        return null;
    }

    private static com.robenglander.libretto.spec.librettoSpec.SectionField firstSubsectionSectionField(
            List<SubsectionContextRecordItem> items) {
        for (SubsectionContextRecordItem it : items) {
            if (it.getSection() != null) {
                return it.getSection();
            }
        }
        return null;
    }

    private static com.robenglander.libretto.spec.librettoSpec.SubsectionField firstSubsectionSubsectionField(
            List<SubsectionContextRecordItem> items) {
        for (SubsectionContextRecordItem it : items) {
            if (it.getSubsection() != null) {
                return it.getSubsection();
            }
        }
        return null;
    }

    private static com.robenglander.libretto.spec.librettoSpec.TextField firstSubsectionTextField(
            List<SubsectionContextRecordItem> items) {
        for (SubsectionContextRecordItem it : items) {
            if (it.getText() != null) {
                return it.getText();
            }
        }
        return null;
    }

    private static void ingestReferences(ReferencesSection rs, List<ReferenceEntry> references) {
        for (ReferenceRecord ref : rs.getRecords()) {
            String title = null;
            String citation = null;
            String subsection = "";
            for (ReferenceRecordItem item : ref.getItems()) {
                if (title == null && item.getTitle() != null && item.getTitle().getValue() != null) {
                    title = textAttr(item.getTitle().getValue());
                }
                if (citation == null && item.getCitation() != null && item.getCitation().getValue() != null) {
                    citation = textAttr(item.getCitation().getValue());
                }
                if (subsection.isEmpty() && item.getContext() != null && item.getContext().getValue() != null) {
                    subsection = textAttr(item.getContext().getValue());
                }
            }
            if (title != null && citation != null) {
                references.add(new ReferenceEntry(subsection, citation));
            }
        }
    }

    private static void ingestOutOfScope(OutOfScopeSection oss, List<OutOfScopeEntry> out) {
        for (OutOfScopeRecord rec : oss.getRecords()) {
            String id = nullToEmpty(rec.getId()).trim();
            String statement = "";
            for (var item : rec.getItems()) {
                if (item.getStatement() != null && item.getStatement().getValue() != null) {
                    statement = textAttr(item.getStatement().getValue());
                    break;
                }
            }
            if (!id.isEmpty() && !statement.isEmpty()) {
                out.add(new OutOfScopeEntry(id, statement));
            }
        }
    }

    private static void ingestOperationSurface(OperationSurfaceSection opss, List<OperationEntry> operationSurface) {
        for (OperationSurfaceRecord rec : opss.getRecords()) {
            String opId = nullToEmpty(rec.getId()).trim();
            String expr = "";
            String outcome = "";
            for (OperationSurfaceRecordItem item : rec.getItems()) {
                if (item.getOperationExpression() != null && item.getOperationExpression().getValue() != null) {
                    expr = textAttr(item.getOperationExpression().getValue());
                }
                if (item.getOutcomeClass() != null) {
                    OutcomeClassField ocf = item.getOutcomeClass();
                    if (ocf.getValue() != null) {
                        outcome = ocf.getValue().getLiteral().toLowerCase(Locale.ROOT);
                    }
                }
            }
            if (!opId.isEmpty() && !expr.isEmpty() && !outcome.isEmpty()) {
                operationSurface.add(new OperationEntry(opId, expr, outcome));
            }
        }
    }

    private static void ingestImplementsSurface(ImplementsSurfaceSection imps, List<String> implementsTargets) {
        for (ImplementsSurfaceRecord rec : imps.getRecords()) {
            rec.getItems().forEach(item -> {
                if (item.getTargetSpec() != null && item.getTargetSpec().getValue() != null) {
                    String v = textAttr(item.getTargetSpec().getValue());
                    if (!v.isBlank()) {
                        implementsTargets.add(v);
                    }
                }
            });
        }
    }

    private static void ingestBoundaries(List<BoundaryRecord> records, List<BoundaryEntry> dest) {
        for (BoundaryRecord rec : records) {
            dest.add(readBoundary(rec));
        }
    }

    private static BoundaryEntry readBoundary(BoundaryRecord rec) {
        String specId = "";
        String opId = "";
        String profileId = "";
        String raw = "";
        for (BoundaryRecordItem item : rec.getItems()) {
            if (item.getSpecIdField() != null && item.getSpecIdField().getValue() != null) {
                specId = textAttr(item.getSpecIdField().getValue());
            }
            if (item.getOperationIdField() != null && item.getOperationIdField().getValue() != null) {
                opId = textAttr(item.getOperationIdField().getValue());
            }
            if (item.getProfileIdField() != null && item.getProfileIdField().getValue() != null) {
                profileId = textAttr(item.getProfileIdField().getValue());
            }
            if (item.getRawField() != null && item.getRawField().getValue() != null) {
                raw = textAttr(item.getRawField().getValue());
            }
        }
        return new BoundaryEntry(specId, opId, profileId, raw);
    }

    private static void ingestBehaviors(BehaviorsSection bs, List<BehaviorEntry> behaviors) {
        for (BehaviorRecord br : bs.getRecords()) {
            var actor = firstActor(br);
            var action = firstAction(br);
            var objectsF = firstObjects(br);
            var readsF = firstReads(br);
            var writesF = firstWrites(br);
            var condF = firstConditions(br);
            var outF = firstOutcomes(br);
            if (actor == null || action == null || objectsF == null || readsF == null || writesF == null
                    || condF == null || outF == null) {
                continue;
            }
            String id = nullToEmpty(br.getId()).trim();
            var contract = new LinkedHashMap<String, String>();
            contract.put("actor", normalizeIdentifierValue(actor.getValue()));
            contract.put("action", normalizeIdentifierValue(action.getValue()));
            List<String> objects = readIdentifierList(objectsF.getValue());
            if (objects.size() == 1) {
                contract.put("object", objects.get(0));
            } else {
                contract.put("objects", formatIdentifierListForContract(objects));
            }
            contract.put("reads", formatIdentifierListForContract(readIdentifierList(readsF.getValue())));
            contract.put("writes", formatIdentifierListForContract(readIdentifierList(writesF.getValue())));
            contract.put("when", formatWhen(readTextList(condF.getValue())));
            contract.put("then", formatThen(readTextList(outF.getValue())));
            behaviors.add(new BehaviorEntry(id, contract));
        }
    }

    private static com.robenglander.libretto.spec.librettoSpec.ActorField firstActor(BehaviorRecord br) {
        for (BehaviorRecordItem it : br.getItems()) {
            if (it.getActor() != null) {
                return it.getActor();
            }
        }
        return null;
    }

    private static com.robenglander.libretto.spec.librettoSpec.ActionField firstAction(BehaviorRecord br) {
        for (BehaviorRecordItem it : br.getItems()) {
            if (it.getAction() != null) {
                return it.getAction();
            }
        }
        return null;
    }

    private static com.robenglander.libretto.spec.librettoSpec.ObjectsField firstObjects(BehaviorRecord br) {
        for (BehaviorRecordItem it : br.getItems()) {
            if (it.getObjects() != null) {
                return it.getObjects();
            }
        }
        return null;
    }

    private static com.robenglander.libretto.spec.librettoSpec.ReadsField firstReads(BehaviorRecord br) {
        for (BehaviorRecordItem it : br.getItems()) {
            if (it.getReads() != null) {
                return it.getReads();
            }
        }
        return null;
    }

    private static com.robenglander.libretto.spec.librettoSpec.WritesField firstWrites(BehaviorRecord br) {
        for (BehaviorRecordItem it : br.getItems()) {
            if (it.getWrites() != null) {
                return it.getWrites();
            }
        }
        return null;
    }

    private static com.robenglander.libretto.spec.librettoSpec.ConditionsField firstConditions(BehaviorRecord br) {
        for (BehaviorRecordItem it : br.getItems()) {
            if (it.getConditions() != null) {
                return it.getConditions();
            }
        }
        return null;
    }

    private static com.robenglander.libretto.spec.librettoSpec.OutcomesField firstOutcomes(BehaviorRecord br) {
        for (BehaviorRecordItem it : br.getItems()) {
            if (it.getOutcomes() != null) {
                return it.getOutcomes();
            }
        }
        return null;
    }

    private static void ingestAcceptanceTests(AcceptanceTestsSection ats, List<AcceptanceEntry> acceptanceTests) {
        for (AcceptanceTestRecord tr : ats.getRecords()) {
            var valF = firstValidates(tr);
            var preF = firstPreconditions(tr);
            var actF = firstActions(tr);
            var assF = firstAssertions(tr);
            if (valF == null || preF == null || actF == null || assF == null) {
                continue;
            }
            String id = nullToEmpty(tr.getId()).trim();
            var at = new AcceptanceEntry(id);
            for (String bid : valF.getValue().getValues()) {
                if (bid != null && !bid.isBlank()) {
                    at.behaviorIds.add(bid.trim());
                }
            }
            for (String p : readTextList(preF.getValue())) {
                if (p != null && !p.trim().isEmpty()) {
                    at.preconditionLines.add(p.trim());
                }
            }
            List<String> actions = readTextList(actF.getValue());
            if (actions.size() == 1) {
                at.whenLine = actions.get(0);
            } else if (actions.size() > 1) {
                at.whenLine = String.join("\n", actions);
            }
            for (String a : readTextList(assF.getValue())) {
                if (a != null && !a.trim().isEmpty()) {
                    at.assertionLines.add(a.trim());
                }
            }
            acceptanceTests.add(at);
        }
    }

    private static com.robenglander.libretto.spec.librettoSpec.ValidatesField firstValidates(AcceptanceTestRecord tr) {
        for (var it : tr.getItems()) {
            if (it.getValidates() != null) {
                return it.getValidates();
            }
        }
        return null;
    }

    private static com.robenglander.libretto.spec.librettoSpec.PreconditionsField firstPreconditions(
            AcceptanceTestRecord tr) {
        for (var it : tr.getItems()) {
            if (it.getPreconditions() != null) {
                return it.getPreconditions();
            }
        }
        return null;
    }

    private static com.robenglander.libretto.spec.librettoSpec.ActionsField firstActions(AcceptanceTestRecord tr) {
        for (var it : tr.getItems()) {
            if (it.getActions() != null) {
                return it.getActions();
            }
        }
        return null;
    }

    private static com.robenglander.libretto.spec.librettoSpec.AssertionsField firstAssertions(
            AcceptanceTestRecord tr) {
        for (var it : tr.getItems()) {
            if (it.getAssertions() != null) {
                return it.getAssertions();
            }
        }
        return null;
    }

    private static FileOrganizationRow parseFileOrganizationText(String type, String text) {
        if (text == null || text.isBlank()) {
            return null;
        }
        String file = null;
        String description = null;
        for (String line : text.split("\\R")) {
            String l = line.trim();
            if (l.isEmpty()) {
                continue;
            }
            int eq = l.indexOf('=');
            if (eq < 0) {
                continue;
            }
            String key = l.substring(0, eq).trim().toLowerCase(Locale.ROOT);
            String value = textAttr(l.substring(eq + 1));
            if ("file".equals(key)) {
                file = value;
            } else if ("description".equals(key)) {
                description = value;
            }
        }
        if (file == null && description == null) {
            return null;
        }
        String typ = type == null || type.isBlank() ? "entry" : type;
        return new FileOrganizationRow(typ, file == null ? "" : file, description == null ? "" : description);
    }

    private static String formatWhen(List<String> conditions) {
        if (conditions == null || conditions.isEmpty()) {
            return "";
        }
        if (conditions.size() == 1) {
            return conditions.get(0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("all of:\n");
        for (String c : conditions) {
            sb.append("  - ").append(c).append("\n");
        }
        return sb.toString().trim();
    }

    private static String formatThen(List<String> outcomes) {
        if (outcomes == null || outcomes.isEmpty()) {
            return "";
        }
        if (outcomes.size() == 1) {
            return outcomes.get(0);
        }
        StringBuilder sb = new StringBuilder();
        for (String o : outcomes) {
            sb.append("  - ").append(o).append("\n");
        }
        return sb.toString().trim();
    }

    private static String formatIdentifierListForContract(List<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return "[]";
        }
        return "[" + String.join(", ", ids) + "]";
    }

    private static List<String> readIdentifierList(IdentifierList list) {
        if (list == null) {
            return Collections.emptyList();
        }
        var values = list.getValues();
        if (values.isEmpty()) {
            return new ArrayList<>();
        }
        List<INode> featureNodes = NodeModelUtils.findNodesForFeature(
                list, LibrettoSpecPackage.eINSTANCE.getIdentifierList_Values());
        if (featureNodes != null && featureNodes.size() == values.size()) {
            List<String> out = new ArrayList<>(values.size());
            for (INode n : featureNodes) {
                out.add(stripCaretKeywordEscapes(NodeModelUtils.getTokenText(n).trim()));
            }
            return out;
        }
        List<String> out = new ArrayList<>();
        for (IdentifierValue iv : values) {
            out.add(normalizeIdentifierValue(iv));
        }
        return out;
    }

    private static List<String> readTextList(com.robenglander.libretto.spec.librettoSpec.TextList ctx) {
        if (ctx == null) {
            return Collections.emptyList();
        }
        List<String> out = new ArrayList<>();
        for (TextValue tv : ctx.getValues()) {
            if (tv != null) {
                out.add(LibrettoSpecTextValues.text(tv));
            }
        }
        return out;
    }

    /**
     * Text for an {@link IdentifierValue}. {@link NodeModelUtils#findActualNodeFor(EObject)} is often
     * {@code null} for parser-rule-only values in Xtext; fall back to {@link NodeModelUtils#findNodesForFeature}
     * on the containing {@code actor} / {@code action} / {@code objects} field (or {@link IdentifierList}).
     */
    private static String normalizeIdentifierValue(IdentifierValue iv) {
        if (iv == null) {
            return "";
        }
        INode direct = NodeModelUtils.findActualNodeFor(iv);
        if (direct != null) {
            return stripCaretKeywordEscapes(NodeModelUtils.getTokenText(direct).trim());
        }
        EObject container = iv.eContainer();
        EStructuralFeature feat = iv.eContainmentFeature();
        if (container == null || feat == null) {
            return "";
        }
        List<INode> nodes = NodeModelUtils.findNodesForFeature(container, feat);
        if (nodes == null || nodes.isEmpty()) {
            return "";
        }
        if (feat.isMany()) {
            int idx = indexInFeature(container, feat, iv);
            if (idx >= 0 && idx < nodes.size()) {
                return stripCaretKeywordEscapes(NodeModelUtils.getTokenText(nodes.get(idx)).trim());
            }
        } else {
            return stripCaretKeywordEscapes(NodeModelUtils.getTokenText(nodes.get(0)).trim());
        }
        return "";
    }

    private static int indexInFeature(EObject container, EStructuralFeature feat, EObject child) {
        if (!feat.isMany()) {
            return 0;
        }
        Object v = container.eGet(feat);
        if (!(v instanceof List<?> list)) {
            return -1;
        }
        return list.indexOf(child);
    }

    private static String stripCaretKeywordEscapes(String raw) {
        if (raw == null || raw.isEmpty()) {
            return "";
        }
        String t = raw.trim();
        String[] parts = t.split("\\.", -1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            if (i > 0) {
                sb.append('.');
            }
            String p = parts[i];
            if (p.startsWith("^") && p.length() > 1) {
                sb.append(p, 1, p.length());
            } else {
                sb.append(p);
            }
        }
        return sb.toString();
    }

    /**
     * Xtext often persists {@code STRING} / {@code TEXT_BLOCK} terminals with delimiters still on the attribute.
     * Mirrors {@code LibrettoMarkdownProjection#decodeTextValue}.
     */
    static String decodeText(String raw) {
        if (raw == null) {
            return "";
        }
        String t = raw.trim();
        if (t.length() >= 6 && t.startsWith("\"\"\"") && t.endsWith("\"\"\"")) {
            return unquoteTextBlock(t);
        }
        if (t.length() >= 2 && t.startsWith("\"") && t.endsWith("\"")) {
            return unquoteString(t);
        }
        return t;
    }

    private static String textAttr(String s) {
        return decodeText(nullToEmpty(s)).trim();
    }

    /** Decoded body from {@link TextValue#getText()} (no string delimiters). */
    private static String textAttr(TextValue tv) {
        return LibrettoSpecTextValues.text(tv).trim();
    }

    private static String unquoteString(String raw) {
        if (raw == null || raw.length() < 2) {
            return "";
        }
        String inner = raw.substring(1, raw.length() - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inner.length(); i++) {
            char c = inner.charAt(i);
            if (c == '\\' && i + 1 < inner.length()) {
                sb.append(inner.charAt(i + 1));
                i++;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static String unquoteTextBlock(String raw) {
        if (raw == null || raw.length() < 6) {
            return "";
        }
        String inner = raw.substring(3, raw.length() - 3);
        String triple = inner.replace("\\\"\"\"", "\"\"\"");
        return triple.replace("\r\n", "\n");
    }

    private static void emitHeader(Map<String, String> header, StringBuilder sb) {
        boolean any = false;
        for (String key : List.of("spec", "module", "visibility", "package")) {
            String v = header.get(key);
            if (v != null && !v.isBlank()) {
                String label = HEADER_KEY_LABEL.getOrDefault(key, key);
                sb.append("**").append(label).append(":** ").append(v).append("\n");
                any = true;
            }
        }
        if (any) {
            sb.append("\n---\n\n");
        }
    }

    private static void emitArchitectureTable(Map<String, String> architecture, StringBuilder sb) {
        if (architecture.isEmpty()) {
            return;
        }
        sb.append("## Architecture Metadata\n\n");
        sb.append("| Field | Value |\n");
        sb.append("|-------|-------|\n");
        for (Map.Entry<String, String> e : architecture.entrySet()) {
            sb.append("| ").append(e.getKey()).append(" | ").append(e.getValue()).append(" |\n");
        }
        sb.append("\n---\n\n");
    }

    private static void emitFileOrganizationTable(List<FileOrganizationRow> rows, StringBuilder sb) {
        if (rows.isEmpty()) {
            return;
        }
        sb.append("## File Organization\n\n");
        sb.append("| Type | File | Description |\n");
        sb.append("|------|------|-------------|\n");
        for (FileOrganizationRow row : rows) {
            sb.append("| ").append(row.type).append(" | ")
                    .append(row.file).append(" | ")
                    .append(row.description).append(" |\n");
        }
        sb.append("\n---\n\n");
    }

    private static void emitFreeProse(List<ProseContext> proseContexts, StringBuilder sb) {
        for (ProseContext pc : proseContexts) {
            String sec = pc.section == null ? "" : pc.section.trim();
            if (sec.isEmpty() || EMIT_PROSE_SKIP.contains(sec.toLowerCase(Locale.ROOT))) {
                continue;
            }
            sb.append("## ").append(sec).append("\n\n");
            if (pc.subsection != null && !pc.subsection.isBlank()) {
                sb.append("### ").append(pc.subsection.trim()).append("\n\n");
            }
            sb.append(pc.text.trim()).append("\n\n---\n\n");
        }
    }

    private static void emitOutOfScope(List<OutOfScopeEntry> units, StringBuilder sb) {
        if (units.isEmpty()) {
            return;
        }
        sb.append("## Out of Scope (Non-Goals)\n\n");
        for (OutOfScopeEntry o : units) {
            sb.append(o.id).append(": ").append(o.statement.trim()).append("\n\n");
        }
        sb.append("---\n\n");
    }

    private static void emitOperationSurface(List<OperationEntry> entries, StringBuilder sb) {
        if (entries.isEmpty()) {
            return;
        }
        sb.append("## Operation Surface\n\n");
        for (OperationEntry e : entries) {
            sb.append(e.operationId.trim()).append("|")
                    .append(e.operation.trim()).append("|")
                    .append(e.outcomeClass.trim().toLowerCase(Locale.ROOT))
                    .append("\n\n");
        }
        sb.append("---\n\n");
    }

    private static void emitImplementsSurface(List<String> targets, StringBuilder sb) {
        if (targets.isEmpty()) {
            return;
        }
        sb.append("## Implements Surface\n\n");
        for (String t : targets) {
            sb.append("- ").append(t.trim()).append("\n");
        }
        sb.append("\n---\n\n");
    }

    private static void emitBoundaries(List<BoundaryEntry> entries, String title, StringBuilder sb) {
        if (entries == null || entries.isEmpty()) {
            return;
        }
        sb.append("## ").append(title).append("\n\n");
        for (BoundaryEntry e : entries) {
            if (e.raw != null && !e.raw.isBlank()) {
                sb.append("- ").append(e.raw.trim()).append("\n");
            } else {
                sb.append("- spec_id: ").append(e.specId.trim())
                        .append(", operation_id: ").append(e.operationId.trim());
                if (e.profileId != null && !e.profileId.isBlank()) {
                    sb.append(", profile_id: ").append(e.profileId.trim());
                }
                sb.append("\n");
            }
        }
        sb.append("\n---\n\n");
    }

    private static void emitBehaviors(List<BehaviorEntry> behaviors, StringBuilder sb) {
        if (behaviors.isEmpty()) {
            return;
        }
        sb.append("## Core Behaviors\n\n");
        boolean first = true;
        for (BehaviorEntry b : behaviors) {
            if (!first) {
                sb.append("\n");
            }
            first = false;
            sb.append(b.id).append("\n\n");
            sb.append("```contract\n");
            sb.append(renderContract(b.contract));
            sb.append("```\n\n");
        }
    }

    private static String renderContract(Map<String, String> c) {
        StringBuilder o = new StringBuilder();
        emitContractField(o, "actor", c.get("actor"));
        emitContractField(o, "action", c.get("action"));
        if (c.get("object") != null && !c.get("object").isBlank()) {
            emitContractField(o, "object", c.get("object"));
        } else {
            emitContractField(o, "objects", c.get("objects"));
        }
        emitContractField(o, "reads", c.get("reads"));
        emitContractField(o, "writes", c.get("writes"));
        emitContractField(o, "when", c.get("when"));
        emitContractField(o, "then", c.get("then"));
        return o.toString();
    }

    private static void emitContractField(StringBuilder o, String key, String value) {
        if (value == null || value.isBlank()) {
            return;
        }
        o.append(key).append(": ");
        String multiline = value.stripTrailing();
        if (!multiline.contains("\n")) {
            o.append(multiline).append('\n');
            return;
        }
        int firstNl = multiline.indexOf('\n');
        o.append(multiline, 0, firstNl).append('\n');
        String rest = multiline.substring(firstNl + 1);
        for (String line : rest.split("\\R", -1)) {
            o.append(line).append('\n');
        }
    }

    private static void emitAcceptanceTests(List<AcceptanceEntry> tests, StringBuilder sb) {
        if (tests.isEmpty()) {
            return;
        }
        sb.append("## Acceptance Tests\n\n");
        boolean firstAt = true;
        for (AcceptanceEntry at : tests) {
            if (!firstAt) {
                sb.append("\n");
            }
            firstAt = false;
            List<String> refs = new ArrayList<>(at.behaviorIds);
            Collections.sort(refs);
            String refBracket = refs.isEmpty() ? "" : " [" + String.join(", ", refs) + "]";
            sb.append(at.id).append(refBracket).append(":");
            if (!at.preconditionLines.isEmpty()) {
                sb.append(" ").append(at.preconditionLines.get(0));
            }
            sb.append("\n\n");
            for (int i = 1; i < at.preconditionLines.size(); i++) {
                sb.append(at.preconditionLines.get(i).trim()).append("\n\n");
            }
            if (at.whenLine != null && !at.whenLine.isBlank()) {
                sb.append(at.whenLine.trim()).append("\n\n");
            }
            for (String assertion : at.assertionLines) {
                sb.append(assertion.trim()).append("\n\n");
            }
        }
    }

    private static void emitReferences(List<ReferenceEntry> references, StringBuilder sb) {
        if (references.isEmpty()) {
            return;
        }
        sb.append("## References\n\n");
        Map<String, List<ReferenceEntry>> bySub = new LinkedHashMap<>();
        for (ReferenceEntry r : references) {
            String sub = r.section == null ? "" : r.section.trim();
            bySub.computeIfAbsent(sub, k -> new ArrayList<>()).add(r);
        }
        for (Map.Entry<String, List<ReferenceEntry>> e : bySub.entrySet()) {
            if (!e.getKey().isBlank()) {
                sb.append("### ").append(e.getKey()).append("\n");
            }
            for (ReferenceEntry r : e.getValue()) {
                sb.append("- ").append(r.citation.trim()).append("\n");
            }
            sb.append("\n");
        }
    }

    private static String nullToEmpty(String s) {
        return s == null ? "" : s;
    }

    private record FileOrganizationRow(String type, String file, String description) {
    }

    private record ProseContext(String section, String subsection, String text) {
    }

    private record OutOfScopeEntry(String id, String statement) {
    }

    private record OperationEntry(String operationId, String operation, String outcomeClass) {
    }

    private record BoundaryEntry(String specId, String operationId, String profileId, String raw) {
    }

    private record BehaviorEntry(String id, Map<String, String> contract) {
    }

    private static final class AcceptanceEntry {
        final String id;
        final List<String> behaviorIds = new ArrayList<>();
        final List<String> preconditionLines = new ArrayList<>();
        String whenLine;
        final List<String> assertionLines = new ArrayList<>();

        AcceptanceEntry(String id) {
            this.id = id;
        }
    }

    private record ReferenceEntry(String section, String citation) {
    }
}
