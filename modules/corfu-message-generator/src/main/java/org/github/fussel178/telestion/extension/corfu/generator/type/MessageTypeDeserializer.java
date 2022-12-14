package org.github.fussel178.telestion.extension.corfu.generator.type;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdNodeBasedDeserializer;

@SuppressWarnings("unused")
public class MessageTypeDeserializer extends StdNodeBasedDeserializer<MessageType> {

	public MessageTypeDeserializer() {
		this(null);
	}

	public MessageTypeDeserializer(Class<MessageType> targetType) {
		super(targetType);
	}

	@Override
	public MessageType convert(JsonNode root, DeserializationContext ctxt) {
		if (root.isTextual()) {
			return new SingleMessageType(root.asText());
		}

		if (root.isObject()) {
			if (root.has("type")) {
				var property = root.get("type");
				if (!property.isTextual()) {
					return null;
				}

				return new SingleMessageType(property.asText());
			}

			// array test
			if (root.has("array")) {
				var property = root.get("array");
				if (!property.isObject()) {
					return null;
				}

				return new ArrayMessageType(
						property.get("type").asText(),
						property.get("length").asInt()
				);
			}

			// bit array test
			if (root.has("bit_array")) {
				var property = root.get("bit_array");
				if (!property.isObject()) {
					return null;
				}

				return new BitArrayMessageType(property.get("length").asInt());
			}
		}

		throw new IllegalArgumentException("Cannot deserialize the following message type: %s".formatted(root));
	}
}
