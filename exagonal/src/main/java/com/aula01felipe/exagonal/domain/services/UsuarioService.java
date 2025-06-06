package com.aula01felipe.exagonal.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula01felipe.exagonal.aplicacao.ports.in.UsuarioServicePort;
import com.aula01felipe.exagonal.core.domain.Usuario;
import com.aula01felipe.exagonal.core.ports.in.UsuarioServicePort;
import com.aula01felipe.exagonal.core.ports.out.UsuarioRepositoryPort;

@Service
public class UsuarioService implements UsuarioServicePort {

    @Autowired
    UsuarioRepositoryPort usuarioRepositoryPort;

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepositoryPort.create(usuario);
    }

}
