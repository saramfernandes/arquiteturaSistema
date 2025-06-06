package com.desafio.hexagonal.infraestrutura.web;

import com.desafio.hexagonal.domain.exception.VotoDuplicadoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(VotoDuplicadoException.class)
    public ResponseEntity<String> handleVotoDuplicadoException(VotoDuplicadoException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }
}
