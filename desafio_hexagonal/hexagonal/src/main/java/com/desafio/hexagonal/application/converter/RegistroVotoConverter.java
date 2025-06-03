package com.desafio.hexagonal.application.converter;

import org.springframework.stereotype.Component;

import com.desafio.hexagonal.application.dto.RegistroVotoDto;
import com.desafio.hexagonal.domain.model.RegistroVoto;
import com.desafio.hexagonal.infraestrutura.persistence.entity.RegistroVotoEntity;

@Component
public class RegistroVotoConverter {
    
    public RegistroVoto toDomain(RegistroVotoDto registroVotoDto) {
        return new RegistroVoto(registroVotoDto.getId(), registroVotoDto.getUsuarioId(), registroVotoDto.getEnqueteId(), registroVotoDto.getTipoVoto());
    }

    public RegistroVoto toDomain(RegistroVotoEntity registroVotoEntity) {
        return new RegistroVoto(registroVotoEntity.getId(), registroVotoEntity.getUsuarioId(), registroVotoEntity.getEnqueteId(), registroVotoEntity.getTipoVoto());
    }

    public RegistroVotoDto toDto(RegistroVoto registroVoto) {
        return new RegistroVotoDto(registroVoto.getId(), registroVoto.getUsuarioId(), registroVoto.getEnqueteId(), registroVoto.getTipoVoto());
    }

    public RegistroVotoEntity toEntity(RegistroVoto registroVoto) {
        return new RegistroVotoEntity(registroVoto.getId(), registroVoto.getUsuarioId(), registroVoto.getEnqueteId(), registroVoto.getTipoVoto());
    }

}
