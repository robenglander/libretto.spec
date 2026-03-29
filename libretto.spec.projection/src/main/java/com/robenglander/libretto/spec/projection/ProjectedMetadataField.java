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
		ProjectedMetadataField.ModelMetadata,
		ProjectedMetadataField.ProjectProfileVersion,
		ProjectedMetadataField.ProjectProfileId {

	record Title(String title) implements ProjectedMetadataField {
		public Title {
			title = ProjectionStrings.requireNonBlank(title, "title");
		}
	}

	record Version(String version) implements ProjectedMetadataField {
		public Version {
			version = ProjectionStrings.requireNonBlank(version, "version");
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
			moduleName = ProjectionStrings.requireNonBlank(moduleName, "moduleName");
		}
	}

	record JavaPackage(String javaPackage) implements ProjectedMetadataField {
		public JavaPackage {
			javaPackage = ProjectionStrings.requireNonBlank(javaPackage, "javaPackage");
		}
	}

	record CompiledAt(String compiledAt) implements ProjectedMetadataField {
		public CompiledAt {
			compiledAt = ProjectionStrings.requireNonBlank(compiledAt, "compiledAt");
		}
	}

	record CompilerVersion(String compilerVersion) implements ProjectedMetadataField {
		public CompilerVersion {
			compilerVersion = ProjectionStrings.requireNonBlank(compilerVersion, "compilerVersion");
		}
	}

	record ModelMetadata(String modelMetadata) implements ProjectedMetadataField {
		public ModelMetadata {
			modelMetadata = ProjectionStrings.requireNonBlank(modelMetadata, "modelMetadata");
		}
	}

	/**
	 * Declared {@code project_profile_version} — must match the loaded {@code .lpp} root version when tooling
	 * passes {@code --project_profile}.
	 */
	record ProjectProfileVersion(String version) implements ProjectedMetadataField {
		public ProjectProfileVersion {
			version = ProjectionStrings.requireNonBlank(version, "projectProfileVersion");
		}
	}

	/** Optional {@code project_profile_id}; empty string means unset. */
	record ProjectProfileId(String id) implements ProjectedMetadataField {
		public ProjectProfileId {
			id = ProjectionStrings.requireNonNullTrim(id, "projectProfileId");
		}
	}
}
