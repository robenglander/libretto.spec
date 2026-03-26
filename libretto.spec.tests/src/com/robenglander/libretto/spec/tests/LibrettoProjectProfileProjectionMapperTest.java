package com.robenglander.libretto.spec.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;
import com.robenglander.libretto.spec.headless.LibrettoProjectProfileHeadless;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectProfile;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModelProjection;
import com.robenglander.libretto.spec.projection.ProjectProfileScopeKind;
import com.robenglander.libretto.spec.projection.ProjectedMethodOverrideRule;
import com.robenglander.libretto.spec.projection.ProjectedPrimitiveJavaType;
import com.robenglander.libretto.spec.projection.ProjectedQualifiedJavaType;
import com.robenglander.libretto.spec.projection.ProjectedReturnTypeRule;
import com.robenglander.libretto.spec.projection.ProjectedScopedSurface;
import com.robenglander.libretto.spec.projection.mapper.LibrettoProjectProfileProjectionMapper;

@ExtendWith(InjectionExtension.class)
@InjectWith(LibrettoProjectProfileInjectorProvider.class)
class LibrettoProjectProfileProjectionMapperTest {

	private static final String SAMPLE = """
			profile "1" {
			  surface {
			    returnType method getX as boolean;
			    for module "common" {
			      paramType name p as int;
			      recordSelfReturn a, b;
			      methodOverride foo() returns com.example.T;
			    }
			  }
			}
			""";

	@Inject
	ParseHelper<ProjectProfile> parseHelper;

	@Test
	void mapperMapsProfileNameSurfaceAndScopedRules() throws Exception {
		ProjectProfile root = parseHelper.parse(SAMPLE);
		assertNotNull(root);
		LibrettoProjectProfileDomainModelProjection p = LibrettoProjectProfileProjectionMapper.project(root);
		assertEquals("1", p.profileName());
		assertEquals(2, p.surfaceElements().size());
		assertInstanceOf(ProjectedReturnTypeRule.class, p.surfaceElements().get(0));
		var rtr = (ProjectedReturnTypeRule) p.surfaceElements().get(0);
		assertEquals("getX", rtr.methodName());
		assertInstanceOf(ProjectedPrimitiveJavaType.class, rtr.javaType());
		assertEquals("boolean", ((ProjectedPrimitiveJavaType) rtr.javaType()).kind());
		assertInstanceOf(ProjectedScopedSurface.class, p.surfaceElements().get(1));
		var scoped = (ProjectedScopedSurface) p.surfaceElements().get(1);
		assertEquals(ProjectProfileScopeKind.MODULE, scoped.scopeKind());
		assertEquals("common", scoped.scopeId());
		assertEquals(3, scoped.rules().size());
		assertInstanceOf(ProjectedMethodOverrideRule.class, scoped.rules().get(2));
		var mor = (ProjectedMethodOverrideRule) scoped.rules().get(2);
		assertEquals("foo", mor.signature().name());
		assertInstanceOf(ProjectedQualifiedJavaType.class, mor.returnType());
		assertEquals(
				java.util.List.of("com", "example", "T"),
				((ProjectedQualifiedJavaType) mor.returnType()).segments());
	}

	@Test
	void headlessParseAndProjectMatchesMapper() {
		var parsed = LibrettoProjectProfileHeadless.parse(SAMPLE);
		assertNotNull(parsed.projectProfile());
		LibrettoProjectProfileDomainModelProjection fromHeadless = parsed.project();
		LibrettoProjectProfileDomainModelProjection direct = LibrettoProjectProfileProjectionMapper
				.project(parsed.projectProfile());
		assertEquals(fromHeadless.domainModel(), direct.domainModel());
	}

	@Test
	void mapperMapsNamedProfileWithEmptySurface() throws Exception {
		String named = """
				profile "acme" {
				  surface {
				  }
				}
				""";
		ProjectProfile root = parseHelper.parse(named);
		assertNotNull(root);
		LibrettoProjectProfileDomainModelProjection p = LibrettoProjectProfileProjectionMapper.project(root);
		assertEquals("acme", p.profileName());
	}

}
