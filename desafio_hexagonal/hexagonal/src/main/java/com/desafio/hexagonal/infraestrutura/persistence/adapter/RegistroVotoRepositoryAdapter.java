package com.desafio.hexagonal.infraestrutura.persistence.adapter;

import com.desafio.hexagonal.application.converter.RegistroVotoConverter;
import com.desafio.hexagonal.domain.model.RegistroVoto;
import com.desafio.hexagonal.application.port.out.RegistroVotoRepositoryPort;
import com.desafio.hexagonal.infraestrutura.persistence.repository.RegistroVotoRepository;

public class RegistroVotoRepositoryAdapter implements RegistroVotoRepositoryPort {

    private final RegistroVotoRepository registroVotoRepository;
    private final RegistroVotoConverter registroVotoConverter;

    public RegistroVotoRepositoryAdapter(RegistroVotoRepository registroVotoRepository,
            RegistroVotoConverter registroVotoConverter) {
        this.registroVotoRepository = registroVotoRepository;
        this.registroVotoConverter = registroVotoConverter;
    }

    public RegistroVoto create(RegistroVoto registroVoto) {
        var entity = registroVotoConverter.toEntity(registroVoto);
        registroVotoRepository.save(entity);
        return registroVotoConverter.toDomain(entity);
    }

    public boolean existsByUsuarioIdAndEnqueteId(String usuarioId, String enqueteId) {
        return registroVotoRepository.existsByUsuarioIdAndEnqueteId(usuarioId, enqueteId);
    }

}
