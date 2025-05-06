package com.br.cleanarch.main;
import com.br.cleanarch.infraestrutura.gateways.UsuarioMapper;
import com.br.cleanarch.infraestrutura.gateways.UsuarioRepositoryGateway;
import com.br.cleanarch.infraestrutura.persistence.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.br.cleanarch.application.gateways.UsuarioGateway;
import com.br.cleanarch.application.usecases.UsuarioInteractor;

@Configuration
public class Config {

    @Bean
    UsuarioInteractor usuarioInteractor(UsuarioGateway usuarioGateway) {
        return new UsuarioInteractor(usuarioGateway);
    }

    @Bean
    UsuarioGateway usuarioGateway(UsuarioRepository usuarioRepository, UsuarioMapper usuarioMapper) {
        return new UsuarioRepositoryGateway(usuarioRepository, usuarioMapper);
    }

}
