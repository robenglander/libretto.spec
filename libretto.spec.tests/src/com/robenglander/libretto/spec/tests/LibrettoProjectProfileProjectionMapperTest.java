package com.robenglander.libretto.spec.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;
import com.robenglander.libretto.spec.headless.LibrettoProjectProfileHeadless;
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectProfile;
import com.robenglander.libretto.spec.projection.LibrettoProjectProfileDomainModelProjection;
import com.robenglander.libretto.spec.projection.mapper.LibrettoProjectProfileProjectionMapper;

@ExtendWith(InjectionExtension.class)
@InjectWith(LibrettoProjectProfileInjectorProvider.class)
class LibrettoProjectProfileProjectionMapperTest {

	private static final String SAMPLE_WITH_SURFACE_ONLY = """
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
	void mapperOmitsSurfaceFromProjection() throws Exception {
		ProjectProfile file = parseHelper.parse(SAMPLE_WITH_SURFACE_ONLY);
		assertNotNull(file);
		LibrettoProjectProfileDomainModelProjection p = LibrettoProjectProfileProjectionMapper.project(file);
		assertEquals("1", p.profileName());
		assertTrue(p.projectBlocks().isEmpty(), "surface-only profile has no project blocks in projection");
		assertTrue(p.llmProviderBlocks().isEmpty(), "surface-only profile has no llmProviders in projection");
	}

	@Test
	void headlessParseAndProjectMatchesMapper() {
		var parsed = LibrettoProjectProfileHeadless.parse(SAMPLE_WITH_SURFACE_ONLY);
		assertNotNull(parsed.fileRoot());
		LibrettoProjectProfileDomainModelProjection fromHeadless = parsed.project();
		LibrettoProjectProfileDomainModelProjection direct = LibrettoProjectProfileProjectionMapper
				.project(parsed.fileRoot());
		assertEquals(fromHeadless.domainModel(), direct.domainModel());
	}

	@Test
	void mapperMapsNamedProfileWithSurfaceBlockPresent() throws Exception {
		String named = """
				profile "acme" {
				  surface {
				  }
				}
				""";
		ProjectProfile file = parseHelper.parse(named);
		assertNotNull(file);
		LibrettoProjectProfileDomainModelProjection p = LibrettoProjectProfileProjectionMapper.project(file);
		assertEquals("acme", p.profileName());
		assertTrue(p.projectBlocks().isEmpty());
		assertTrue(p.llmProviderBlocks().isEmpty());
	}

}
