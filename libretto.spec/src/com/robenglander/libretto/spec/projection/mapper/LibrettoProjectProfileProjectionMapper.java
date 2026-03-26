package com.robenglander.libretto.spec.projection.mapper;

import java.util.ArrayList;
import java.util.List;

import com.robenglander.libretto.spec.librettoProjectProfile.JavaType;
import com.robenglander.libretto.spec.librettoProjectProfile.MethodOverrideRule;
import com.robenglander.libretto.spec.librettoProjectProfile.OperationSignature;
import com.robenglander.libretto.spec.librettoProjectProfile.ParamTypeRule;
import com.robenglander.libretto.spec.librettoProjectProfile.PrimitiveType;
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
import com.robenglander.libretto.spec.projection.ProjectedJavaType;
import com.robenglander.libretto.spec.projection.ProjectedMethodOverrideRule;
import com.robenglander.libretto.spec.projection.ProjectedOperationSignature;
import com.robenglander.libretto.spec.projection.ProjectedParamTypeRule;
import com.robenglander.libretto.spec.projection.ProjectedPrimitiveJavaType;
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
		String profileName = profile.getProfileName() == null ? "" : profile.getProfileName().trim();
		List<ProjectedSurfaceElement> elements = mapSurface(profile.getSurface());
		return new LibrettoProjectProfileDomainModelProjection(
				new LibrettoProjectProfileDomainModel(profileName, elements));
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
