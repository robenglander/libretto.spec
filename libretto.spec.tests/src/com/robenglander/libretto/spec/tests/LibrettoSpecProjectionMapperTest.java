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
import com.robenglander.libretto.spec.librettoSpec.Spec;
import com.robenglander.libretto.spec.projection.LibrettoSpecDocumentProjection;
import com.robenglander.libretto.spec.projection.ProjectedMetadataField;
import com.robenglander.libretto.spec.projection.ProjectedMetadataSection;
import com.robenglander.libretto.spec.projection.mapper.LibrettoSpecProjectionMapper;

@ExtendWith(InjectionExtension.class)
@InjectWith(LibrettoSpecInjectorProvider.class)
class LibrettoSpecProjectionMapperTest {

	@Inject
	ParseHelper<Spec> parseHelper;

	@Test
	void projectMapsMetadataTitle() throws Exception {
		Spec spec = parseHelper.parse("""
				spec Test-Projection {
				  metadata {
				    title: "Hello"
				    status: draft
				    module: "m"
				    package: "p"
				  }
				  dependencies { }
				  references { }
				  prose { }
				  out_of_scope { }
				  operation_surface { }
				  implements_surface { }
				  boundary_exports { }
				  boundary_imports { }
				  behaviors { }
				  acceptance_tests { }
				  implementation_directives { }
				}
				""");
		assertNotNull(spec);
		LibrettoSpecDocumentProjection p = LibrettoSpecProjectionMapper.project(spec);
		assertNotNull(p);
		assertEquals("Test-Projection", p.specId());
		assertInstanceOf(ProjectedMetadataSection.class, p.sections().get(0));
		ProjectedMetadataSection meta = (ProjectedMetadataSection) p.sections().get(0);
		assertInstanceOf(ProjectedMetadataField.Title.class, meta.fields().get(0));
		assertEquals("Hello", ((ProjectedMetadataField.Title) meta.fields().get(0)).title());
	}
}
