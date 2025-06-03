package com.desafio.hexagonal.infraestrutura.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.desafio.hexagonal.application.port.in.RegistroVotoServicePort;
import com.desafio.hexagonal.application.services.RegistroVotoService;

@Configurable
public class BeansConfig {
    
    @Bean
    RegistroVotoServicePort registroVotoServicePortImpl(){
        return new RegistroVotoService();
    }

}
