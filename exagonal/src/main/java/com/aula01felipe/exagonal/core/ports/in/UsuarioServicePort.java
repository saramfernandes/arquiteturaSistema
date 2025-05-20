package com.aula01felipe.exagonal.core.ports.in;

import com.aula01felipe.exagonal.core.domain.Usuario;

public interface UsuarioServicePort {
    
    Usuario createUsuario(Usuario usuario);
    
}
