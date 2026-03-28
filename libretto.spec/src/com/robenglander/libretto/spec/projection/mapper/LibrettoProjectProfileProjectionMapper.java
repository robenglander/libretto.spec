package com.robenglander.libretto.spec.projection.mapper;

import java.util.ArrayList;
import java.util.List;

import com.robenglander.libretto.spec.librettoProjectProfile.AtRetry;
import com.robenglander.libretto.spec.librettoProjectProfile.BasePackage;
import com.robenglander.libretto.spec.librettoProjectProfile.Code;
import com.robenglander.libretto.spec.librettoProjectProfile.Correction;
import com.robenglander.libretto.spec.librettoProjectProfile.DefaultCorrection;
import com.robenglander.libretto.spec.librettoProjectProfile.Directory;
import com.robenglander.libretto.spec.librettoProjectProfile.Enabled;
import com.robenglander.libretto.spec.librettoProjectProfile.Endpoint;
import com.robenglander.libretto.spec.librettoProjectProfile.GenBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.GenDefaultRemediationRule;
import com.robenglander.libretto.spec.librettoProjectProfile.GenEscalationBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.GenPatternRemediationRule;
import com.robenglander.libretto.spec.librettoProjectProfile.GenRemediationRules;
import com.robenglander.libretto.spec.librettoProjectProfile.GenUsageBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.InitialInstruction;
import com.robenglander.libretto.spec.librettoProjectProfile.LLMProvider;
import com.robenglander.libretto.spec.librettoProjectProfile.LlmProvidersBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.LocalModelPath;
import com.robenglander.libretto.spec.librettoProjectProfile.MainDirectory;
import com.robenglander.libretto.spec.librettoProjectProfile.MaxRetries;
import com.robenglander.libretto.spec.librettoProjectProfile.Model;
import com.robenglander.libretto.spec.librettoProjectProfile.ModulesBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.ParseCheck;
import com.robenglander.libretto.spec.librettoProjectProfile.Pattern;
import com.robenglander.libretto.spec.librettoProjectProfile.PrimaryProvider;
import com.robenglander.libretto.spec.librettoProjectProfile.Profile;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectModule;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectProfile;
import com.robenglander.libretto.spec.librettoProjectProfile.ProviderType;
import com.robenglander.libretto.spec.librettoProjectProfile.RootDirectory;
import com.robenglander.libretto.spec.librettoProjectProfile.SecondaryProvider;
import com.robenglander.libretto.spec.librettoProjectProfile.SpecDirectory;
import com.robenglander.libretto.spec.librettoProjectProfile.TestDirectory;
import com.robenglander.libretto.spec.librettoProjectProfile.TrueFalseKeyword;
import com.robenglander.libretto.spec.librettoProjectProfile.TrueKeyword;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModel;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModelProjection;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfilesDocument;
import com.robenglander.libretto.spec.projection.ProjectedGenAtRetry;
import com.robenglander.libretto.spec.projection.ProjectedGenBlock;
import com.robenglander.libretto.spec.projection.ProjectedGenDefaultCorrection;
import com.robenglander.libretto.spec.projection.ProjectedGenDefaultRemediationRule;
import com.robenglander.libretto.spec.projection.ProjectedGenEnabled;
import com.robenglander.libretto.spec.projection.ProjectedGenEscalationBlock;
import com.robenglander.libretto.spec.projection.ProjectedGenInstruction;
import com.robenglander.libretto.spec.projection.ProjectedGenMaxRetries;
import com.robenglander.libretto.spec.projection.ProjectedGenParseCheck;
import com.robenglander.libretto.spec.projection.ProjectedGenPattern;
import com.robenglander.libretto.spec.projection.ProjectedGenPatternRemediationRule;
import com.robenglander.libretto.spec.projection.ProjectedGenPrimaryProvider;
import com.robenglander.libretto.spec.projection.ProjectedGenRemediationCode;
import com.robenglander.libretto.spec.projection.ProjectedGenRemediationCorrection;
import com.robenglander.libretto.spec.projection.ProjectedGenRemediationRules;
import com.robenglander.libretto.spec.projection.ProjectedGenSecondaryProvider;
import com.robenglander.libretto.spec.projection.ProjectedGenUsageBlock;
import com.robenglander.libretto.spec.projection.ProjectedLlmEndpoint;
import com.robenglander.libretto.spec.projection.ProjectedLlmLocalModelPath;
import com.robenglander.libretto.spec.projection.ProjectedLlmModel;
import com.robenglander.libretto.spec.projection.ProjectedLlmProvider;
import com.robenglander.libretto.spec.projection.ProjectedLlmProviderType;
import com.robenglander.libretto.spec.projection.ProjectedLlmProvidersBlock;
import com.robenglander.libretto.spec.projection.ProjectedModuleBasePackage;
import com.robenglander.libretto.spec.projection.ProjectedModuleDir;
import com.robenglander.libretto.spec.projection.ProjectedModuleMainDir;
import com.robenglander.libretto.spec.projection.ProjectedModuleSpecDir;
import com.robenglander.libretto.spec.projection.ProjectedModuleTestDir;
import com.robenglander.libretto.spec.projection.ProjectedModulesBlock;
import com.robenglander.libretto.spec.projection.ProjectedProjectBlock;
import com.robenglander.libretto.spec.projection.ProjectedProjectModule;
import com.robenglander.libretto.spec.projection.ProjectedRootDirectory;

/**
 * EMF file root {@link ProjectProfile} (zero or more {@link Profile} blocks) or a single {@link Profile} →
 * portable projection.
 */
public final class LibrettoProjectProfileProjectionMapper {

	private LibrettoProjectProfileProjectionMapper() {
	}

	/**
	 * Map the parse root (zero or more {@code profile} blocks).
	 */
	public static LibrettoProjectProfileDomainModelProjection project(ProjectProfile root) {
		if (root == null) {
			return new LibrettoProjectProfileDomainModelProjection(LibrettoProjectProfilesDocument.empty());
		}
		List<LibrettoProjectProfileDomainModel> models = new ArrayList<>();
		for (Profile p : root.getProfiles()) {
			models.add(mapProfile(p));
		}
		return new LibrettoProjectProfileDomainModelProjection(new LibrettoProjectProfilesDocument(models));
	}

	/**
	 * Map one {@code profile} block (tests, embedded fragments).
	 */
	public static LibrettoProjectProfileDomainModelProjection project(Profile profile) {
		if (profile == null) {
			return new LibrettoProjectProfileDomainModelProjection(LibrettoProjectProfilesDocument.empty());
		}
		return new LibrettoProjectProfileDomainModelProjection(
				new LibrettoProjectProfilesDocument(List.of(mapProfile(profile))));
	}

	private static LibrettoProjectProfileDomainModel mapProfile(Profile profile) {
		if (profile == null) {
			return LibrettoProjectProfileDomainModel.empty();
		}
		String profileName = s(profile.getName());
		List<ProjectedProjectBlock> projectBlocks = new ArrayList<>();
		for (ProjectBlock pb : profile.getProjects()) {
			projectBlocks.add(mapProjectBlock(pb));
		}
		List<ProjectedLlmProvidersBlock> llmBlocks = new ArrayList<>();
		for (LlmProvidersBlock lb : profile.getLlmProviders()) {
			llmBlocks.add(mapLlmProvidersBlock(lb));
		}
		return new LibrettoProjectProfileDomainModel(profileName, projectBlocks, llmBlocks);
	}

	private static ProjectedLlmProvidersBlock mapLlmProvidersBlock(LlmProvidersBlock block) {
		if (block == null) {
			return new ProjectedLlmProvidersBlock(List.of());
		}
		List<ProjectedLlmProvider> out = new ArrayList<>();
		for (LLMProvider p : block.getProviders()) {
			out.add(mapLlmProvider(p));
		}
		return new ProjectedLlmProvidersBlock(List.copyOf(out));
	}

	private static ProjectedLlmProvider mapLlmProvider(LLMProvider p) {
		if (p == null) {
			return new ProjectedLlmProvider("", List.of(), List.of(), List.of(), List.of());
		}
		List<ProjectedLlmProviderType> types = new ArrayList<>();
		for (ProviderType t : p.getTypes()) {
			types.add(new ProjectedLlmProviderType(t == null || t.getName() == null ? "" : t.getName().trim()));
		}
		List<ProjectedLlmLocalModelPath> localModelPaths = new ArrayList<>();
		for (LocalModelPath lm : p.getLocalModelPaths()) {
			localModelPaths.add(new ProjectedLlmLocalModelPath(lm == null || lm.getPath() == null ? "" : lm.getPath().trim()));
		}
		List<ProjectedLlmModel> models = new ArrayList<>();
		for (Model m : p.getModels()) {
			models.add(new ProjectedLlmModel(m == null || m.getMode() == null ? "" : m.getMode().trim()));
		}
		List<ProjectedLlmEndpoint> endpoints = new ArrayList<>();
		for (Endpoint ep : p.getEndpoints()) {
			endpoints.add(new ProjectedLlmEndpoint(ep == null || ep.getMode() == null ? "" : ep.getMode().trim()));
		}
		return new ProjectedLlmProvider(
				s(p.getName()),
				List.copyOf(types),
				List.copyOf(localModelPaths),
				List.copyOf(models),
				List.copyOf(endpoints));
	}

	private static ProjectedProjectBlock mapProjectBlock(ProjectBlock pb) {
		if (pb == null) {
			return new ProjectedProjectBlock(List.of(), List.of(), List.of());
		}
		List<ProjectedRootDirectory> rootDirs = new ArrayList<>();
		for (RootDirectory rd : pb.getRootDirs()) {
			rootDirs.add(new ProjectedRootDirectory(rd == null || rd.getDir() == null ? "" : rd.getDir().trim()));
		}
		List<ProjectedModulesBlock> modulesBlocks = new ArrayList<>();
		for (ModulesBlock mb : pb.getModules()) {
			modulesBlocks.add(mapModulesBlock(mb));
		}
		List<ProjectedGenBlock> genBlocks = new ArrayList<>();
		for (GenBlock g : pb.getGens()) {
			genBlocks.add(mapGenBlock(g));
		}
		return new ProjectedProjectBlock(List.copyOf(rootDirs), List.copyOf(modulesBlocks), List.copyOf(genBlocks));
	}

	private static ProjectedModulesBlock mapModulesBlock(ModulesBlock mb) {
		if (mb == null) {
			return new ProjectedModulesBlock(List.of());
		}
		List<ProjectedProjectModule> modules = new ArrayList<>();
		for (ProjectModule m : mb.getModules()) {
			modules.add(mapModule(m));
		}
		return new ProjectedModulesBlock(List.copyOf(modules));
	}

	private static ProjectedProjectModule mapModule(ProjectModule m) {
		if (m == null) {
			return new ProjectedProjectModule("", List.of(), List.of(), List.of(), List.of(), List.of());
		}
		List<ProjectedModuleDir> dirs = new ArrayList<>();
		for (Directory d : m.getDirs()) {
			dirs.add(new ProjectedModuleDir(d == null || d.getDir() == null ? "" : d.getDir().trim()));
		}
		List<ProjectedModuleSpecDir> specDirs = new ArrayList<>();
		for (SpecDirectory d : m.getSpecDirs()) {
			specDirs.add(new ProjectedModuleSpecDir(d == null || d.getDir() == null ? "" : d.getDir().trim()));
		}
		List<ProjectedModuleTestDir> testDirs = new ArrayList<>();
		for (TestDirectory d : m.getTestDirs()) {
			testDirs.add(new ProjectedModuleTestDir(d == null || d.getDir() == null ? "" : d.getDir().trim()));
		}
		List<ProjectedModuleMainDir> mainDirs = new ArrayList<>();
		for (MainDirectory d : m.getMainDirs()) {
			mainDirs.add(new ProjectedModuleMainDir(d == null || d.getDir() == null ? "" : d.getDir().trim()));
		}
		List<ProjectedModuleBasePackage> basePackages = new ArrayList<>();
		for (BasePackage d : m.getBasePackages()) {
			basePackages.add(new ProjectedModuleBasePackage(d == null || d.getDir() == null ? "" : d.getDir().trim()));
		}
		return new ProjectedProjectModule(
				s(m.getName()),
				List.copyOf(dirs),
				List.copyOf(specDirs),
				List.copyOf(testDirs),
				List.copyOf(mainDirs),
				List.copyOf(basePackages));
	}

	private static ProjectedGenBlock mapGenBlock(GenBlock b) {
		if (b == null) {
			return new ProjectedGenBlock(List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
		}
		List<ProjectedGenInstruction> initialInstructions = new ArrayList<>();
		for (InitialInstruction ii : b.getInitialInstructions()) {
			initialInstructions.add(new ProjectedGenInstruction(
					ii == null || ii.getInstruction() == null ? "" : ii.getInstruction().trim()));
		}
		List<ProjectedGenMaxRetries> maxRetries = new ArrayList<>();
		for (MaxRetries mr : b.getMaxRetries()) {
			maxRetries.add(new ProjectedGenMaxRetries(mr == null ? 0 : mr.getMaxRetries()));
		}
		List<ProjectedGenParseCheck> parseChecks = new ArrayList<>();
		for (ParseCheck pc : b.getParseChecks()) {
			parseChecks.add(new ProjectedGenParseCheck(trueFalseToString(pc == null ? null : pc.getValue())));
		}
		List<ProjectedGenDefaultCorrection> defaultCorrections = new ArrayList<>();
		for (DefaultCorrection dc : b.getDefaultCorrections()) {
			defaultCorrections.add(new ProjectedGenDefaultCorrection(
					dc == null || dc.getCorrection() == null ? "" : dc.getCorrection().trim()));
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
				List.copyOf(initialInstructions),
				List.copyOf(maxRetries),
				List.copyOf(parseChecks),
				List.copyOf(defaultCorrections),
				List.copyOf(rem),
				List.copyOf(usages));
	}

	private static String trueFalseToString(TrueFalseKeyword tf) {
		if (tf instanceof TrueKeyword tk && tk.getKeyword() != null) {
			return tk.getKeyword().trim();
		}
		return "";
	}

	private static ProjectedGenRemediationRules mapGenRemediationRules(GenRemediationRules rules) {
		if (rules == null) {
			return new ProjectedGenRemediationRules(List.of(), List.of());
		}
		List<ProjectedGenPatternRemediationRule> pattern = new ArrayList<>();
		for (GenPatternRemediationRule pr : rules.getPatternRules()) {
			pattern.add(mapPatternRemediationRule(pr));
		}
		List<ProjectedGenDefaultRemediationRule> defaults = new ArrayList<>();
		for (GenDefaultRemediationRule dr : rules.getDefaultRemediations()) {
			defaults.add(mapDefaultRemediationRule(dr));
		}
		return new ProjectedGenRemediationRules(List.copyOf(pattern), List.copyOf(defaults));
	}

	private static ProjectedGenPatternRemediationRule mapPatternRemediationRule(GenPatternRemediationRule pr) {
		if (pr == null) {
			return new ProjectedGenPatternRemediationRule(List.of(), List.of(), List.of());
		}
		List<ProjectedGenPattern> patterns = new ArrayList<>();
		for (Pattern pat : pr.getPatterns()) {
			patterns.add(new ProjectedGenPattern(pat == null || pat.getPattern() == null ? "" : pat.getPattern().trim()));
		}
		List<ProjectedGenRemediationCode> codes = new ArrayList<>();
		for (Code c : pr.getCodes()) {
			codes.add(new ProjectedGenRemediationCode(c == null || c.getCode() == null ? "" : c.getCode().trim()));
		}
		List<ProjectedGenRemediationCorrection> corrections = new ArrayList<>();
		for (Correction c : pr.getCorrections()) {
			corrections.add(new ProjectedGenRemediationCorrection(
					c == null || c.getCorrection() == null ? "" : c.getCorrection().trim()));
		}
		return new ProjectedGenPatternRemediationRule(
				List.copyOf(patterns),
				List.copyOf(codes),
				List.copyOf(corrections));
	}

	private static ProjectedGenDefaultRemediationRule mapDefaultRemediationRule(GenDefaultRemediationRule dr) {
		if (dr == null) {
			return new ProjectedGenDefaultRemediationRule(List.of(), List.of());
		}
		List<ProjectedGenRemediationCode> codes = new ArrayList<>();
		for (Code c : dr.getCodes()) {
			codes.add(new ProjectedGenRemediationCode(c == null || c.getCode() == null ? "" : c.getCode().trim()));
		}
		List<ProjectedGenRemediationCorrection> corrections = new ArrayList<>();
		for (Correction c : dr.getCorrections()) {
			corrections.add(new ProjectedGenRemediationCorrection(
					c == null || c.getCorrection() == null ? "" : c.getCorrection().trim()));
		}
		return new ProjectedGenDefaultRemediationRule(List.copyOf(codes), List.copyOf(corrections));
	}

	private static ProjectedGenUsageBlock mapGenUsageBlock(GenUsageBlock u) {
		if (u == null) {
			return new ProjectedGenUsageBlock(List.of(), List.of(), List.of());
		}
		List<ProjectedGenPrimaryProvider> primary = new ArrayList<>();
		for (PrimaryProvider pp : u.getPrimaryProviders()) {
			primary.add(new ProjectedGenPrimaryProvider(pp == null || pp.getName() == null ? "" : pp.getName().trim()));
		}
		List<ProjectedGenSecondaryProvider> secondary = new ArrayList<>();
		for (SecondaryProvider sp : u.getSecondaryProviders()) {
			secondary.add(new ProjectedGenSecondaryProvider(
					sp == null || sp.getName() == null ? "" : sp.getName().trim()));
		}
		List<ProjectedGenEscalationBlock> esc = new ArrayList<>();
		for (GenEscalationBlock e : u.getEscalations()) {
			esc.add(mapGenEscalation(e));
		}
		return new ProjectedGenUsageBlock(
				List.copyOf(primary),
				List.copyOf(secondary),
				List.copyOf(esc));
	}

	private static ProjectedGenEscalationBlock mapGenEscalation(GenEscalationBlock e) {
		if (e == null) {
			return new ProjectedGenEscalationBlock(List.of(), List.of());
		}
		List<ProjectedGenEnabled> enableds = new ArrayList<>();
		for (Enabled en : e.getEnableds()) {
			enableds.add(new ProjectedGenEnabled(trueFalseToString(en == null ? null : en.getValue())));
		}
		List<ProjectedGenAtRetry> atRetries = new ArrayList<>();
		for (AtRetry ar : e.getAtRetries()) {
			atRetries.add(new ProjectedGenAtRetry(ar == null ? 0 : ar.getValue()));
		}
		return new ProjectedGenEscalationBlock(List.copyOf(enableds), List.copyOf(atRetries));
	}

	private static String s(String v) {
		return v == null ? "" : v.trim();
	}
}
