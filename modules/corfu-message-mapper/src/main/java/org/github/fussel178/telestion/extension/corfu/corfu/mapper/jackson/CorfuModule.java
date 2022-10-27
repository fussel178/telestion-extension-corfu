package org.github.fussel178.telestion.extension.corfu.corfu.mapper.jackson;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.github.fussel178.telestion.extension.corfu.corfu.mapper.message.CorfuAppTelecommand;
import org.github.fussel178.telestion.extension.corfu.corfu.mapper.message.CorfuAppTelemetry;
import org.github.fussel178.telestion.extension.corfu.corfu.mapper.message.CorfuNode;
import org.github.fussel178.telestion.extension.corfu.corfu.mapper.store.MessageTypeStore;

import java.util.BitSet;

public class CorfuModule extends SimpleModule {
	public CorfuModule(MessageTypeStore store) {
		// utility types
		addSerializer(BitSet.class, new BitSetSerializer());
		addDeserializer(BitSet.class, new BitSetDeserializer());
		// node
		addSerializer(CorfuNode.class, new NodeSerializer(store));
		addDeserializer(CorfuNode.class, new NodeDeserializer(store));
		// app telemetry
		addSerializer(CorfuAppTelemetry.class, new AppTelemetrySerializer(store));
		addDeserializer(CorfuAppTelemetry.class, new AppTelemetryDeserializer(store));
		// app telecommand
		addSerializer(CorfuAppTelecommand.class, new AppTelecommandSerializer(store));
		addDeserializer(CorfuAppTelecommand.class, new AppTelecommandDeserializer(store));
	}
}
