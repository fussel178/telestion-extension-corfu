package org.github.fussel178.telestion.extension.corfu.generator.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectConfiguration {

	@JsonProperty("name")
	public String name;

	@JsonProperty("ground")
	public GroundConfiguration ground;

	@Override
	public String toString() {
		return "ProjectConfiguration{" +
				"name='" + name + '\'' +
				", ground=" + ground +
				'}';
	}
}
