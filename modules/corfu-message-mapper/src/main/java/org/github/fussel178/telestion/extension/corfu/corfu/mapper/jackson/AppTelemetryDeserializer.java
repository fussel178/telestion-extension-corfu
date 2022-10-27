package org.github.fussel178.telestion.extension.corfu.corfu.mapper.jackson;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdNodeBasedDeserializer;
import org.github.fussel178.telestion.extension.corfu.corfu.mapper.message.CorfuAppTelemetry;
import org.github.fussel178.telestion.extension.corfu.corfu.mapper.store.MessageTypeStore;

import java.io.IOException;

public class AppTelemetryDeserializer extends StdNodeBasedDeserializer<CorfuAppTelemetry> {

	private final MessageTypeStore store;

	public AppTelemetryDeserializer(MessageTypeStore store) {
		this(null, store);
	}

	public AppTelemetryDeserializer(Class<CorfuAppTelemetry> targetType, MessageTypeStore store) {
		super(targetType);
		this.store = store;
	}

	@Override
	public CorfuAppTelemetry convert(JsonNode root, DeserializationContext context) throws IOException {
		if (!root.isObject()) return null;
		var identifierNode = root.get(CorfuAppTelemetry.IDENTIFIER_PROPERTY);
		if (!identifierNode.isTextual()) return null;

		return context.readTreeAsValue(root, store.getAppTelemetryType(identifierNode.asText()));
	}
}
