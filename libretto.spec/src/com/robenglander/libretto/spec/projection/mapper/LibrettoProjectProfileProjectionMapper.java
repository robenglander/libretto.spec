package com.robenglander.libretto.spec.projection.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.emf.common.util.EList;

import com.robenglander.libretto.spec.librettoProjectProfile.BasePackage;
import com.robenglander.libretto.spec.librettoProjectProfile.Code;
import com.robenglander.libretto.spec.librettoProjectProfile.Correction;
import com.robenglander.libretto.spec.librettoProjectProfile.DefaultCorrection;
import com.robenglander.libretto.spec.librettoProjectProfile.Directory;
import com.robenglander.libretto.spec.librettoProjectProfile.Endpoint;
import com.robenglander.libretto.spec.librettoProjectProfile.GenBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.GenDefaultRemediationRule;
import com.robenglander.libretto.spec.librettoProjectProfile.EscalationProvider;
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
import com.robenglander.libretto.spec.librettoProjectProfile.Provider;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectBlock;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectModule;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectProfile;
import com.robenglander.libretto.spec.librettoProjectProfile.ProviderType;
import com.robenglander.libretto.spec.librettoProjectProfile.RootDirectory;
import com.robenglander.libretto.spec.librettoProjectProfile.SpecDirectory;
import com.robenglander.libretto.spec.librettoProjectProfile.TestDirectory;
import com.robenglander.libretto.spec.librettoProjectProfile.TrueFalseKeyword;
import com.robenglander.libretto.spec.librettoProjectProfile.TrueKeyword;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModel;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModelProjection;
import com.robenglander.libretto.spec.projection.ProjectedProfile;
import com.robenglander.libretto.spec.projection.ProjectedGenEscalationTo;
import com.robenglander.libretto.spec.projection.ProjectedGenBlock;
import com.robenglander.libretto.spec.projection.ProjectedGenDefaultCorrection;
import com.robenglander.libretto.spec.projection.ProjectedGenDefaultRemediationRule;
import com.robenglander.libretto.spec.projection.ProjectedGenInstruction;
import com.robenglander.libretto.spec.projection.ProjectedGenMaxRetries;
import com.robenglander.libretto.spec.projection.ProjectedGenParseCheck;
import com.robenglander.libretto.spec.projection.ProjectedGenPattern;
import com.robenglander.libretto.spec.projection.ProjectedGenPatternRemediationRule;
import com.robenglander.libretto.spec.projection.ProjectedGenProvider;
import com.robenglander.libretto.spec.projection.ProjectedGenRemediationCode;
import com.robenglander.libretto.spec.projection.ProjectedGenRemediationCorrection;
import com.robenglander.libretto.spec.projection.ProjectedGenRemediationRules;
import com.robenglander.libretto.spec.projection.ProjectedGenUsageBlock;
import com.robenglander.libretto.spec.projection.ProjectedLlmEndpoint;
import com.robenglander.libretto.spec.projection.ProjectedLlmLocalModelPath;
import com.robenglander.libretto.spec.projection.ProjectedLlmLocalProvider;
import com.robenglander.libretto.spec.projection.ProjectedLlmManagedProvider;
import com.robenglander.libretto.spec.projection.ProjectedLlmModel;
import com.robenglander.libretto.spec.projection.ProjectedLlmOllamaProvider;
import com.robenglander.libretto.spec.projection.ProjectedLlmProvider;
import com.robenglander.libretto.spec.projection.ProjectedLlmProviderType;
import com.robenglander.libretto.spec.projection.ProjectedLlmProvidersBlock;
import com.robenglander.libretto.spec.projection.ProjectedModuleBasePackage;
import com.robenglander.libretto.spec.projection.ProjectedModuleDir;
import com.robenglander.libretto.spec.projection.ProjectedModuleMainDir;
import com.robenglander.libretto.spec.projection.ProjectedModuleName;
import com.robenglander.libretto.spec.projection.ProjectedModuleSpecDir;
import com.robenglander.libretto.spec.projection.ProjectedModuleTestDir;
import com.robenglander.libretto.spec.projection.ProjectedModulesBlock;
import com.robenglander.libretto.spec.projection.ProjectedProjectBlock;
import com.robenglander.libretto.spec.projection.ProjectedProjectModule;
import com.robenglander.libretto.spec.projection.ProjectedRootDirectory;

/**
 * EMF file root {@link ProjectProfile} (exactly one {@code profile} when valid) → portable projection.
 * <p>
 * Call only on <strong>validator-clean</strong> models (e.g. after {@link com.robenglander.libretto.spec.headless.LibrettoProjectProfileHeadless.ParseResult#project()}).
 * If the parse tree violates {@link com.robenglander.libretto.spec.validation.LibrettoProjectProfileValidator} constraints, mapping throws {@link IllegalStateException}.
 */
public final class LibrettoProjectProfileProjectionMapper {

	private LibrettoProjectProfileProjectionMapper() {
	}

	private static void requireValid(boolean ok, String message) {
		if (!ok) {
			throw new IllegalStateException(
					"LibrettoProjectProfileProjectionMapper requires validator-clean LPP: " + message);
		}
	}

	/**
	 * Valid LPP supplies non-blank strings for required path and name fields; do not map null/blank to "" — that would
	 * fabricate an invalid projection.
	 */
	private static String requireNonBlankField(String raw, String fieldLabel) {
		if (raw == null) {
			throw new IllegalStateException(
					"LibrettoProjectProfileProjectionMapper requires validator-clean LPP: " + fieldLabel + " is null");
		}
		String trimmed = raw.trim();
		if (trimmed.isEmpty()) {
			throw new IllegalStateException(
					"LibrettoProjectProfileProjectionMapper requires validator-clean LPP: " + fieldLabel + " is blank");
		}
		return trimmed;
	}

	/**
	 * Map the parse root (exactly one {@code profile} block when valid).
	 */
	public static LibrettoProjectProfileDomainModelProjection project(ProjectProfile root) {
		if (root == null) {
			return new LibrettoProjectProfileDomainModelProjection(ProjectedProfile.empty());
		}
		List<Profile> profiles = root.getProfiles();
		if (profiles == null || profiles.isEmpty()) {
			return new LibrettoProjectProfileDomainModelProjection(ProjectedProfile.empty());
		}
		requireValid(profiles.size() == 1, "exactly one profile { ... } block");
		return new LibrettoProjectProfileDomainModelProjection(
				new ProjectedProfile(mapProfile(profiles.get(0))));
	}

	/**
	 * Map one {@code profile} block (tests with embedded fragments must still satisfy validator shape).
	 */
	public static LibrettoProjectProfileDomainModelProjection project(Profile profile) {
		if (profile == null) {
			return new LibrettoProjectProfileDomainModelProjection(ProjectedProfile.empty());
		}
		return new LibrettoProjectProfileDomainModelProjection(new ProjectedProfile(mapProfile(profile)));
	}

	private static LibrettoProjectProfileDomainModel mapProfile(Profile profile) {
		requireValid(profile != null, "profile is null");
		String profileName = requireNonBlankField(profile.getName(), "profile.name");
		EList<ProjectBlock> projects = profile.getProjects();
		requireValid(projects != null && projects.size() == 1, "exactly one project { ... } block");
		EList<LlmProvidersBlock> llmBlocks = profile.getLlmProviders();
		requireValid(llmBlocks != null && llmBlocks.size() == 1, "exactly one llmProviders { ... } block");
		return new LibrettoProjectProfileDomainModel(
				profileName,
				Optional.of(mapProjectBlock(Objects.requireNonNull(projects.get(0)))),
				Optional.of(mapLlmProvidersBlock(Objects.requireNonNull(llmBlocks.get(0)))));
	}

	private static ProjectedLlmProvidersBlock mapLlmProvidersBlock(LlmProvidersBlock block) {
		requireValid(block != null, "llmProviders block is null");
		List<ProjectedLlmProvider> out = new ArrayList<>();
		for (LLMProvider p : block.getProviders()) {
			out.add(mapLlmProvider(Objects.requireNonNull(p, "llmProviders.provider is null")));
		}
		return new ProjectedLlmProvidersBlock(List.copyOf(out));
	}

	private static ProjectedLlmProvider mapLlmProvider(LLMProvider p) {
		requireValid(p != null, "llmProviders.provider is null");
		EList<ProviderType> typeList = p.getTypes();
		requireValid(typeList != null && typeList.size() == 1, "exactly one type per llmProviders.provider");
		ProviderType soleType = Objects.requireNonNull(typeList.get(0));
		ProjectedLlmProviderType type = new ProjectedLlmProviderType(requireNonBlankField(soleType.getName(), "llmProviders.provider.type"));
		String typeKey = type.name().toLowerCase(Locale.ROOT);

		EList<LocalModelPath> lmList = p.getLocalModelPaths();
		int nLm = lmList == null ? 0 : lmList.size();
		requireValid(nLm <= 1, "at most one filePath per llmProviders.provider");

		EList<Model> modelList = p.getModels();
		int nModel = modelList == null ? 0 : modelList.size();
		requireValid(nModel <= 1, "at most one model per llmProviders.provider");

		EList<Endpoint> epList = p.getEndpoints();
		int nEp = epList == null ? 0 : epList.size();
		requireValid(nEp <= 1, "at most one endpoint per llmProviders.provider");

		String name = requireNonBlankField(p.getName(), "llmProviders.provider.name");

		return switch (typeKey) {
			case "local" -> {
				requireValid(nLm == 1 && nModel == 0 && nEp == 0,
						"validator-clean LPP: type local requires exactly one filePath and no model or endpoint");
				yield new ProjectedLlmLocalProvider(name, new ProjectedLlmLocalModelPath(
						requireNonBlankField(Objects.requireNonNull(lmList.get(0)).getPath(), "llmProviders.provider.filePath")));
			}
			case "openai", "anthropic", "gemini" -> {
				requireValid(nLm == 0 && nModel == 1 && nEp == 0,
						"validator-clean LPP: managed cloud type requires one model and no filePath or endpoint");
				yield new ProjectedLlmManagedProvider(name, type, new ProjectedLlmModel(
						requireNonBlankField(Objects.requireNonNull(modelList.get(0)).getMode(), "llmProviders.provider.model")));
			}
			case "ollama" -> {
				requireValid(nLm == 0 && nModel == 1 && nEp == 1,
						"validator-clean LPP: type ollama requires one model and one endpoint, no filePath");
				yield new ProjectedLlmOllamaProvider(name, new ProjectedLlmModel(
						requireNonBlankField(Objects.requireNonNull(modelList.get(0)).getMode(), "llmProviders.provider.model")),
						new ProjectedLlmEndpoint(
								requireNonBlankField(Objects.requireNonNull(epList.get(0)).getMode(), "llmProviders.provider.endpoint")));
			}
			default -> throw new IllegalStateException(
					"LibrettoProjectProfileProjectionMapper requires validator-clean LPP: unknown llmProviders.provider.type "
							+ type.name());
		};
	}

	private static ProjectedProjectBlock mapProjectBlock(ProjectBlock pb) {
		requireValid(pb != null, "project block is null");
		EList<RootDirectory> rootDirs = pb.getRootDirs();
		requireValid(rootDirs != null && rootDirs.size() == 1, "exactly one rootDir");
		EList<ModulesBlock> moduleSections = pb.getModules();
		requireValid(moduleSections != null && moduleSections.size() == 1, "exactly one modules { ... } section");
		EList<GenBlock> gens = pb.getGens();
		requireValid(gens != null && gens.size() == 1, "exactly one gen { ... } section");
		RootDirectory rd = Objects.requireNonNull(rootDirs.get(0));
		return new ProjectedProjectBlock(
				new ProjectedRootDirectory(requireNonBlankField(rd.getDir(), "project.rootDir")),
				mapModulesBlock(Objects.requireNonNull(moduleSections.get(0))),
				mapGenBlock(Objects.requireNonNull(gens.get(0))));
	}

	private static ProjectedModulesBlock mapModulesBlock(ModulesBlock mb) {
		requireValid(mb != null, "modules block is null");
		List<ProjectedProjectModule> modules = new ArrayList<>();
		for (ProjectModule m : mb.getModules()) {
			modules.add(mapModule(m));
		}
		return new ProjectedModulesBlock(List.copyOf(modules));
	}

	private static ProjectedProjectModule mapModule(ProjectModule m) {
		requireValid(m != null, "module is null");
		EList<Directory> dirs = m.getDirs();
		EList<SpecDirectory> specDirs = m.getSpecDirs();
		EList<TestDirectory> testDirs = m.getTestDirs();
		EList<MainDirectory> mainDirs = m.getMainDirs();
		EList<BasePackage> basePackages = m.getBasePackages();
		requireValid(dirs != null && dirs.size() == 1, "exactly one dir per module");
		requireValid(specDirs != null && specDirs.size() == 1, "exactly one specDir per module");
		requireValid(testDirs != null && testDirs.size() == 1, "exactly one testDir per module");
		requireValid(mainDirs != null && mainDirs.size() == 1, "exactly one mainDir per module");
		requireValid(basePackages != null && basePackages.size() == 1, "exactly one basePackage per module");
		Directory d0 = Objects.requireNonNull(dirs.get(0));
		SpecDirectory s0 = Objects.requireNonNull(specDirs.get(0));
		TestDirectory t0 = Objects.requireNonNull(testDirs.get(0));
		MainDirectory m0 = Objects.requireNonNull(mainDirs.get(0));
		BasePackage b0 = Objects.requireNonNull(basePackages.get(0));
		return new ProjectedProjectModule(
				new ProjectedModuleName(requireNonBlankField(m.getName(), "module.name")),
				new ProjectedModuleDir(requireNonBlankField(d0.getDir(), "module.dir")),
				new ProjectedModuleSpecDir(requireNonBlankField(s0.getDir(), "module.specDir")),
				new ProjectedModuleTestDir(requireNonBlankField(t0.getDir(), "module.testDir")),
				new ProjectedModuleMainDir(requireNonBlankField(m0.getDir(), "module.mainDir")),
				new ProjectedModuleBasePackage(requireNonBlankField(b0.getDir(), "module.basePackage")));
	}

	private static ProjectedGenBlock mapGenBlock(GenBlock b) {
		requireValid(b != null, "gen block is null");
		EList<InitialInstruction> iis = b.getInitialInstructions();
		requireValid(iis != null && iis.size() == 1, "exactly one initialInstruction per gen");
		InitialInstruction ii0 = Objects.requireNonNull(iis.get(0));
		ProjectedGenInstruction initialInstruction = new ProjectedGenInstruction(
				requireNonBlankField(ii0.getInstruction(), "gen.initialInstruction"));

		EList<ParseCheck> pcs = b.getParseChecks();
		requireValid(pcs != null && pcs.size() == 1, "exactly one parseCheck per gen");
		ParseCheck pc0 = Objects.requireNonNull(pcs.get(0));
		ProjectedGenParseCheck parseCheck = new ProjectedGenParseCheck(
				trueFalseValueToBoolean(pc0.getValue(), "gen.parseCheck.value"));

		EList<DefaultCorrection> dcs = b.getDefaultCorrections();
		requireValid(dcs != null && dcs.size() == 1, "exactly one defaultCorrection per gen");
		DefaultCorrection dc0 = Objects.requireNonNull(dcs.get(0));
		ProjectedGenDefaultCorrection defaultCorrection = new ProjectedGenDefaultCorrection(
				requireNonBlankField(dc0.getCorrection(), "gen.defaultCorrection"));

		EList<GenRemediationRules> remList = b.getRemediations();
		requireValid(remList != null && remList.size() == 1, "exactly one rules { ... } per gen");
		ProjectedGenRemediationRules remediation = mapGenRemediationRules(Objects.requireNonNull(remList.get(0)));

		EList<GenUsageBlock> usageList = b.getModelUsages();
		requireValid(usageList != null && usageList.size() == 1, "exactly one modelUsage { ... } per gen");
		return new ProjectedGenBlock(
				initialInstruction,
				parseCheck,
				defaultCorrection,
				remediation,
				Optional.of(mapGenUsageBlock(Objects.requireNonNull(usageList.get(0)))));
	}

	/**
	 * Maps the grammar assignment {@code value = TrueFalseKeyword} (EMF {@link ParseCheck#getValue()},
	 * {@link Enabled#getValue()}, etc.) to {@code boolean}. The keyword line tokens ({@code parseCheck},
	 * {@code enabled}, …) are not passed here.
	 */
	private static boolean trueFalseValueToBoolean(TrueFalseKeyword tf, String fieldLabel) {
		requireValid(tf != null, fieldLabel + " is null");
		if (tf instanceof TrueKeyword tk) {
			String lexeme = requireNonBlankField(tk.getKeyword(), fieldLabel);
			if ("true".equalsIgnoreCase(lexeme)) {
				return true;
			}
			if ("false".equalsIgnoreCase(lexeme)) {
				return false;
			}
			throw new IllegalStateException(
					"LibrettoProjectProfileProjectionMapper requires validator-clean LPP: " + fieldLabel
							+ " must be lexical true or false");
		}
		throw new IllegalStateException(
				"LibrettoProjectProfileProjectionMapper requires validator-clean LPP: " + fieldLabel + " must be TrueKeyword");
	}

	private static ProjectedGenRemediationRules mapGenRemediationRules(GenRemediationRules rules) {
		requireValid(rules != null, "rules block is null");
		List<ProjectedGenPatternRemediationRule> pattern = new ArrayList<>();
		for (GenPatternRemediationRule pr : rules.getPatternRules()) {
			if (pr != null) {
				pattern.add(mapPatternRemediationRule(pr));
			}
		}
		EList<GenDefaultRemediationRule> defaultList = rules.getDefaultRemediations();
		requireValid(defaultList != null && defaultList.size() == 1, "exactly one default { ... } in rules { ... }");
		ProjectedGenDefaultRemediationRule soleDefault = mapDefaultRemediationRule(Objects.requireNonNull(defaultList.get(0)));
		return new ProjectedGenRemediationRules(List.copyOf(pattern), soleDefault);
	}

	private static ProjectedGenPatternRemediationRule mapPatternRemediationRule(GenPatternRemediationRule pr) {
		EList<Pattern> pats = pr.getPatterns();
		requireValid(pats != null && pats.size() == 1, "exactly one pattern per rule { ... }");
		Pattern pat0 = Objects.requireNonNull(pats.get(0));
		EList<Code> codes = pr.getCodes();
		requireValid(codes != null && codes.size() == 1, "exactly one code per rule { ... }");
		Code code0 = Objects.requireNonNull(codes.get(0));
		EList<Correction> corrs = pr.getCorrections();
		requireValid(corrs != null && corrs.size() == 1, "exactly one correction per rule { ... }");
		Correction corr0 = Objects.requireNonNull(corrs.get(0));
		return new ProjectedGenPatternRemediationRule(
				new ProjectedGenPattern(requireNonBlankField(pat0.getPattern(), "rule.pattern")),
				new ProjectedGenRemediationCode(requireNonBlankField(code0.getCode(), "rule.code")),
				new ProjectedGenRemediationCorrection(
						requireNonBlankField(corr0.getCorrection(), "rule.correction")));
	}

	private static ProjectedGenDefaultRemediationRule mapDefaultRemediationRule(GenDefaultRemediationRule dr) {
		EList<Code> codes = dr.getCodes();
		requireValid(codes != null && codes.size() == 1, "exactly one code per default { ... }");
		Code code0 = Objects.requireNonNull(codes.get(0));
		EList<Correction> corrs = dr.getCorrections();
		requireValid(corrs != null && corrs.size() == 1, "exactly one correction per default { ... }");
		Correction corr0 = Objects.requireNonNull(corrs.get(0));
		return new ProjectedGenDefaultRemediationRule(
				new ProjectedGenRemediationCode(requireNonBlankField(code0.getCode(), "default.code")),
				new ProjectedGenRemediationCorrection(
						requireNonBlankField(corr0.getCorrection(), "default.correction")));
	}

	private static ProjectedGenUsageBlock mapGenUsageBlock(GenUsageBlock u) {
		requireValid(u != null, "modelUsage block is null");
		EList<Provider> providers = u.getProviders();
		EList<MaxRetries> maxRetries = u.getMaxRetries();
		EList<EscalationProvider> escalations = u.getEscalations();
		requireValid(providers != null && providers.size() == 1, "exactly one top-level provider in modelUsage");
		requireValid(maxRetries != null && maxRetries.size() == 1, "exactly one maxRetries in modelUsage");
		int nes = escalations == null ? 0 : escalations.size();
		requireValid(nes <= 1, "at most one escalationTo in modelUsage");
		Optional<ProjectedGenEscalationTo> escalationTo = Optional.empty();
		if (nes == 1) {
			EscalationProvider ep0 = Objects.requireNonNull(escalations.get(0));
			if (!(ep0 instanceof GenEscalationBlock eb)) {
				throw new IllegalStateException(
						"LibrettoProjectProfileProjectionMapper: expected GenEscalationBlock for modelUsage escalationTo");
			}
			escalationTo = Optional.of(
					new ProjectedGenEscalationTo(requireNonBlankField(eb.getName(), "modelUsage.escalationTo.name")));
		}
		return new ProjectedGenUsageBlock(
				mapGenProvider(Objects.requireNonNull(providers.get(0)), "modelUsage.provider.name"),
				new ProjectedGenMaxRetries(Objects.requireNonNull(maxRetries.get(0)).getMaxRetries()),
				escalationTo);
	}

	private static ProjectedGenProvider mapGenProvider(Provider p, String nameFieldLabel) {
		if (!(p instanceof PrimaryProvider pp)) {
			throw new IllegalStateException(
					"LibrettoProjectProfileProjectionMapper requires validator-clean LPP: modelUsage provider must be primary");
		}
		return new ProjectedGenProvider(requireNonBlankField(pp.getName(), nameFieldLabel));
	}

}
