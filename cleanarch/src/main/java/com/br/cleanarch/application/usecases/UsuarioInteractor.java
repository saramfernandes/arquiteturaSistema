package com.br.cleanarch.application.usecases;

import java.util.List;

import com.br.cleanarch.application.gateways.UsuarioGateway;
import com.br.cleanarch.domain.Usuario;

public class UsuarioInteractor {

    public final UsuarioGateway gateway;

    public UsuarioInteractor(UsuarioGateway gateway) {
        this.gateway = gateway;
    }

    public Usuario createUsuario(Usuario usuario) {
        return gateway.createUsuario(usuario);
    }

    public List<Usuario> listaUsuario() {
        return gateway.listUsuario();
    }

}
