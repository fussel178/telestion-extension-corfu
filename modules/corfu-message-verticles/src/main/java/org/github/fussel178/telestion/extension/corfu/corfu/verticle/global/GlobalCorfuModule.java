package org.github.fussel178.telestion.extension.corfu.corfu.verticle.global;

import io.vertx.core.json.jackson.DatabindCodec;
import org.github.fussel178.telestion.extension.corfu.corfu.mapper.jackson.CorfuModule;

public class GlobalCorfuModule {
	private static final CorfuModule module = new CorfuModule(GlobalStore.store());
	private static boolean isRegistered = false;

	public static CorfuModule module() {
		return module;
	}

	public synchronized static void register() {
		if (isRegistered) return;

		DatabindCodec.mapper().registerModule(module());
		isRegistered = true;
	}

	private GlobalCorfuModule() {
	}
}
