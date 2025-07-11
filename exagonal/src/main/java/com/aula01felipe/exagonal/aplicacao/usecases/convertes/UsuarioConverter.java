package com.aula01felipe.exagonal.aplicacao.usecases.convertes;

import org.springframework.stereotype.Component;

import com.aula01felipe.exagonal.aplicacao.usecases.dto.UsuarioDto;
import com.aula01felipe.exagonal.core.domain.Usuario;
import com.aula01felipe.exagonal.domain.entities.UsuarioEntity;

@Component
public class UsuarioConverter {

    public Usuario toDomain(UsuarioDto usuarioDto) {
        return new Usuario(usuarioDto.getId(), usuarioDto.getNome(), usuarioDto.getEmail());
    }

    public Usuario toDomain(UsuarioEntity usuarioEntity) {
        return new Usuario(usuarioEntity.getId(), usuarioEntity.getNome(), usuarioEntity.getEmail());
    }

    public UsuarioDto toDto(Usuario usuario) {
        return new UsuarioDto(usuario.getId(), usuario.getNome(), usuario.getEmail());
    }

    public UsuarioEntity toEntity(Usuario usuario) {
        return new UsuarioEntity(usuario.getId(), usuario.getNome(), usuario.getEmail());
    }

}
