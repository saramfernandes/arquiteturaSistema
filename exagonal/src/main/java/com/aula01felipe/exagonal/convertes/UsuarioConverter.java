package com.aula01felipe.exagonal.convertes;

import org.springframework.stereotype.Component;

import com.aula01felipe.exagonal.adapters.dto.UsuarioDto;
import com.aula01felipe.exagonal.core.domain.Usuario;

@Component
public class UsuarioConverter {

    public Usuario toDomain(UsuarioDto usuarioDto) {
        return new Usuario(usuarioDto.getId(), usuarioDto.getNome(), usuarioDto.getEmail());
    }

    public UsuarioDto toDto(Usuario usuario) {
        return new UsuarioDto(usuario.getId(), usuario.getNome(), usuario.getEmail());
    }

}
