package com.robenglander.libretto.spec.projection;

/**
 * One {@code MetadataField} alternative from the grammar.
 */
public sealed interface ProjectedMetadataField permits
		ProjectedMetadataField.Title,
		ProjectedMetadataField.Version,
		ProjectedMetadataField.Status,
		ProjectedMetadataField.ModuleName,
		ProjectedMetadataField.JavaPackage,
		ProjectedMetadataField.CompiledAt,
		ProjectedMetadataField.CompilerVersion,
		ProjectedMetadataField.ModelMetadata {

	record Title(String title) implements ProjectedMetadataField {
		public Title {
			title = title == null ? "" : title;
		}
	}

	record Version(String version) implements ProjectedMetadataField {
		public Version {
			version = version == null ? "" : version;
		}
	}

	record Status(MetadataPublicationStatus status) implements ProjectedMetadataField {
		public Status {
			if (status == null) {
				throw new NullPointerException("status");
			}
		}
	}

	record ModuleName(String moduleName) implements ProjectedMetadataField {
		public ModuleName {
			moduleName = moduleName == null ? "" : moduleName;
		}
	}

	record JavaPackage(String javaPackage) implements ProjectedMetadataField {
		public JavaPackage {
			javaPackage = javaPackage == null ? "" : javaPackage;
		}
	}

	record CompiledAt(String compiledAt) implements ProjectedMetadataField {
		public CompiledAt {
			compiledAt = compiledAt == null ? "" : compiledAt;
		}
	}

	record CompilerVersion(String compilerVersion) implements ProjectedMetadataField {
		public CompilerVersion {
			compilerVersion = compilerVersion == null ? "" : compilerVersion;
		}
	}

	record ModelMetadata(String modelMetadata) implements ProjectedMetadataField {
		public ModelMetadata {
			modelMetadata = modelMetadata == null ? "" : modelMetadata;
		}
	}
}
