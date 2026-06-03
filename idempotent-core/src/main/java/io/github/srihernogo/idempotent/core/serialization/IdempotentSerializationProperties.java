package io.github.srihernogo.idempotent.core.serialization;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/** Serialization settings shared by persistent idempotent stores. */
@ConfigurationProperties(prefix = "idempotent.serialization")
public record IdempotentSerializationProperties(
        @DefaultValue("JSON") Strategy strategy) {

    public enum Strategy {
        JSON,
        JAVA
    }
}
