package com.br.cleanarch.infraestrutura.gateways;

import com.br.cleanarch.domain.Usuario;
import com.br.cleanarch.infraestrutura.persistence.UsuarioEntity;

public class UsuarioMapper {

    public UsuarioEntity toEntity(Usuario usuario) {
        return new UsuarioEntity(usuario.username(), usuario.password(), usuario.email());
    }

    public Usuario toDomain(UsuarioEntity usuarioEntity) {
        return new Usuario(usuarioEntity.getUsername(), usuarioEntity.getPassword(), usuarioEntity.getEmail());
    }

}
