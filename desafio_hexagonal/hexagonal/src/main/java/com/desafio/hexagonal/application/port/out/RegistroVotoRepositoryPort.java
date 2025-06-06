package com.desafio.hexagonal.application.port.out;

import com.desafio.hexagonal.domain.model.RegistroVoto;

public interface RegistroVotoRepositoryPort {
    public RegistroVoto create(RegistroVoto registroVoto);

    boolean existsByUsuarioIdAndEnqueteId(String usuarioId, String enqueteId);
}
