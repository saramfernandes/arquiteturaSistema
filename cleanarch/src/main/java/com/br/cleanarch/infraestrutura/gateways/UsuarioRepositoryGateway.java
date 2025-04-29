package com.br.cleanarch.infraestrutura.gateways;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.cleanarch.application.gateways.UsuarioGateway;
import com.br.cleanarch.domain.Usuario;
import com.br.cleanarch.infraestrutura.persistence.UsuarioRepository;

public class UsuarioRepositoryGateway implements UsuarioGateway {

    @Autowired
    UsuarioRepository repository;

    @Autowired
    UsuarioMapper mapper;

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return mapper.toDomain(repository.save(mapper.toEntity(usuario)));
    }

}
