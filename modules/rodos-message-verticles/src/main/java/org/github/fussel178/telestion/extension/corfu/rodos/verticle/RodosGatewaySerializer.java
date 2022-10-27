package org.github.fussel178.telestion.extension.corfu.rodos.verticle;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.wuespace.telestion.api.verticle.trait.WithEventBus;
import de.wuespace.telestion.services.connection.rework.RawMessage;
import org.github.fussel178.telestion.extension.corfu.rodos.mapper.exception.RodosException;
import org.github.fussel178.telestion.extension.corfu.rodos.mapper.message.RodosNetworkMessage;

@SuppressWarnings("unused")
public class RodosGatewaySerializer extends NetworkMessageMapperVerticle<RodosGatewaySerializer.Configuration>
		implements WithEventBus {

	public record Configuration(
			@JsonProperty String inAddress,
			@JsonProperty String outAddress,
			@JsonProperty String endianness
	) implements NetworkMessageMapperConfiguration {
		public Configuration() {
			this(null, null, "big");
		}
	}

	@Override
	public void onStart() throws IllegalArgumentException {
		super.onStart();
		register(getConfig().inAddress, this::handle, RodosNetworkMessage.class);
		logger.info("Ready for serialization");
	}

	public void handle(RodosNetworkMessage message) {
		logger.debug("Serialize new network message");
		try {
			byte[] data = mapper.serialize(message);
			publish(getConfig().outAddress, new RawMessage(data));
		} catch (RodosException e) {
			// TODO: Add counters and status address
			logger.error(e.getMessage());
		}
	}
}
