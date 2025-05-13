package com.revisao.arquiteturalimpa.infraestrutura.gateways;

import org.springframework.beans.factory.annotation.Autowired;

import com.revisao.arquiteturalimpa.application.gateways.PessoaGateway;
import com.revisao.arquiteturalimpa.domain.Pessoa;
import com.revisao.arquiteturalimpa.infraestrutura.persistence.PessoaRepository;

public class PessoaRepositoryGateway implements PessoaGateway {

    @Autowired
    PessoaRepository repository;

    @Autowired
    PessoaMapper mapper;

    public PessoaRepositoryGateway(PessoaRepository repository, PessoaMapper pessoaMapper) {

    }

    @Override
    public Pessoa createPessoa(Pessoa pessoa) {
        return mapper.toDomain(repository.save(mapper.toEntity(pessoa)));
    }

}
