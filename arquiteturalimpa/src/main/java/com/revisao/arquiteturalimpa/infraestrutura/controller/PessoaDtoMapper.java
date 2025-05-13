package com.revisao.arquiteturalimpa.infraestrutura.controller;

import org.springframework.stereotype.Component;

import com.revisao.arquiteturalimpa.domain.Pessoa;

@Component
public class PessoaDtoMapper {

    public Pessoa toDomain(PessoaRequest request) {
        return new Pessoa(request.nome(), request.username(), request.email(), request.password());
    }

    public PessoaResponse toResponse(Pessoa pessoa) {
        return new PessoaResponse(pessoa.nome(), pessoa.username());
    }
}
