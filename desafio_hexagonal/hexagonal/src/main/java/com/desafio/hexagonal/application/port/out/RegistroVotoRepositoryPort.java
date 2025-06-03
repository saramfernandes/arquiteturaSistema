package com.desafio.hexagonal.application.port.out;

import com.desafio.hexagonal.application.port.in.RegistroVoto;

public interface RegistroVotoRepositoryPort {
    
    public RegistroVoto create(RegistroVoto registroVoto);
}
