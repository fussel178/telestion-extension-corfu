package org.github.fussel178.telestion.extension.corfu.generator.type;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Map;

@JsonDeserialize(using = MessageTypeDeserializer.class)
public interface MessageType {
	void resolveType(Map<String, TypeReference> references);

	void setName(String raw);

	ComponentName getName();

	int count();

	String type();

	TypeReference reference();
}
