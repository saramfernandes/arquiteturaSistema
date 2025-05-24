package com.aula01felipe.exagonal.core.ports.out;

import com.aula01felipe.exagonal.core.domain.Usuario;

public interface UsuarioRepositoryPort {

    public Usuario create(Usuario usuario);
    
}
