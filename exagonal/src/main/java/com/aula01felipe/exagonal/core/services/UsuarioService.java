package com.aula01felipe.exagonal.core.services;

import org.springframework.stereotype.Service;

import com.aula01felipe.exagonal.core.domain.Usuario;
import com.aula01felipe.exagonal.core.ports.in.UsuarioServicePort;

@Service
public class UsuarioService implements UsuarioServicePort{
    
    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuario;
    }
}
