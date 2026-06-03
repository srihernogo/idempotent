package io.github.srihernogo.idempotent.core;

class NotFoundException extends RuntimeException {
    final String id;

    NotFoundException(String message, String id) {
        super(message);
        this.id = id;
    }
}
