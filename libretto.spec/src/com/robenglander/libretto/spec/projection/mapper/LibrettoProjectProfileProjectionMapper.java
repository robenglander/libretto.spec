package com.robenglander.libretto.spec.projection.mapper;

import java.util.ArrayList;
import java.util.List;

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
import com.robenglander.libretto.spec.librettoProjectProfile.TestGenBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.TestGenDefaultRemediationRule;
import com.robenglander.libretto.spec.librettoProjectProfile.TestGenEscalationBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.TestGenLegacyRemediationRule;
import com.robenglander.libretto.spec.librettoProjectProfile.TestGenLegacyRemediationRulesBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.TestGenModulePolicy;
import com.robenglander.libretto.spec.librettoProjectProfile.TestGenPatternRemediationRule;
import com.robenglander.libretto.spec.librettoProjectProfile.TestGenRemediationRulesContainer;
import com.robenglander.libretto.spec.librettoProjectProfile.TestGenRemediationsBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.TestGenUsageBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.TypedParam;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModel;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModelProjection;
import com.robenglander.libretto.spec.projection.ProjectProfileScopeKind;
import com.robenglander.libretto.spec.projection.ProjectedJavaType;
import com.robenglander.libretto.spec.projection.ProjectedLlmProviderEntry;
import com.robenglander.libretto.spec.projection.ProjectedMethodOverrideRule;
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
import com.robenglander.libretto.spec.projection.ProjectedTestGenBlock;
import com.robenglander.libretto.spec.projection.ProjectedTestGenDefaultRemediation;
import com.robenglander.libretto.spec.projection.ProjectedTestGenEscalation;
import com.robenglander.libretto.spec.projection.ProjectedTestGenLegacyRule;
import com.robenglander.libretto.spec.projection.ProjectedTestGenModulePolicy;
import com.robenglander.libretto.spec.projection.ProjectedTestGenPatternRemediation;
import com.robenglander.libretto.spec.projection.ProjectedTestGenRemediations;
import com.robenglander.libretto.spec.projection.ProjectedTestGenUsage;
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
		String profileName = profile.getProfileName() == null ? "" : profile.getProfileName().trim();
		List<ProjectedSurfaceElement> elements = mapSurface(profile.getSurface());
		ProjectedProjectBlock projectBlock = mapProjectBlock(profile.getProject());
		List<ProjectedLlmProviderEntry> llm = mapLlmProviders(profile.getLlmProviders());
		return new LibrettoProjectProfileDomainModelProjection(
				new LibrettoProjectProfileDomainModel(profileName, elements, projectBlock, llm));
	}

	private static List<ProjectedLlmProviderEntry> mapLlmProviders(LlmProvidersBlock block) {
		if (block == null) {
			return List.of();
		}
		List<ProjectedLlmProviderEntry> out = new ArrayList<>();
		for (NamedLlmProvider p : block.getProviders()) {
			out.add(new ProjectedLlmProviderEntry(
					s(p.getName()),
					s(p.getKind()),
					s(p.getLocalModelPath()),
					s(p.getModel()),
					s(p.getEndpoint())));
		}
		return List.copyOf(out);
	}

	private static ProjectedProjectBlock mapProjectBlock(ProjectBlock pb) {
		if (pb == null) {
			return null;
		}
		String rootDir = s(pb.getRootDir());
		List<ProjectedProjectModuleEntry> modules = new ArrayList<>();
		ModulesBlock mb = pb.getModules();
		if (mb != null) {
			for (ProjectModule m : mb.getModules()) {
				modules.add(mapModule(m));
			}
		}
		ProjectedTestGenBlock testGen = mapTestGenBlock(pb.getTestGen());
		return new ProjectedProjectBlock(rootDir, modules, testGen);
	}

	private static ProjectedProjectModuleEntry mapModule(ProjectModule m) {
		return new ProjectedProjectModuleEntry(
				s(m.getName()),
				s(m.getDir()),
				s(m.getSpecsDir()),
				s(m.getTestsDir()),
				s(m.getMainJavaDir()),
				s(m.getBasePackage()));
	}

	private static ProjectedTestGenBlock mapTestGenBlock(TestGenBlock b) {
		if (b == null) {
			return null;
		}
		List<String> forbidden = new ArrayList<>(b.getForbiddenPatterns());
		String initial = b.getInitialInstruction() == null ? "" : b.getInitialInstruction();
		int maxRetries = b.getMaxRetries();
		String parseCheckRaw = b.getParseCheck() == null ? "" : b.getParseCheck().trim();
		ProjectedTestGenRemediations rem = mapTestGenRemediations(b.getRemediations());
		List<ProjectedTestGenLegacyRule> legacy = mapLegacyRemediationRulesBlock(b.getLegacyRemediationRules());
		ProjectedTestGenUsage usage = mapUsage(b.getUsage());
		List<ProjectedTestGenModulePolicy> mods = new ArrayList<>();
		for (TestGenModulePolicy mp : b.getModulePolicies()) {
			mods.add(mapModulePolicy(mp));
		}
		return new ProjectedTestGenBlock(
				initial,
				forbidden,
				maxRetries,
				parseCheckRaw,
				rem,
				legacy,
				usage,
				mods);
	}

	private static ProjectedTestGenModulePolicy mapModulePolicy(TestGenModulePolicy m) {
		List<String> f = new ArrayList<>(m.getForbiddenPatterns());
		ProjectedTestGenRemediations rem = mapTestGenRemediations(m.getRemediations());
		List<ProjectedTestGenLegacyRule> leg = mapLegacyRemediationRulesBlock(m.getLegacyRemediationRules());
		ProjectedTestGenUsage usage = mapUsage(m.getUsage());
		return new ProjectedTestGenModulePolicy(
				s(m.getModuleId()),
				m.getInitialInstruction() == null ? "" : m.getInitialInstruction(),
				f,
				m.getMaxRetries(),
				m.getParseCheck() == null ? "" : m.getParseCheck().trim(),
				rem,
				leg,
				usage);
	}

	private static ProjectedTestGenUsage mapUsage(TestGenUsageBlock u) {
		if (u == null) {
			return new ProjectedTestGenUsage("", "", mapEscalation(null));
		}
		return new ProjectedTestGenUsage(
				s(u.getPrimaryProvider()),
				s(u.getSecondaryProvider()),
				mapEscalation(u.getEscalation()));
	}

	private static ProjectedTestGenEscalation mapEscalation(TestGenEscalationBlock e) {
		if (e == null) {
			return new ProjectedTestGenEscalation(false, 1, false);
		}
		String en = e.getEnabled();
		boolean enabled = en != null && Boolean.parseBoolean(en.trim());
		int ear = e.getEscalateAtRetry();
		if (ear < 1) {
			ear = 1;
		}
		String t = e.getTarget() == null ? "" : e.getTarget().trim().toLowerCase();
		boolean targetSecondary = t.contains("secondary");
		return new ProjectedTestGenEscalation(enabled, ear, targetSecondary);
	}

	private static ProjectedTestGenRemediations mapTestGenRemediations(TestGenRemediationsBlock r) {
		if (r == null) {
			return null;
		}
		Integer maxRetries = Integer.valueOf(r.getMaxRetries());
		Boolean parseCheck = null;
		String pc = r.getParseCheck();
		if (pc != null && !pc.isBlank()) {
			parseCheck = Boolean.valueOf(Boolean.parseBoolean(pc.trim()));
		}
		String defaultCorr = r.getDefaultCorrection() == null ? "" : r.getDefaultCorrection();
		List<String> extra = new ArrayList<>(r.getForbiddenPatterns());
		List<ProjectedTestGenPatternRemediation> patternRules = new ArrayList<>();
		ProjectedTestGenDefaultRemediation def = null;
		TestGenRemediationRulesContainer rc = r.getRulesContainer();
		if (rc != null) {
			for (TestGenPatternRemediationRule pr : rc.getPatternRules()) {
				patternRules.add(new ProjectedTestGenPatternRemediation(
						pr.getPattern(),
						pr.getCode(),
						pr.getCorrection()));
			}
			TestGenDefaultRemediationRule dr = rc.getDefaultRemediation();
			if (dr != null) {
				def = new ProjectedTestGenDefaultRemediation(dr.getCode(), dr.getCorrection());
			}
		}
		return new ProjectedTestGenRemediations(maxRetries, parseCheck, defaultCorr, extra, patternRules, def);
	}

	private static List<ProjectedTestGenLegacyRule> mapLegacyRemediationRulesBlock(TestGenLegacyRemediationRulesBlock b) {
		if (b == null) {
			return List.of();
		}
		List<ProjectedTestGenLegacyRule> out = new ArrayList<>();
		for (TestGenLegacyRemediationRule r : b.getRules()) {
			out.add(new ProjectedTestGenLegacyRule(r.getKey(), r.getInstruction()));
		}
		return List.copyOf(out);
	}

	private static String s(String v) {
		return v == null ? "" : v.trim();
	}

	private static List<ProjectedSurfaceElement> mapSurface(SurfaceBlock surface) {
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
}
