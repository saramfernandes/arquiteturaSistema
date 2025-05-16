package com.prova.aeroporto.infraestrutura.gateways;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.prova.aeroporto.domain.Aeroporto;
import com.prova.aeroporto.infraestrutura.persistence.AeroportoEntity;

@Component
public class AeroportoMapper {
    
    public AeroportoEntity toEntity(Aeroporto aeroporto) {
        return new AeroportoEntity(aeroporto.nome(), aeroporto.cidade(), aeroporto.estado(), aeroporto.codigoATA(), aeroporto.telefone());
    }

    public Aeroporto toDomain(AeroportoEntity entity) {
        return new Aeroporto(entity.getNome(), entity.getCidade(), entity.getEstado(), entity.getCodigoATA(), entity.getTelefone());
    }

    public List<Aeroporto> toDomainList(List<AeroportoEntity> entityList) {
        return entityList.stream().map(this::toDomain).collect(Collectors.toList());
    }
}
