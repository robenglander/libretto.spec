/*
 * Grammar-level .lpp parsing tests (replaces prior Java; do not add a parallel LibrettoProjectProfileParsingTest.java).
 */
package com.robenglander.libretto.spec.tests

import com.google.inject.Inject
import com.robenglander.libretto.spec.librettoProjectProfile.ProjectProfile
import java.util.List
import java.util.stream.Collectors
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(LibrettoProjectProfileInjectorProvider)
class LibrettoProjectProfileParsingTest {

	@Inject
	ParseHelper<ProjectProfile> parseHelper

	@Test
	def void loadMinimalProfile() throws Exception {
		val result = parseHelper.parse('''
			profile "1" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("m", "m")»
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			    returnType method getJoint as boolean;
			    for module "account" {
			      paramType name simulationPeriod as java.time.YearMonth;
			      recordSelfReturn plus, minus, times, abs;
			      methodOverride tax() returns com.example.TaxBehaviorOperations;
			    }
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «joinDiagnostics(errors)»''')
	}

	@Test
	def void loadProfileWithName() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("m", "m")»
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		Assertions.assertTrue(result.eResource.errors.isEmpty)
	}

	@Test
	def void loadProfileWithProjectModules() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      module "common" {
			        dir "common"
			        specDir "src/spec/public"
			        testDir "src/test/java"
			        mainDir "src/main/java"
			        basePackage "com.lumiscape.common"
			      }
			    }
			    gen {
			      initialInstruction "Test profile gen block."
			      maxRetries 2
			      parseCheck true
			      defaultCorrection "Retry with valid output."
			      rules {
			        rule {
			          pattern "_"
			          code "TEST_RULE"
			          correction "Test profile placeholder rule."
			        }
			        default {
			          code "UNPARSEABLE_SYNTHESIS"
			          correction "Fix syntax."
			        }
			      }
			      modelUsage {
			        primary local-default
			        secondary openai-fast
			        escalation {
			          enabled true
			          atRetry 2
			        }
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
			      model "gpt-5.4-mini"
			    }
			    provider ollama-qwen {
			      type ollama
			      model "qwen2.5-coder:14b"
			      endpoint "http://localhost:11434"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «joinDiagnostics(errors)»''')
	}

	@Test
	def void loadProfileWithStructuredRemediations() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      module "common" {
			        dir "common"
			        specDir "src/spec/public"
			        testDir "src/test/java"
			        mainDir "src/main/java"
			        basePackage "com.lumiscape.common"
			      }
			    }
			    gen {
			      initialInstruction "Never use placeholders."
			      maxRetries 2
			      parseCheck true
			      defaultCorrection "Generic retry."
			      rules {
			        rule {
			          pattern "TODO"
			          code "FORBIDDEN_PATTERN"
			          correction "Remove TODO markers."
			        }
			        default {
			          code "UNPARSEABLE_SYNTHESIS"
			          correction "Fix Java syntax."
			        }
			      }
			      modelUsage {
			        primary local-default
			        secondary local-secondary
			        escalation {
			          enabled true
			          atRetry 0
			        }
			      }
			    }
			  }
			  llmProviders {
			    provider local-default {
			      type local
			      filePath "/models/local.bin"
			    }
			    provider local-secondary {
			      type local
			      filePath "/models/local-secondary.bin"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «joinDiagnostics(errors)»''')
	}

	@Test
	def void rejectsMissingProjectSection() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("project { ... } is required exactly once.")],
			'''Unexpected errors: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsMissingLlmProvidersSectionAnchorsProfileKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("llmProviders { ... } is required exactly once.")],
			'''Expected missing llmProviders on profile keyword; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsMoreThanOneLlmProvidersSectionAnchorsEachLlmProvidersKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  llmProviders {
			    provider other {
			      type local
			      filePath "/other"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val msg = "Only one llmProviders { ... } section is allowed."
		val n = issues.stream().filter[it.contains(msg)].count
		Assertions.assertEquals(2L, n,
			'''Expected one diagnostic per duplicate llmProviders keyword; got «n»: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsDuplicateLlmProviderNamesAnchorsEachProviderName() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default { code "X" correction "Y" }
			      }
			      modelUsage {
			        primary dup
			        secondary dup
			        escalation {
			          enabled true
			          atRetry 0
			        }
			      }
			    }
			  }
			  llmProviders {
			    provider dup {
			      type local
			      filePath "/a"
			    }
			    provider dup {
			      type local
			      filePath "/b"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val msg = "Duplicate provider name in llmProviders; each provider name must be unique."
		val n = issues.stream().filter[it.contains(msg)].count
		Assertions.assertEquals(2L, n,
			'''Expected one diagnostic per duplicate provider name; got «n»: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsProviderWithNoTypeAnchorsProviderKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider no-type {
			      filePath "/x"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("provider { ... } must declare exactly one type.")],
			'''Expected missing type on provider keyword; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsInvalidLlmProviderTypeNameAnchorsTypeName() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider bad-type {
			      type mistral
			      model "x"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		// Keep in sync with LibrettoProjectProfileValidator.ALLOWED_LLM_PROVIDER_TYPE_NAMES order / contents.
		val expectedTypeMsg = "Provider type must be one of: local, openai, anthropic, gemini, ollama."
		Assertions.assertTrue(
			issues.stream().anyMatch[it == expectedTypeMsg],
			'''Expected invalid provider type on type name; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsModelWhenProviderTypeIsLocalAnchorsModelKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider local-with-model {
			      type local
			      filePath "/x.gguf"
			      model "should-not-exist"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(1L,
			issues.stream().filter[it.contains("model must not be specified when type is local; use filePath only.")].count(),
			'''Expected one diagnostic on model keyword; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsEachModelLineWhenTypeIsLocal() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider local-two-models {
			      type local
			      filePath "/x.gguf"
			      model "a"
			      model "b"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(2L,
			issues.stream().filter[it.contains("model must not be specified when type is local; use filePath only.")].count(),
			'''Expected one diagnostic per model line; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsLocalTypeWithoutFilePathAnchorsProviderKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider local-no-path {
			      type local
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it == "type local requires exactly one filePath entry in provider { ... }."],
			'''Expected missing filePath on provider keyword; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsLocalTypeWithTwoFilePathsAnchorsEachFilePathKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider local-two-paths {
			      type local
			      filePath "/a.gguf"
			      filePath "/b.gguf"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(2L,
			issues.stream().filter[it == "Only one filePath is allowed when type is local."].count(),
			'''Expected one diagnostic per filePath line; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsDuplicateLocalFilePathValueAcrossProvidersAnchorsPathValue() throws Exception {
		val msg = "filePath value must be unique across all type local providers."
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/shared-local.gguf"
			    }
			    provider local-other {
			      type local
			      filePath "/shared-local.gguf"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(2L,
			issues.stream().filter[it == msg].count(),
			'''Expected one diagnostic per duplicate path value; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsDuplicateLocalFilePathAcrossProvidersTrimsForComparison() throws Exception {
		val msg = "filePath value must be unique across all type local providers."
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/trim-dup.gguf"
			    }
			    provider local-other {
			      type local
			      filePath "  /trim-dup.gguf  "
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(2L,
			issues.stream().filter[it == msg].count(),
			'''Expected trim-sensitive duplicate path; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsDuplicateOpenaiModelValueAcrossProvidersAnchorsModeValue() throws Exception {
		val msg = "model value must be unique across all type openai providers."
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider openai-a {
			      type openai
			      model "shared-openai-model"
			    }
			    provider openai-b {
			      type openai
			      model "shared-openai-model"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(2L,
			issues.stream().filter[it == msg].count(),
			'''Expected one diagnostic per duplicate model mode; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void acceptsSameModelIdOnOpenaiAndGeminiBecauseUniquenessIsPerType() throws Exception {
		val dupMsg = "model value must be unique across all type openai providers."
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider openai-p {
			      type openai
			      model "same-id-different-types"
			    }
			    provider gemini-p {
			      type gemini
			      model "same-id-different-types"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(0L,
			issues.stream().filter[it == dupMsg].count(),
			'''Openai vs gemini same string must not cross-fire; got «String.join(", ", issues)»'''
		)
		Assertions.assertTrue(result.eResource.errors.isEmpty, '''Unexpected errors: «joinDiagnostics(result.eResource.errors)»''')
	}

	@Test
	def void rejectsDuplicateOllamaModelValueAcrossProvidersAnchorsModeValue() throws Exception {
		val msg = "model value must be unique across all type ollama providers."
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider ollama-a {
			      type ollama
			      model "qwen-dup"
			      endPoint "http://localhost:11434"
			    }
			    provider ollama-b {
			      type ollama
			      model "qwen-dup"
			      endPoint "http://localhost:11435"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(2L,
			issues.stream().filter[it == msg].count(),
			'''Expected duplicate model for ollama; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsEndpointWhenProviderTypeIsLocalAnchorsEndpointKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider local-with-endpoint {
			      type local
			      filePath "/x.gguf"
			      endPoint "http://localhost:9"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(1L,
			issues.stream().filter[it == "endpoint must not be specified when type is local."].count(),
			'''Expected one diagnostic on endpoint keyword; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsEachEndpointLineWhenTypeIsLocal() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider local-two-endpoints {
			      type local
			      filePath "/x.gguf"
			      endPoint "http://localhost:1"
			      endPoint "http://localhost:2"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(2L,
			issues.stream().filter[it == "endpoint must not be specified when type is local."].count(),
			'''Expected one diagnostic per endpoint line; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsFilePathWhenProviderTypeIsOpenaiAnchorsFilePathKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider openai-bad-path {
			      type openai
			      model "gpt-4o-mini"
			      filePath "/should-not-be-here.gguf"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(1L,
			issues.stream().filter[it == "filePath must not be specified when type is openai."].count(),
			'''Expected one diagnostic on filePath keyword; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsEndpointWhenProviderTypeIsOpenaiAnchorsEndpointKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider openai-bad-endpoint {
			      type openai
			      model "gpt-4o-mini"
			      endPoint "https://api.openai.com"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(1L,
			issues.stream().filter[it == "endpoint must not be specified when type is openai."].count(),
			'''Expected one diagnostic on endpoint keyword; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsOpenaiProviderWithoutModelAnchorsProviderKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider openai-no-model {
			      type openai
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(1L,
			issues.stream().filter[it == "type openai requires exactly one model entry in provider { ... }."].count(),
			'''Expected missing-model diagnostic on provider; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsEachModelLineWhenTypeIsOpenai() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider openai-two-models {
			      type openai
			      model "gpt-4o-mini"
			      model "gpt-4o"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(2L,
			issues.stream().filter[it == "Only one model is allowed when type is openai."].count(),
			'''Expected one diagnostic per model line; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsGeminiProviderWithoutModelSameAsOpenaiRule() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider gemini-no-model {
			      type gemini
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(1L,
			issues.stream().filter[it == "type gemini requires exactly one model entry in provider { ... }."].count(),
			'''Expected missing-model diagnostic for gemini; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsAnthropicFilePathWhenManagedType() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider anthropic-bad-path {
			      type anthropic
			      model "claude-3-5-sonnet-20241022"
			      filePath "/nope"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(1L,
			issues.stream().filter[it == "filePath must not be specified when type is anthropic."].count(),
			'''Expected filePath diagnostic for anthropic; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsOllamaFilePathLikeManagedTypes() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider ollama-bad-path {
			      type ollama
			      model "qwen"
			      filePath "/bad.gguf"
			      endPoint "http://localhost:11434"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(1L,
			issues.stream().filter[it == "filePath must not be specified when type is ollama."].count(),
			'''Expected filePath diagnostic for ollama; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsOllamaWithoutEndpointAnchorsProviderKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider ollama-no-endpoint {
			      type ollama
			      model "qwen"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(1L,
			issues.stream().filter[it == "type ollama requires exactly one endpoint entry in provider { ... }."].count(),
			'''Expected missing-endpoint on provider; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsEachEndpointLineWhenTypeIsOllama() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider ollama-two-endpoints {
			      type ollama
			      model "qwen"
			      endPoint "http://localhost:1"
			      endPoint "http://localhost:2"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertEquals(2L,
			issues.stream().filter[it == "Only one endpoint is allowed when type is ollama."].count(),
			'''Expected one diagnostic per endpoint line; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsProviderWithTwoTypesAnchorsEachTypeKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			    provider double-type {
			      type local
			      filePath "/a"
			      type local
			      filePath "/b"
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val dupType = issues.stream().filter[it.contains("Only one type is allowed per provider { ... }.")].count()
		Assertions.assertEquals(2L, dupType,
			'''Expected one diagnostic per type line (same pattern as duplicate gen declarations); got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsUnknownPrimaryInModelUsageAnchorsPrimaryProviderName() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default { code "X" correction "Y" }
			      }
			      modelUsage {
			        primary not-a-declared-provider
			        secondary test-minimal-provider
			        escalation {
			          enabled true
			          atRetry 0
			        }
			      }
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("primary must name a provider declared in llmProviders { ... }.")],
			'''Expected unknown primary on provider name; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsUnknownSecondaryInModelUsageAnchorsSecondaryProviderName() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default { code "X" correction "Y" }
			      }
			      modelUsage {
			        primary test-minimal-provider
			        secondary not-a-declared-provider
			        escalation {
			          enabled true
			          atRetry 0
			        }
			      }
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("secondary must name a provider declared in llmProviders { ... }.")],
			'''Expected unknown secondary on provider name; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsMissingRootDir() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("project.rootDir is required exactly once.")],
			'''Unexpected errors: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsMoreThanOneRootDir() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    rootDir "other"
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("Only one rootDir is allowed.")],
			'''Unexpected errors: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsMultipleProjectSectionsAnchorsEachProjectKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("a", "a")»
			    }
			    «minimalGenBlock()»
			  }
			  project {
			    rootDir "."
			    modules {
			      «completeModule("b", "b")»
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val tooMany = issues.stream().filter[it.contains("Only one project { ... } block is allowed.")].count
		Assertions.assertEquals(2L, tooMany,
			'''Expected two squiggles (one per project keyword); got «tooMany»: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsMissingRootDirOnSecondProjectBlock() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("a", "a")»
			    }
			    «minimalGenBlock()»
			  }
			  project {
			    modules {
			      «completeModule("b", "b")»
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("project.rootDir is required exactly once with a non-empty path.")],
			'''Second project has no rootDir; expected that diagnostic. Got: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsMissingModulesSection() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir ".";
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("project.modules { ... } is required at least once.")],
			'''Unexpected errors: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsMoreThanOneModulesSectionAnchorsEachModulesKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    modules {
			      «completeModule("other", "other")»
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val tooMany = issues.stream().filter[it.contains("Only one modules { ... } section is allowed.")].count
		Assertions.assertEquals(2L, tooMany,
			'''Expected two squiggles (one per modules keyword); got «tooMany»: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsEmptyModulesSection() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir ".";
			    modules {
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("modules { ... } must contain at least one module.")],
			'''Unexpected errors: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsEmptyLlmProvidersSectionAnchorsLlmProvidersKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    «minimalGenBlock()»
			  }
			  llmProviders {
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("llmProviders { ... } must contain at least one provider.")],
			'''Expected empty llmProviders error; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsIncompleteModuleBodyAnchorsModuleKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      module incomplete {
			        dir "only"
			      }
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[
				it.contains("Module is missing required declaration(s):") &&
					it.contains("specDir") && it.contains("testDir") && it.contains("mainDir") && it.contains("basePackage")
			],
			'''Expected module completeness diagnostic on module keyword; got: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsDuplicateDirInModuleAnchorsEachDirKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      module dupdir {
			        dir "a"
			        dir "b"
			        specDir "s/spec"
			        testDir "s/test"
			        mainDir "s/main"
			        basePackage "com.ex.dupdir"
			      }
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val msg = "Only one dir declaration is allowed per module."
		val n = issues.stream().filter[it.contains(msg)].count
		Assertions.assertEquals(2L, n,
			'''Expected one diagnostic per duplicate dir keyword; got «n»: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsDuplicateModuleNamesAnchorsEachName() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "a")»
			      «completeModule("common", "b")»
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val dupMsg = "Duplicate module name in project; each module name must be unique."
		val dups = issues.stream().filter[it.contains(dupMsg)].count
		Assertions.assertEquals(2L, dups,
			'''Expected one error per duplicate module (anchored on name); got «dups»: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsMultipleProfilesAnchorsErrorOnEachProfileKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "a" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("m", "d")»
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface { }
			}
			profile "b" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("m2", "d2")»
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface { }
			}
			profile "c" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("m3", "d3")»
			    }
			    «minimalGenBlock()»
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface { }
			}
		''')
		Assertions.assertNotNull(result)
		Assertions.assertEquals(3, result.profiles.size)
		val issues = diagnosticMessages(result)
		val msg = "Only one profile { ... } block is allowed."
		val tooMany = issues.stream().filter[it.contains(msg)].count
		Assertions.assertEquals(result.profiles.size, tooMany,
			'''Expected one such error per profile block («result.profiles.size»); got: «String.join(", ", issues)»''')
	}

	@Test
	def void rejectsMissingGenSectionAnchorsOnProjectKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("project.gen { ... } is required exactly once.")],
			'''Unexpected errors: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsGenWithMissingRequiredDeclarationsAnchorsGenKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      maxRetries 1
			      parseCheck true
			    }
			  }
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(issues.contains("gen.modelUsage { ... } is required."))
		Assertions.assertTrue(issues.contains("gen.initialInstruction is required."))
		Assertions.assertTrue(issues.contains("gen.defaultCorrection is required."))
		Assertions.assertTrue(issues.contains("gen.rules { ... } is required."))
		Assertions.assertEquals(4, issues.size,
			'''Expected exactly four gen-keyword diagnostics; got: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsDuplicateParseCheckInGenAnchorsEachParseCheckKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      parseCheck false
			      defaultCorrection "b"
			      rules {
			        default {
			          code "X"
			          correction "Y"
			        }
			      }
			      «minimalModelUsageForTests()»
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val msg = "Only one parseCheck is allowed in gen { ... }."
		val n = issues.stream().filter[it.contains(msg)].count
		Assertions.assertEquals(2L, n,
			'''Expected one diagnostic per duplicate parseCheck keyword; got «n»: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsDuplicateRulesSectionsInGenAnchorsEachRulesKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        default {
			          code "X"
			          correction "Y"
			        }
			      }
			      rules {
			        default {
			          code "Z"
			          correction "W"
			        }
			      }
			      «minimalModelUsageForTests()»
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val msg = "Only one rules { ... } section is allowed in gen { ... }."
		val n = issues.stream().filter[it.contains(msg)].count
		Assertions.assertEquals(2L, n,
			'''Expected one diagnostic per duplicate rules keyword; got «n»: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void warnsWhenRulesSectionHasNoRuleBlocksAnchorsRulesKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        default {
			          code "X"
			          correction "Y"
			        }
			      }
			      «minimalModelUsageForTests()»
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		Assertions.assertTrue(result.eResource.errors.isEmpty,
			'''Expected no errors; got: «joinDiagnostics(result.eResource.errors)»''')
		val warn = warningMessages(result)
		Assertions.assertTrue(
			warn.stream().anyMatch[it.contains("rules { ... } contains no rule { ... } blocks.")],
			'''Expected rules warning; got: «String.join(", ", warn)»'''
		)
	}

	@Test
	def void rejectsRulesBlockMissingDefaultSectionAnchorsRulesKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule {
			          pattern "p"
			          code "C"
			          correction "R"
			        }
			      }
			      «minimalModelUsageForTests()»
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("rules { ... } must contain a default { ... } section.")],
			'''Expected missing-default error; got: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsDuplicateDefaultSectionInRulesAnchorsEachDefaultKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule {
			          pattern "p"
			          code "C"
			          correction "R"
			        }
			        default {
			          code "X"
			          correction "Y"
			        }
			        default {
			          code "Z"
			          correction "W"
			        }
			      }
			      «minimalModelUsageForTests()»
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val msg = "Only one default { ... } section is allowed in rules { ... }."
		val n = issues.stream().filter[it.contains(msg)].count
		Assertions.assertEquals(2L, n,
			'''Expected one diagnostic per duplicate default keyword; got «n»: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsDefaultMissingCodeAndCorrectionAnchorsDefaultKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default {
			        }
			      }
			      «minimalModelUsageForTests()»
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("default.code is required.")],
			'''Expected missing code on default keyword; got «String.join(", ", issues)»'''
		)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("default.correction is required.")],
			'''Expected missing correction on default keyword; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsBlankCorrectionInDefaultAnchorsDefaultKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default { code "X" correction "" }
			      }
			      «minimalModelUsageForTests()»
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("default.correction is required.")],
			'''Expected blank correction treated as missing; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsDuplicateCodeInDefaultAnchorsEachCodeKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default {
			          code "X"
			          code "Z"
			          correction "Y"
			        }
			      }
			      «minimalModelUsageForTests()»
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val msg = "Only one code is allowed in a default { ... } section."
		val n = issues.stream().filter[it.contains(msg)].count
		Assertions.assertEquals(2L, n,
			'''Expected one diagnostic per duplicate code keyword; got «n»: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsRuleMissingPatternCodeOrCorrectionAnchorsRuleKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule {
			        }
			        default { code "X" correction "Y" }
			      }
			      «minimalModelUsageForTests()»
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("rule.pattern is required.")],
			'''Expected missing pattern on rule keyword; got «String.join(", ", issues)»'''
		)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("rule.code is required.")],
			'''Expected missing code on rule keyword; got «String.join(", ", issues)»'''
		)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("rule.correction is required.")],
			'''Expected missing correction on rule keyword; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsBlankPatternInRuleAnchorsRuleKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule { pattern "" code "C" correction "R" }
			        default { code "X" correction "Y" }
			      }
			      «minimalModelUsageForTests()»
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("rule.pattern is required.")],
			'''Expected blank pattern treated as missing; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsDuplicatePatternInRuleAnchorsEachPatternKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule {
			          pattern "a"
			          pattern "b"
			          code "C"
			          correction "R"
			        }
			        default { code "X" correction "Y" }
			      }
			      «minimalModelUsageForTests()»
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val msg = "Only one pattern is allowed in a rule { ... } block."
		val n = issues.stream().filter[it.contains(msg)].count
		Assertions.assertEquals(2L, n,
			'''Expected one diagnostic per duplicate pattern keyword; got «n»: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsMissingModelUsageAnchorsGenKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default { code "X" correction "Y" }
			      }
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("gen.modelUsage { ... } is required.")],
			'''Expected missing modelUsage on gen keyword; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsMissingSecondaryInModelUsageAnchorsModelUsageKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default { code "X" correction "Y" }
			      }
			      modelUsage {
			        primary test-minimal-provider
			        escalation {
			          enabled true
			          atRetry 0
			        }
			      }
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("modelUsage.secondary is required when escalation.enabled is true.")],
			'''Expected missing secondary on modelUsage keyword; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void acceptsModelUsageWithoutSecondaryWhenEscalationDisabled() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default { code "X" correction "Y" }
			      }
			      modelUsage {
			        primary test-minimal-provider
			        escalation {
			          enabled false
			          atRetry 0
			        }
			      }
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		Assertions.assertTrue(result.eResource.errors.isEmpty, '''Unexpected errors: «joinDiagnostics(result.eResource.errors)»''')
		val issues = diagnosticMessages(result)
		Assertions.assertFalse(
			issues.stream().anyMatch[it.contains("modelUsage.secondary is required when escalation.enabled is true.")],
			'''enabled false must not require secondary; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsPrimaryAndSecondarySameNameAnchorsBothKeywords() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default { code "X" correction "Y" }
			      }
			      modelUsage {
			        primary test-minimal-provider
			        secondary test-minimal-provider
			        escalation {
			          enabled true
			          atRetry 0
			        }
			      }
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val msg = "primary and secondary must not name the same provider."
		Assertions.assertEquals(2L,
			issues.stream().filter[it == msg].count(),
			'''Expected one diagnostic on primary and one on secondary keyword; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsDuplicatePrimaryInModelUsageAnchorsEachPrimaryKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default { code "X" correction "Y" }
			      }
			      modelUsage {
			        primary test-minimal-provider
			        primary test-minimal-provider
			        secondary test-minimal-provider
			        escalation {
			          enabled true
			          atRetry 0
			        }
			      }
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val msg = "Only one primary is allowed in modelUsage { ... }."
		val n = issues.stream().filter[it.contains(msg)].count
		Assertions.assertEquals(2L, n,
			'''Expected one diagnostic per duplicate primary keyword; got «n»: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsDuplicateModelUsageAnchorsEachModelUsageKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			      initialInstruction "a"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "b"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default { code "X" correction "Y" }
			      }
			      «minimalModelUsageForTests()»
			      «minimalModelUsageForTests()»
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val msg = "Only one modelUsage { ... } section is allowed in gen { ... }."
		val n = issues.stream().filter[it.contains(msg)].count
		Assertions.assertEquals(2L, n,
			'''Expected one diagnostic per duplicate modelUsage keyword; got «n»: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsMoreThanOneGenSectionAnchorsEachGenKeyword() throws Exception {
		val result = parseHelper.parse('''
			profile "lumiscape" {
			  project {
			    rootDir "."
			    modules {
			      «completeModule("common", "common")»
			    }
			    gen {
			    }
			    gen {
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface {
			  }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		val msg = "Only one gen { ... } section is allowed."
		val n = issues.stream().filter[it.contains(msg)].count
		Assertions.assertEquals(2L, n,
			'''Expected one diagnostic per gen keyword; got «n»: «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsMaxRetriesAboveFive() throws Exception {
		val result = parseHelper.parse('''
			profile "x" {
			  project {
			    rootDir "."
			    modules { «completeModule("m", "m")» }
			    gen {
			      initialInstruction "i"
			      maxRetries 6
			      parseCheck true
			      defaultCorrection "c"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default { code "X" correction "Y" }
			      }
			      «minimalModelUsageForTests()»
			    }
			  }
			  «minimalLlmProvidersForGenTests()»
			  surface { }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("maxRetries must be between 0 and 5.")],
			'''Expected maxRetries range error; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void rejectsAtRetryAboveFive() throws Exception {
		val result = parseHelper.parse('''
			profile "x" {
			  project {
			    rootDir "."
			    modules { «completeModule("m", "m")» }
			    gen {
			      initialInstruction "i"
			      maxRetries 3
			      parseCheck true
			      defaultCorrection "c"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default { code "X" correction "Y" }
			      }
			      modelUsage {
			        primary p
			        secondary p
			        escalation { atRetry 6 }
			      }
			    }
			  }
			  llmProviders { provider p { type local filePath "/x" } }
			  surface { }
			}
		''')
		Assertions.assertNotNull(result)
		val issues = diagnosticMessages(result)
		Assertions.assertTrue(
			issues.stream().anyMatch[it.contains("atRetry must be between 0 and 5.")],
			'''Expected atRetry range error; got «String.join(", ", issues)»'''
		)
	}

	@Test
	def void warnsWhenAtRetryGreaterThanMaxRetries() throws Exception {
		val result = parseHelper.parse('''
			profile "x" {
			  project {
			    rootDir "."
			    modules { «completeModule("m", "m")» }
			    gen {
			      initialInstruction "i"
			      maxRetries 2
			      parseCheck true
			      defaultCorrection "c"
			      rules {
			        rule { pattern "_" code "C" correction "R" }
			        default { code "X" correction "Y" }
			      }
			      modelUsage {
			        primary p
			        secondary p
			        escalation { atRetry 4 }
			      }
			    }
			  }
			  llmProviders { provider p { type local filePath "/x" } }
			  surface { }
			}
		''')
		Assertions.assertNotNull(result)
		Assertions.assertTrue(result.eResource.errors.isEmpty, '''Unexpected errors: «joinDiagnostics(result.eResource.errors)»''')
		val warns = warningMessages(result)
		Assertions.assertTrue(
			warns.stream().anyMatch[it.contains("atRetry is greater than maxRetries for this gen block.")],
			'''Expected warning; got «String.join(", ", warns)»'''
		)
	}

	def private static String minimalModelUsageForTests() '''
			      modelUsage {
			        primary test-minimal-provider
			        escalation {
			          enabled false
			          atRetry 0
			        }
			      }
	'''

	def private static String minimalLlmProvidersForGenTests() '''
			  llmProviders {
			    provider test-minimal-provider {
			      type local
			      filePath "/test-minimal"
			    }
			  }
	'''

	/**
	 * Minimal valid {@code gen} body (initialInstruction, maxRetries, parseCheck, defaultCorrection, rules, modelUsage).
	 * Pair with {@code minimalLlmProvidersForGenTests()} at profile level (primary {@code test-minimal-provider};
	 * escalation {@code enabled false} so {@code secondary} is omitted).
	 */
	def private static String minimalGenBlock() '''
			    gen {
			      initialInstruction "minimal"
			      maxRetries 1
			      parseCheck true
			      defaultCorrection "minimal"
			      rules {
			        rule {
			          pattern "_"
			          code "MIN"
			          correction "minimal"
			        }
			        default {
			          code "X"
			          correction "Y"
			        }
			      }
			      «minimalModelUsageForTests()»
			    }
	'''

	/** Valid project {@code module} bodies for tests (all of dir, specDir, testDir, mainDir, basePackage). */
	def private static String completeModule(String name, String pathPrefix) '''
			      module «name» {
			        dir "«pathPrefix»"
			        specDir "«pathPrefix»/spec"
			        testDir "«pathPrefix»/test"
			        mainDir "«pathPrefix»/main"
			        basePackage "com.example.«name»"
			      }
	'''

	def private static List<String> diagnosticMessages(ProjectProfile root) {
		root.eResource.errors.stream().map[it.message].collect(Collectors.toList)
	}

	def private static List<String> warningMessages(ProjectProfile root) {
		root.eResource.warnings.stream().map[it.message].collect(Collectors.toList)
	}

	def private static String joinDiagnostics(List<Resource.Diagnostic> errors) {
		errors.stream().map[it.message].collect(Collectors.joining(", "))
	}
}
