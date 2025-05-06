package com.br.cleanarch.infraestrutura.gateways;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.br.cleanarch.domain.Usuario;
import com.br.cleanarch.infraestrutura.persistence.UsuarioEntity;

@Component
public class UsuarioMapper {

    public UsuarioEntity toEntity(Usuario usuario) {
        return new UsuarioEntity(usuario.username(), usuario.password(), usuario.email());
    }

    public Usuario toDomain(UsuarioEntity usuarioEntity) {
        return new Usuario(usuarioEntity.getUsername(), usuarioEntity.getPassword(), usuarioEntity.getEmail());
    }

    public  List<Usuario> toDomainList(List<UsuarioEntity> entityList) {
        return entityList.stream().map(this::toDomain).collect(Collectors.toList());
    }

}
