package com.aula01felipe.exagonal.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula01felipe.exagonal.aplicacao.ports.in.UsuarioServicePort;
import com.aula01felipe.exagonal.core.domain.Usuario;

@Service
public class UsuarioService implements UsuarioServicePort{

    @Autowired
    UsuarioServicePort repositoryPort;

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuario;
    }
    
}
