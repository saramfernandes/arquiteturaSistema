package com.prova.aeroporto.infraestrutura.gateways;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prova.aeroporto.application.gateways.AeroportoGateway;
import com.prova.aeroporto.domain.Aeroporto;
import com.prova.aeroporto.infraestrutura.persistence.AeroportoRepository;

public class AeroportoRepositoryGateway implements AeroportoGateway {

    @Autowired
    AeroportoRepository repository;

    @Autowired
    AeroportoMapper mapper;
    
    public AeroportoRepositoryGateway(AeroportoRepository repository, AeroportoMapper aeroportoMapper) {

    }

    @Override
    public Aeroporto createAeroporto(Aeroporto aeroporto) {
        return mapper.toDomain(repository.save(mapper.toEntity(aeroporto)));
    }

    @Override
    public List<Aeroporto> listAeroporto() {
        return mapper.toDomainList(repository.findAll());
    }
}
