package com.revisao.arquiteturalimpa.infraestrutura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revisao.arquiteturalimpa.application.usecases.PessoaInteractor;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    PessoaInteractor interactor;

    @Autowired
    PessoaDtoMapper mapper;

    @PostMapping("/novo")
    public PessoaResponse salvar(@RequestBody PessoaRequest request) {
        return mapper.toResponse(interactor.createPessoa(mapper.toDomain(request)));
    }

}
