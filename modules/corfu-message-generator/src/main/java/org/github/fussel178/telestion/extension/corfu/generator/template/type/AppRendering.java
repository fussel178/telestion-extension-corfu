package org.github.fussel178.telestion.extension.corfu.generator.template.type;

import org.github.fussel178.telestion.extension.corfu.generator.type.AppConfiguration;
import org.github.fussel178.telestion.extension.corfu.generator.type.Package;

public record AppRendering(
		String rendering,
		String className,
		String binaryName,
		Package pkg,
		AppConfiguration config
) implements Rendering {
	public AppRendering(String rendering, String className, Package pkg, AppConfiguration config) {
		this(rendering, className, pkg.resolve(className).binaryName(), pkg, config);
	}
}
