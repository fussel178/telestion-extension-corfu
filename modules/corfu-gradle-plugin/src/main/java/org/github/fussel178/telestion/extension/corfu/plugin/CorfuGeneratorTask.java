package org.github.fussel178.telestion.extension.corfu.plugin;

import org.github.fussel178.telestion.extension.corfu.generator.generator.CorfuMessageGenerator;
import org.github.fussel178.telestion.extension.corfu.generator.generator.ProjectGeneratorFilesystem;
import org.github.fussel178.telestion.extension.corfu.generator.parser.CorfuConfigParser;
import org.github.fussel178.telestion.extension.corfu.generator.parser.ParsingException;
import org.github.fussel178.telestion.extension.corfu.generator.parser.YAML;
import org.github.fussel178.telestion.extension.corfu.generator.template.JinjaTemplateEngine;
import org.github.fussel178.telestion.extension.corfu.generator.template.ResourceTemplateProvider;
import org.github.fussel178.telestion.extension.corfu.generator.type.Package;
import org.gradle.api.DefaultTask;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.*;

import java.io.IOException;

public abstract class CorfuGeneratorTask extends DefaultTask {
	@InputDirectory
	abstract RegularFileProperty getCorfuRootDir();
	@OutputDirectory
	abstract RegularFileProperty getOutputDir();
	@Input
	abstract Property<String> getGroupName();

	@TaskAction
	public void generate() throws ParsingException, IOException {
		// extract infos from gradle properties
		var corfuRootPath = getCorfuRootDir().get().getAsFile().toPath();
		var outputDirPath = getOutputDir().get().getAsFile().toPath();
		var groupName = getGroupName().get();

		// read and connect Corfu configuration from target project
		var parser = new CorfuConfigParser(YAML.getMapper());
		var config = parser.getProjectConfig(corfuRootPath);

		// generate Corfu messages based on Corfu configuration
		var basePkg = new Package(groupName);
		var fs = new ProjectGeneratorFilesystem(outputDirPath);
		var engine = new JinjaTemplateEngine(new ResourceTemplateProvider());
		var generator = new CorfuMessageGenerator(fs, engine, basePkg);
		generator.generate(config);
	}
}
