package org.github.fussel178.telestion.extension.corfu.corfu.mapper.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.github.fussel178.telestion.extension.corfu.corfu.mapper.message.CorfuAppTelemetry;
import org.github.fussel178.telestion.extension.corfu.corfu.mapper.store.MessageTypeStore;

import java.io.IOException;

public class AppTelemetrySerializer extends StdSerializer<CorfuAppTelemetry> {

	private final MessageTypeStore store;

	public AppTelemetrySerializer(MessageTypeStore store) {
		this(null, store);
	}

	public AppTelemetrySerializer(Class<CorfuAppTelemetry> targetType, MessageTypeStore store) {
		super(targetType);
		this.store = store;
	}

	@Override
	public void serialize(CorfuAppTelemetry app, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeStartObject();
		gen.writeStringField(CorfuAppTelemetry.IDENTIFIER_PROPERTY, app.name());
		gen.writeObjectField(CorfuAppTelemetry.PAYLOAD_PROPERTY, app.payload());
		gen.writeEndObject();
	}
}
