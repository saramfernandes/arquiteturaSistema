package com.br.cleanarch.infraestrutura.controller;

import org.springframework.stereotype.Component;

import com.br.cleanarch.domain.Usuario;

@Component
public class UsuarioDtoMapper {
    
    public Usuario toDomain(UsuarioRequest request) {
        return new Usuario(request.username(), request.password(), request.email());
    }

    public UsuarioResponse toResponse(Usuario usuario) {
        return new UsuarioResponse(usuario.username(), usuario.email());
    }
}
