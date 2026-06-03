package io.github.srihernogo.idempotent.core.serialization;

import io.github.srihernogo.idempotent.core.exception.IdempotentException;

/**
 * Runtime exception thrown when payload serialization/deserialization fails.
 */
public final class IdempotentPayloadCodecException extends IdempotentException {

    public IdempotentPayloadCodecException(String message, Throwable cause) {
        super(message, cause);
    }
}
