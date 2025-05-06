package com.br.cleanarch.infraestrutura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cleanarch.application.usecases.UsuarioInteractor;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioInteractor interactor;

    @Autowired
    UsuarioDtoMapper mapper;

    @PostMapping("/novo")
    public UsuarioResponse salvar(@RequestBody UsuarioRequest request) {
        return mapper.toResponse(interactor.createUsuario(mapper.toDomain(request)));
    }

}
