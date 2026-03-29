package com.robenglander.libretto.spec.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
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

	/**
	 * Valid LPP: one profile, one project (rootDir, modules, gen), one llmProviders; modelUsage top and optional
	 * {@code escalationTo} must differ when present and both exist in {@code llmProviders}.
	 */
	private static final String MINIMAL_VALID_LPP = """
			profile "1" {
			  project {
			    rootDir "."
			    modules {
			      module common {
			        dir "common"
			        specDir "src/spec/public"
			        testDir "src/test/java"
			        mainDir "src/main/java"
			        basePackage "com.example.common"
			      }
			    }
			    gen {
			      initialInstruction "x"
			      parseCheck true
			      defaultCorrection "y"
			      rules {
			        rule {
			          pattern "_"
			          code "MIN"
			          correction "c"
			        }
			        default {
			          code "X"
			          correction "Y"
			        }
			      }
			      modelUsage {
			        maxRetries 1
			        provider local-default
			        escalationTo openai-fast
			      }
			    }
			  }
			  llmProviders {
			    provider local-default {
			      type local
			      filePath "/models/local.bin"
			    }
			    provider openai-fast {
			      type openai
			      model "gpt"
			    }
			  }
			}
			""";

	@Inject
	ParseHelper<ProjectProfile> parseHelper;

	@Inject
	ValidationTestHelper validation;

	@Test
	void mapperOmitsSurfaceFromProjection() throws Exception {
		ProjectProfile file = parseHelper.parse(MINIMAL_VALID_LPP);
		assertNotNull(file);
		validation.assertNoIssues(file);
		LibrettoProjectProfileDomainModelProjection p = LibrettoProjectProfileProjectionMapper.project(file);
		assertEquals("1", p.profileName());
		assertTrue(p.project().isPresent());
		assertTrue(p.llmProvidersBlock().isPresent());
	}

	@Test
	void headlessParseAndProjectMatchesMapper() {
		var parsed = LibrettoProjectProfileHeadless.parse(MINIMAL_VALID_LPP);
		assertNotNull(parsed.fileRoot());
		assertTrue(parsed.semanticErrors().isEmpty(), () -> String.valueOf(parsed.semanticErrors()));
		LibrettoProjectProfileDomainModelProjection fromHeadless = parsed.project();
		LibrettoProjectProfileDomainModelProjection direct = LibrettoProjectProfileProjectionMapper
				.project(parsed.fileRoot());
		assertEquals(fromHeadless.domainModel(), direct.domainModel());
	}

	@Test
	void mapperMapsNamedProfileWithSurfaceBlockPresent() throws Exception {
		String named = """
				profile "acme" {
				  project {
				    rootDir "."
				    modules {
				      module common {
				        dir "common"
				        specDir "src/spec/public"
				        testDir "src/test/java"
				        mainDir "src/main/java"
				        basePackage "com.example.common"
				      }
				    }
				    gen {
				      initialInstruction "x"
				      parseCheck true
				      defaultCorrection "y"
				      rules {
				        rule {
				          pattern "_"
				          code "MIN"
				          correction "c"
				        }
				        default {
				          code "X"
				          correction "Y"
				        }
				      }
				      modelUsage {
				        maxRetries 1
				        provider local-default
				        escalationTo openai-fast
				      }
				    }
				  }
				  llmProviders {
				    provider local-default {
				      type local
				      filePath "/models/local.bin"
				    }
				    provider openai-fast {
				      type openai
				      model "gpt"
				    }
				  }
				  surface {
				  }
				}
				""";
		ProjectProfile file = parseHelper.parse(named);
		assertNotNull(file);
		validation.assertNoIssues(file);
		LibrettoProjectProfileDomainModelProjection p = LibrettoProjectProfileProjectionMapper.project(file);
		assertEquals("acme", p.profileName());
		assertTrue(p.project().isPresent());
		assertTrue(p.llmProvidersBlock().isPresent());
	}

	@Test
	void invalidProfileDoesNotProduceProjectionViaHeadless() {
		String two = """
				profile "first" {
				  project {
				    rootDir "."
				    modules {
				      module m {
				        dir "m"
				        specDir "m/s"
				        testDir "m/t"
				        mainDir "m/m"
				        basePackage "p.m"
				      }
				    }
				    gen {
				      initialInstruction "x"
				      parseCheck true
				      defaultCorrection "y"
				      rules {
				        rule { pattern "_" code "C" correction "c" }
				        default { code "X" correction "Y" }
				      }
				      modelUsage {
				        maxRetries 1
				        provider a
				        escalationTo b
				      }
				    }
				  }
				  llmProviders {
				    provider a { type local filePath "/a" }
				    provider b { type openai model "m" }
				  }
				}
				profile "second" {
				  project {
				    rootDir "."
				    modules {
				      module m {
				        dir "m"
				        specDir "m/s"
				        testDir "m/t"
				        mainDir "m/m"
				        basePackage "p.m"
				      }
				    }
				    gen {
				      initialInstruction "x"
				      parseCheck true
				      defaultCorrection "y"
				      rules {
				        rule { pattern "_" code "C" correction "c" }
				        default { code "X" correction "Y" }
				      }
				      modelUsage {
				        maxRetries 1
				        provider a
				        escalationTo b
				      }
				    }
				  }
				  llmProviders {
				    provider a { type local filePath "/a" }
				    provider b { type openai model "m" }
				  }
				}
				""";
		var parsed = LibrettoProjectProfileHeadless.parse(two);
		assertNotNull(parsed.fileRoot());
		assertTrue(parsed.hasSemanticErrors());
		assertEquals("", parsed.project().profileName());
		assertTrue(parsed.project().domainModel().project().isEmpty());
	}
}
