package org.github.fussel178.telestion.extension.corfu.corfu.mapper.message;

import de.wuespace.telestion.api.message.JsonMessage;

/**
 * Represents a full Corfu message.
 * Currently, this can be:
 * <ul>
 *     <li>{@link CorfuTelemetry}</li>
 *     <li>{@link CorfuTelecommand}</li>
 * </ul>
 *
 * @author Ludwig Richter (@fussel178)
 */
public interface CorfuMessage extends JsonMessage {
}
