package org.github.fussel178.telestion.extension.corfu.generator.template.type;

import org.github.fussel178.telestion.extension.corfu.generator.type.Message;
import org.github.fussel178.telestion.extension.corfu.generator.type.Package;

public record PayloadRendering(
		String rendering,
		String className,
		String binaryName,
		Package pkg,
		Message config
) implements Rendering {
	public PayloadRendering(String rendering, String className, Package pkg, Message config) {
		this(rendering, className, pkg.resolve(className).binaryName(), pkg, config);
	}
}
