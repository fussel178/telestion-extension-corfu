package org.github.fussel178.telestion.extension.corfu.corfu.mapper.jackson;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdNodeBasedDeserializer;
import org.github.fussel178.telestion.extension.corfu.corfu.mapper.message.CorfuNode;
import org.github.fussel178.telestion.extension.corfu.corfu.mapper.store.MessageTypeStore;

import java.io.IOException;

public class NodeDeserializer extends StdNodeBasedDeserializer<CorfuNode> {

	private final MessageTypeStore store;

	public NodeDeserializer(MessageTypeStore store) {
		this(null, store);
	}

	public NodeDeserializer(Class<CorfuNode> targetType, MessageTypeStore store) {
		super(targetType);
		this.store = store;
	}

	@Override
	public CorfuNode convert(JsonNode root, DeserializationContext context) throws IOException {
		if (!root.isObject()) return null;
		var identifierNode = root.get(CorfuNode.IDENTIFIER_PROPERTY);
		if (!identifierNode.isTextual()) return null;

		return context.readTreeAsValue(root, store.getNodeType(identifierNode.asText()));
	}
}
