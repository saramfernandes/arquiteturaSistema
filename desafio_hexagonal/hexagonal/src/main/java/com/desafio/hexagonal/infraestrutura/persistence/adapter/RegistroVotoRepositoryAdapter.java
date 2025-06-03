package com.desafio.hexagonal.infraestrutura.persistence.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.desafio.hexagonal.application.converter.RegistroVotoConverter;
import com.desafio.hexagonal.application.port.in.RegistroVoto;
import com.desafio.hexagonal.infraestrutura.persistence.repository.RegistroVotoRepository;

@Component
public class RegistroVotoRepositoryAdapter {
    
    @Autowired
    RegistroVotoRepository registroVotoRepository;

    @Autowired
    RegistroVotoConverter registroVotoConverter;

    public RegistroVoto create(RegistroVoto registroVoto) {
        var entity = registroVotoConverter.toEntity(registroVoto);
        registroVotoRepository.save(entity);
        return registroVotoConverter.toDomain(entity);
    }

}
