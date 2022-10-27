package org.github.fussel178.telestion.extension.corfu.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class CorfuGeneratorPlugin implements Plugin<Project> {
	@Override
	public void apply(Project project) {
		var extension = project.getExtensions().create("corfuGenerator", CorfuGeneratorExtension.class);

		project.getTasks().register("generateMessages", CorfuGeneratorTask.class, task -> {
			task.getCorfuRootDir().set(extension.getCorfuRootDir());
			task.getOutputDir().set(extension.getOutputDir());
			task.getGroupName().set(extension.getGroupName());
		});
	}
}
