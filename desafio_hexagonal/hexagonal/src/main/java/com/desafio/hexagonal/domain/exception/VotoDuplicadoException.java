package com.desafio.hexagonal.domain.exception;

public class VotoDuplicadoException extends RuntimeException {
    public VotoDuplicadoException(String message) {
        super(message);
    }
}
