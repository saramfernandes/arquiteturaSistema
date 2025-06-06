package com.desafio.hexagonal.application.services;

import org.springframework.stereotype.Service;

import com.desafio.hexagonal.domain.model.RegistroVoto;
import com.desafio.hexagonal.application.port.in.RegistroVotoServicePort;
import com.desafio.hexagonal.application.port.out.RegistroVotoRepositoryPort;
import com.desafio.hexagonal.domain.exception.VotoDuplicadoException;

@Service
public class RegistroVotoService implements RegistroVotoServicePort {

    private final RegistroVotoRepositoryPort registroVotoRepositoryPort;

    public RegistroVotoService(RegistroVotoRepositoryPort registroVotoRepositoryPort) {
        this.registroVotoRepositoryPort = registroVotoRepositoryPort;
    }

    @Override
    public RegistroVoto createRegistroVoto(RegistroVoto registroVoto) {
        String usuarioId = registroVoto.getUsuarioId();
        String enqueteId = registroVoto.getEnqueteId();
        boolean jaVotou = registroVotoRepositoryPort.existsByUsuarioIdAndEnqueteId(usuarioId, enqueteId);
        if (jaVotou) {
            throw new VotoDuplicadoException("Usuário já votou nesta enquete.");
        }
        return registroVotoRepositoryPort.create(registroVoto);
    }

}
