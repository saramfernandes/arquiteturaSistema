package com.aula01felipe.exagonal.infraestrutura;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.aula01felipe.exagonal.core.ports.in.UsuarioServicePort;
import com.aula01felipe.exagonal.core.services.UsuarioService;

@Configurable
public class BeansConfig {

    @Bean
    UsuarioServicePort usuarioServicePortImpl() {
        return new UsuarioService();
    }

}
