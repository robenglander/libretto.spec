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

	/**
	 * Declared {@code project_profile_version} — must match the loaded {@code .lpp} root version when tooling
	 * passes {@code --project-profile}.
	 */
	record ProjectProfileVersion(String version) implements ProjectedMetadataField {
		public ProjectProfileVersion {
			version = version == null ? "" : version.trim();
		}
	}

	/** Optional {@code project_profile_id}; if either side sets an id, both must match. */
	record ProjectProfileId(String id) implements ProjectedMetadataField {
		public ProjectProfileId {
			id = id == null ? "" : id.trim();
		}
	}
}
