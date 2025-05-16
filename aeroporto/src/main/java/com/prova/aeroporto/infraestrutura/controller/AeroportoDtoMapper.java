package com.prova.aeroporto.infraestrutura.controller;

import org.springframework.stereotype.Component;

import com.prova.aeroporto.domain.Aeroporto;

@Component
public class AeroportoDtoMapper {
    
    public Aeroporto toDomain(AeroportoRequest request) {
        return new Aeroporto(request.nome(), request.cidade(), request.estado(), request.codigoATA(), request.telefone());
    }

    public AeroportoResponse toResponse(Aeroporto aeroporto) {
        return new AeroportoResponse(aeroporto.nome(), aeroporto.telefone());
    }
}
