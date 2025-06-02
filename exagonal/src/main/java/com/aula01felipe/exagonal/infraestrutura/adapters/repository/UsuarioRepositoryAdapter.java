package com.aula01felipe.exagonal.infraestrutura.adapters.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aula01felipe.exagonal.aplicacao.ports.out.UsuarioRepositoryPort;
import com.aula01felipe.exagonal.aplicacao.usecases.convertes.UsuarioConverter;
import com.aula01felipe.exagonal.core.domain.Usuario;
import com.aula01felipe.exagonal.domain.entities.UsuarioEntity;

@Component
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort{
    
    @Autowired
    UsuarioRepository repository;

    @Autowired
    UsuarioConverter converter;

    @Override
    public Usuario create(Usuario usuario) {
       UsuarioEntity entity = converter.toEntity(usuario);
       repository.save(entity);
       return converter.toDomain(entity);
    }
   
}
