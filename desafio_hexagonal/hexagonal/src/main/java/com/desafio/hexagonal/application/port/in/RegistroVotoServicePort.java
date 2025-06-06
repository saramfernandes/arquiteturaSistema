package com.desafio.hexagonal.application.port.in;

import com.desafio.hexagonal.domain.model.RegistroVoto;

public interface RegistroVotoServicePort {
    RegistroVoto createRegistroVoto(RegistroVoto registroVoto);
}
