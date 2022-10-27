package org.github.fussel178.telestion.extension.corfu.generator.template.type;

import org.github.fussel178.telestion.extension.corfu.generator.type.MessageFields;
import org.github.fussel178.telestion.extension.corfu.generator.type.Package;

public record StructRendering(
		String rendering,
		String className,
		String binaryName,
		Package pkg,
		MessageFields config
) implements Rendering {
	public StructRendering(String rendering, String className, Package pkg, MessageFields config) {
		this(rendering, className, pkg.resolve(className).binaryName(), pkg, config);
	}
}
