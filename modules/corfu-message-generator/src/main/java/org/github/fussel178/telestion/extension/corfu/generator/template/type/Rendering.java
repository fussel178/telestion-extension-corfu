package org.github.fussel178.telestion.extension.corfu.generator.template.type;

import org.github.fussel178.telestion.extension.corfu.generator.type.Package;

public interface Rendering {
	String rendering();

	String className();

	String binaryName();

	Package pkg();
}
