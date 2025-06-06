package com.desafio.hexagonal.infraestrutura.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.desafio.hexagonal.application.port.in.RegistroVotoServicePort;
import com.desafio.hexagonal.application.port.out.RegistroVotoRepositoryPort;
import com.desafio.hexagonal.application.services.RegistroVotoService;
import com.desafio.hexagonal.infraestrutura.persistence.adapter.RegistroVotoRepositoryAdapter;
import com.desafio.hexagonal.application.converter.RegistroVotoConverter;
import com.desafio.hexagonal.infraestrutura.persistence.repository.RegistroVotoRepository;

@Configuration
public class BeansConfig {
    @Bean
    public RegistroVotoRepositoryPort registroVotoRepositoryPort(RegistroVotoRepository registroVotoRepository,
            RegistroVotoConverter registroVotoConverter) {
        return new RegistroVotoRepositoryAdapter(registroVotoRepository, registroVotoConverter);
    }

    @Bean
    public RegistroVotoServicePort registroVotoServicePort(RegistroVotoRepositoryPort registroVotoRepositoryPort) {
        return new RegistroVotoService(registroVotoRepositoryPort);
    }
}
