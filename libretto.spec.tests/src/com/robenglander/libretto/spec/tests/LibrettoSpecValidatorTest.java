package com.robenglander.libretto.spec.tests;

import com.google.inject.Inject;
import com.robenglander.libretto.spec.librettoSpec.LibrettoSpecPackage;
import com.robenglander.libretto.spec.librettoSpec.Spec;
import com.robenglander.libretto.spec.validation.LibrettoSpecValidator;
import java.util.List;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.validation.Issue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(InjectionExtension.class)
@InjectWith(LibrettoSpecInjectorProvider.class)
class LibrettoSpecValidatorTest {

	@Inject
	private ParseHelper<Spec> parseHelper;

	@Inject
	private ValidationTestHelper validationTestHelper;

	@Test
	void duplicateBehaviorIdIsError() throws Exception {
		Spec spec = parseHelper.parse("""
				spec DupBehaviors {
				  metadata {
				    spec_id: "DupBehaviors"
				    title: "t"
				    status: draft
				  }
				  dependencies { }
				  references { }
				  prose { }
				  out_of_scope { }
				  operation_surface { }
				  implements_surface { }
				  boundary_exports { }
				  boundary_imports { }
				  behaviors {
				    behavior B-001 {
				      source { section: "S" }
				      actor: system
				      action: return
				      objects: []
				      reads: []
				      writes: []
				      conditions: []
				      outcomes: []
				    }
				    behavior B-001 {
				      source { section: "S" }
				      actor: system
				      action: return
				      objects: []
				      reads: []
				      writes: []
				      conditions: []
				      outcomes: []
				    }
				  }
				  acceptance_tests { }
				  implementation_directives { }
				}
				""");
		List<Issue> issues = validationTestHelper.validate(spec);
		long duplicateBehaviorIssues = issues.stream()
				.filter(i -> LibrettoSpecValidator.DUPLICATE_BEHAVIOR_ID.equals(i.getCode()))
				.count();
		assertEquals(2, duplicateBehaviorIssues);
	}

	@Test
	void missingBehaviorSourceIsErrorOnBehaviorId() throws Exception {
		Spec spec = parseHelper.parse("""
				spec NoSource {
				  metadata {
				    spec_id: "NoSource"
				    title: "t"
				    status: draft
				  }
				  dependencies { }
				  references { }
				  prose { }
				  out_of_scope { }
				  operation_surface { }
				  implements_surface { }
				  boundary_exports { }
				  boundary_imports { }
				  behaviors {
				    behavior B-001 {
				      actor: system
				      action: return
				      objects: []
				      reads: []
				      writes: []
				      conditions: []
				      outcomes: []
				    }
				  }
				  acceptance_tests { }
				  implementation_directives { }
				}
				""");
		validationTestHelper.assertError(spec, LibrettoSpecPackage.Literals.BEHAVIOR_RECORD,
				LibrettoSpecValidator.MISSING_BEHAVIOR_SOURCE);
	}

	@Test
	void missingDependencyKindIsErrorOnDependencyRecord() throws Exception {
		Spec spec = parseHelper.parse("""
				spec DepKind {
				  metadata {
				    spec_id: "DepKind"
				    title: "t"
				    status: draft
				  }
				  dependencies {
				    dependency d1 {
				      target_spec: "OtherSpec"
				    }
				  }
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
		validationTestHelper.assertError(spec, LibrettoSpecPackage.Literals.DEPENDENCY_RECORD,
				LibrettoSpecValidator.MISSING_DEPENDENCY_KIND);
	}
}
