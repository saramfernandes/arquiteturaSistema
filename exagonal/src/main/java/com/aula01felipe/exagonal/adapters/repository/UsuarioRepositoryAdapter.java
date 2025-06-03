package com.aula01felipe.exagonal.adapters.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aula01felipe.exagonal.adapters.convertes.UsuarioConverter;
import com.aula01felipe.exagonal.core.domain.Usuario;
import com.aula01felipe.exagonal.core.ports.out.UsuarioRepositoryPort;

@Component
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    @Autowired
    UsuarioRepository repository;

    @Autowired
    UsuarioConverter converter;

    @Override
    public Usuario create(Usuario usuario) {
        return converter.toDomain(repository.save(converter.toEntity(usuario)));
    }

}
