package org.github.fussel178.telestion.extension.corfu.generator.template.type;

import org.github.fussel178.telestion.extension.corfu.generator.type.Package;

public record PlainRendering(
		String rendering,
		String className,
		String binaryName,
		Package pkg
) implements Rendering {
	public PlainRendering(String rendering, String className, Package pkg) {
		this(rendering, className, pkg.resolve(className).binaryName(), pkg);
	}
}
