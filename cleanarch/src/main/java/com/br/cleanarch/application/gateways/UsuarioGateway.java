package com.br.cleanarch.application.gateways;

import java.util.List;

import com.br.cleanarch.domain.Usuario;

public interface UsuarioGateway {

    Usuario createUsuario(Usuario usuario);
    List<Usuario> listUsuario();

}
