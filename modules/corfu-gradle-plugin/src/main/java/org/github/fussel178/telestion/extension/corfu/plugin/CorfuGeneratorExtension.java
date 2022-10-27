package org.github.fussel178.telestion.extension.corfu.plugin;

import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.provider.Property;

public abstract class CorfuGeneratorExtension {
	abstract RegularFileProperty getCorfuRootDir();
	abstract RegularFileProperty getOutputDir();
	abstract Property<String> getGroupName();
}
