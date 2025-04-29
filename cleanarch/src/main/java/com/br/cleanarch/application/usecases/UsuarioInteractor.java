package com.br.cleanarch.application.usecases;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.cleanarch.application.gateways.UsuarioGateway;
import com.br.cleanarch.domain.Usuario;

public class UsuarioInteractor {
    
    @Autowired
    UsuarioGateway gateway;

    public Usuario createUsuario(Usuario usuario) {
        return gateway.createUsuario(usuario);
    }

}
