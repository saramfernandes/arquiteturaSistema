package com.aula01felipe.exagonal.adapters.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula01felipe.exagonal.adapters.convertes.UsuarioConverter;
import com.aula01felipe.exagonal.adapters.dto.UsuarioDto;
import com.aula01felipe.exagonal.core.ports.in.UsuarioServicePort;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioServicePort usuarioServicePort;

    @Autowired
    UsuarioConverter converter;

    @PostMapping("/salvar")
    public UsuarioDto create(@RequestBody UsuarioDto usuarioDto) {
        return converter.toDto(usuarioServicePort.createUsuario(converter.toDomain(usuarioDto)));
    }

}
