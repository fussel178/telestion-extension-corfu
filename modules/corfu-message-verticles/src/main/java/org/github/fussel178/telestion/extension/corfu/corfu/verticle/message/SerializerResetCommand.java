package org.github.fussel178.telestion.extension.corfu.corfu.verticle.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SerializerResetCommand() implements SerializerCommand {
}
