package com.robenglander.libretto.spec.projection.mapper;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import com.robenglander.libretto.spec.librettoProjectProfile.GenBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.GenDefaultRemediationRule;
import com.robenglander.libretto.spec.librettoProjectProfile.GenEscalationBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.GenPatternRemediationRule;
import com.robenglander.libretto.spec.librettoProjectProfile.GenRemediationRules;
import com.robenglander.libretto.spec.librettoProjectProfile.GenUsageBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.JavaType;
import com.robenglander.libretto.spec.librettoProjectProfile.LlmProvidersBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.MethodOverrideRule;
import com.robenglander.libretto.spec.librettoProjectProfile.ModulesBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.NamedLlmProvider;
import com.robenglander.libretto.spec.librettoProjectProfile.OperationSignature;
import com.robenglander.libretto.spec.librettoProjectProfile.ParamTypeRule;
import com.robenglander.libretto.spec.librettoProjectProfile.PrimitiveType;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectModule;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectProfile;
import com.robenglander.libretto.spec.librettoProjectProfile.QualifiedName;
import com.robenglander.libretto.spec.librettoProjectProfile.RecordSelfReturnRule;
import com.robenglander.libretto.spec.librettoProjectProfile.ReturnTypeRule;
import com.robenglander.libretto.spec.librettoProjectProfile.ScopedSurface;
import com.robenglander.libretto.spec.librettoProjectProfile.SurfaceBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.SurfaceElement;
import com.robenglander.libretto.spec.librettoProjectProfile.SurfaceRule;
import com.robenglander.libretto.spec.librettoProjectProfile.TypedParam;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModel;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModelProjection;
import com.robenglander.libretto.spec.projection.ProjectProfileScopeKind;
import com.robenglander.libretto.spec.projection.ProjectedGenBlock;
import com.robenglander.libretto.spec.projection.ProjectedGenDefaultRemediationRule;
import com.robenglander.libretto.spec.projection.ProjectedGenEscalationBlock;
import com.robenglander.libretto.spec.projection.ProjectedGenPatternRemediationRule;
import com.robenglander.libretto.spec.projection.ProjectedGenRemediationRules;
import com.robenglander.libretto.spec.projection.ProjectedGenUsageBlock;
import com.robenglander.libretto.spec.projection.ProjectedJavaType;
import com.robenglander.libretto.spec.projection.ProjectedLlmProviderEntry;
import com.robenglander.libretto.spec.projection.ProjectedLlmProvidersBlock;
import com.robenglander.libretto.spec.projection.ProjectedMethodOverrideRule;
import com.robenglander.libretto.spec.projection.ProjectedModulesBlock;
import com.robenglander.libretto.spec.projection.ProjectedOperationSignature;
import com.robenglander.libretto.spec.projection.ProjectedParamTypeRule;
import com.robenglander.libretto.spec.projection.ProjectedPrimitiveJavaType;
import com.robenglander.libretto.spec.projection.ProjectedProjectBlock;
import com.robenglander.libretto.spec.projection.ProjectedProjectModuleEntry;
import com.robenglander.libretto.spec.projection.ProjectedQualifiedJavaType;
import com.robenglander.libretto.spec.projection.ProjectedRecordSelfReturnRule;
import com.robenglander.libretto.spec.projection.ProjectedReturnTypeRule;
import com.robenglander.libretto.spec.projection.ProjectedScopedSurface;
import com.robenglander.libretto.spec.projection.ProjectedSurfaceElement;
import com.robenglander.libretto.spec.projection.ProjectedSurfaceRule;
import com.robenglander.libretto.spec.projection.ProjectedTypedParam;

/**
 * EMF {@link ProjectProfile} → portable {@link LibrettoProjectProfileDomainModelProjection}.
 */
public final class LibrettoProjectProfileProjectionMapper {

	private LibrettoProjectProfileProjectionMapper() {
	}

	public static LibrettoProjectProfileDomainModelProjection project(ProjectProfile profile) {
		if (profile == null) {
			return new LibrettoProjectProfileDomainModelProjection(LibrettoProjectProfileDomainModel.empty());
		}
		String profileName = s(profile.getName());
		List<ProjectedSurfaceElement> surfaceElements = new ArrayList<>();
		for (SurfaceBlock sb : profile.getSurfaces()) {
			surfaceElements.addAll(mapSurfaceBlock(sb));
		}
		List<ProjectedProjectBlock> projectBlocks = new ArrayList<>();
		for (ProjectBlock pb : profile.getProjects()) {
			projectBlocks.add(mapProjectBlock(pb));
		}
		List<ProjectedLlmProvidersBlock> llmBlocks = new ArrayList<>();
		for (LlmProvidersBlock lb : profile.getLlmProviders()) {
			llmBlocks.add(mapLlmProvidersBlock(lb));
		}
		return new LibrettoProjectProfileDomainModelProjection(
				new LibrettoProjectProfileDomainModel(profileName, surfaceElements, projectBlocks, llmBlocks));
	}

	private static ProjectedLlmProvidersBlock mapLlmProvidersBlock(LlmProvidersBlock block) {
		if (block == null) {
			return new ProjectedLlmProvidersBlock(List.of());
		}
		List<ProjectedLlmProviderEntry> out = new ArrayList<>();
		for (NamedLlmProvider p : block.getProviders()) {
			out.add(new ProjectedLlmProviderEntry(
					s(p.getName()),
					copyStrings(p.getKinds()),
					copyStrings(p.getLocalModelPaths()),
					copyStrings(p.getModels()),
					copyStrings(p.getEndpoints())));
		}
		return new ProjectedLlmProvidersBlock(List.copyOf(out));
	}

	private static ProjectedProjectBlock mapProjectBlock(ProjectBlock pb) {
		if (pb == null) {
			return new ProjectedProjectBlock(List.of(), List.of(), List.of());
		}
		List<String> rootDirs = copyStrings(pb.getRootDir());
		List<ProjectedModulesBlock> modulesBlocks = new ArrayList<>();
		for (ModulesBlock mb : pb.getModules()) {
			modulesBlocks.add(mapModulesBlock(mb));
		}
		List<ProjectedGenBlock> genBlocks = new ArrayList<>();
		for (GenBlock g : pb.getGens()) {
			genBlocks.add(mapGenBlock(g));
		}
		return new ProjectedProjectBlock(rootDirs, List.copyOf(modulesBlocks), List.copyOf(genBlocks));
	}

	private static ProjectedModulesBlock mapModulesBlock(ModulesBlock mb) {
		if (mb == null) {
			return new ProjectedModulesBlock(List.of());
		}
		List<ProjectedProjectModuleEntry> modules = new ArrayList<>();
		for (ProjectModule m : mb.getModules()) {
			modules.add(mapModule(m));
		}
		return new ProjectedModulesBlock(List.copyOf(modules));
	}

	private static ProjectedProjectModuleEntry mapModule(ProjectModule m) {
		return new ProjectedProjectModuleEntry(
				s(m.getName()),
				copyStrings(m.getDirs()),
				copyStrings(m.getSpecDirs()),
				copyStrings(m.getTestDirs()),
				copyStrings(m.getMainDirs()),
				copyStrings(m.getBasePackages()));
	}

	private static ProjectedGenBlock mapGenBlock(GenBlock b) {
		if (b == null) {
			return new ProjectedGenBlock(List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
		}
		List<ProjectedGenRemediationRules> rem = new ArrayList<>();
		for (GenRemediationRules r : b.getRemediations()) {
			rem.add(mapGenRemediationRules(r));
		}
		List<ProjectedGenUsageBlock> usages = new ArrayList<>();
		for (GenUsageBlock u : b.getModelUsages()) {
			usages.add(mapGenUsageBlock(u));
		}
		return new ProjectedGenBlock(
				copyStrings(b.getInitialInstructions()),
				copyIntegers(b.getMaxRetries()),
				copyStrings(b.getParseChecks()),
				copyStrings(b.getDefaultCorrections()),
				List.copyOf(rem),
				List.copyOf(usages));
	}

	private static ProjectedGenRemediationRules mapGenRemediationRules(GenRemediationRules rules) {
		if (rules == null) {
			return new ProjectedGenRemediationRules(List.of(), List.of());
		}
		List<ProjectedGenPatternRemediationRule> pattern = new ArrayList<>();
		for (GenPatternRemediationRule pr : rules.getPatternRules()) {
			pattern.add(new ProjectedGenPatternRemediationRule(
					copyStrings(pr.getPatterns()),
					copyStrings(pr.getCodes()),
					copyStrings(pr.getCorrections())));
		}
		List<ProjectedGenDefaultRemediationRule> defaults = new ArrayList<>();
		for (GenDefaultRemediationRule dr : rules.getDefaultRemediations()) {
			defaults.add(new ProjectedGenDefaultRemediationRule(
					copyStrings(dr.getCodes()),
					copyStrings(dr.getCorrection())));
		}
		return new ProjectedGenRemediationRules(List.copyOf(pattern), List.copyOf(defaults));
	}

	private static ProjectedGenUsageBlock mapGenUsageBlock(GenUsageBlock u) {
		if (u == null) {
			return new ProjectedGenUsageBlock(List.of(), List.of(), List.of());
		}
		List<ProjectedGenEscalationBlock> esc = new ArrayList<>();
		for (GenEscalationBlock e : u.getEscalations()) {
			esc.add(mapGenEscalation(e));
		}
		return new ProjectedGenUsageBlock(
				copyStrings(u.getPrimaryProviders()),
				copyStrings(u.getSecondaryProviders()),
				List.copyOf(esc));
	}

	private static ProjectedGenEscalationBlock mapGenEscalation(GenEscalationBlock e) {
		if (e == null) {
			return new ProjectedGenEscalationBlock(List.of(), List.of());
		}
		return new ProjectedGenEscalationBlock(
				copyStrings(e.getEnableds()),
				copyIntegers(e.getEscalateAtRetries()));
	}

	private static List<String> copyStrings(EList<String> from) {
		if (from == null || from.isEmpty()) {
			return List.of();
		}
		return List.copyOf(from);
	}

	private static List<Integer> copyIntegers(EList<Integer> from) {
		if (from == null || from.isEmpty()) {
			return List.of();
		}
		return List.copyOf(from);
	}

	private static List<ProjectedSurfaceElement> mapSurfaceBlock(SurfaceBlock surface) {
		if (surface == null) {
			return List.of();
		}
		List<ProjectedSurfaceElement> out = new ArrayList<>();
		for (SurfaceElement el : surface.getElements()) {
			ProjectedSurfaceElement p = mapSurfaceElement(el);
			if (p != null) {
				out.add(p);
			}
		}
		return List.copyOf(out);
	}

	private static ProjectedSurfaceElement mapSurfaceElement(SurfaceElement el) {
		if (el instanceof ScopedSurface ss) {
			return mapScoped(ss);
		}
		if (el instanceof SurfaceRule rule) {
			return mapRuleAsElement(rule);
		}
		return null;
	}

	private static ProjectedScopedSurface mapScoped(ScopedSurface ss) {
		ProjectProfileScopeKind kind;
		String id;
		if (ss.getModuleId() != null) {
			kind = ProjectProfileScopeKind.MODULE;
			id = ss.getModuleId().trim();
		} else if (ss.getSpecId() != null) {
			kind = ProjectProfileScopeKind.SPEC;
			id = ss.getSpecId().trim();
		} else {
			kind = ProjectProfileScopeKind.MODULE;
			id = "";
		}
		List<ProjectedSurfaceRule> rules = new ArrayList<>();
		for (SurfaceRule r : ss.getRules()) {
			ProjectedSurfaceRule pr = mapRule(r);
			if (pr != null) {
				rules.add(pr);
			}
		}
		return new ProjectedScopedSurface(kind, id, rules);
	}

	private static ProjectedSurfaceElement mapRuleAsElement(SurfaceRule rule) {
		ProjectedSurfaceRule r = mapRule(rule);
		if (r == null) {
			return null;
		}
		return (ProjectedSurfaceElement) r;
	}

	private static ProjectedSurfaceRule mapRule(SurfaceRule rule) {
		if (rule instanceof ReturnTypeRule rtr) {
			ProjectedJavaType jt = mapJavaType(rtr.getJavaType());
			if (jt == null) {
				return null;
			}
			return new ProjectedReturnTypeRule(rtr.getName(), jt);
		}
		if (rule instanceof ParamTypeRule ptr) {
			ProjectedJavaType jt = mapJavaType(ptr.getJavaType());
			if (jt == null) {
				return null;
			}
			return new ProjectedParamTypeRule(ptr.getParamName(), jt);
		}
		if (rule instanceof RecordSelfReturnRule rs) {
			return new ProjectedRecordSelfReturnRule(new ArrayList<>(rs.getMethods()));
		}
		if (rule instanceof MethodOverrideRule mor) {
			ProjectedOperationSignature sig = mapSignature(mor.getSignature());
			ProjectedJavaType ret = mapJavaType(mor.getJavaType());
			if (sig == null || ret == null) {
				return null;
			}
			return new ProjectedMethodOverrideRule(sig, ret);
		}
		return null;
	}

	private static ProjectedOperationSignature mapSignature(OperationSignature sig) {
		if (sig == null) {
			return null;
		}
		List<ProjectedTypedParam> params = new ArrayList<>();
		for (TypedParam tp : sig.getParams()) {
			ProjectedJavaType t = mapJavaType(tp.getType());
			if (t == null) {
				return null;
			}
			params.add(new ProjectedTypedParam(t, tp.getParamName()));
		}
		return new ProjectedOperationSignature(sig.getName(), params);
	}

	private static ProjectedJavaType mapJavaType(JavaType t) {
		if (t == null) {
			return null;
		}
		if (t instanceof PrimitiveType p) {
			return new ProjectedPrimitiveJavaType(p.getKind());
		}
		if (t instanceof QualifiedName qn) {
			return new ProjectedQualifiedJavaType(new ArrayList<>(qn.getSegments()));
		}
		return null;
	}

	private static String s(String v) {
		return v == null ? "" : v.trim();
	}
}
