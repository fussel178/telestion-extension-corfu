package org.github.fussel178.telestion.extension.corfu.generator.template.type;

import org.github.fussel178.telestion.extension.corfu.generator.type.NodeConfiguration;
import org.github.fussel178.telestion.extension.corfu.generator.type.Package;

public record NodeRendering(
		String rendering,
		String className,
		String binaryName,
		Package pkg,
		NodeConfiguration config
) implements Rendering {
	public NodeRendering(String rendering, String className, Package pkg, NodeConfiguration config) {
		this(rendering, className, pkg.resolve(className).binaryName(), pkg, config);
	}
}
