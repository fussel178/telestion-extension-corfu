package org.github.fussel178.telestion.extension.corfu.corfu.mapper.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.github.fussel178.telestion.extension.corfu.corfu.mapper.message.CorfuAppTelecommand;
import org.github.fussel178.telestion.extension.corfu.corfu.mapper.store.MessageTypeStore;

import java.io.IOException;

public class AppTelecommandSerializer extends StdSerializer<CorfuAppTelecommand> {

	private final MessageTypeStore store;

	public AppTelecommandSerializer(MessageTypeStore store) {
		this(null, store);
	}

	public AppTelecommandSerializer(Class<CorfuAppTelecommand> targetType, MessageTypeStore store) {
		super(targetType);
		this.store = store;
	}

	@Override
	public void serialize(CorfuAppTelecommand app, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeStartObject();
		gen.writeStringField(CorfuAppTelecommand.IDENTIFIER_PROPERTY, app.name());
		gen.writeObjectField(CorfuAppTelecommand.PAYLOAD_PROPERTY, app.payload());
		gen.writeEndObject();
	}
}
