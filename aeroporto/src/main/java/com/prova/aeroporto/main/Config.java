package com.prova.aeroporto.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.prova.aeroporto.application.gateways.AeroportoGateway;
import com.prova.aeroporto.application.usecases.AeroportoInteractor;
import com.prova.aeroporto.infraestrutura.gateways.AeroportoMapper;
import com.prova.aeroporto.infraestrutura.gateways.AeroportoRepositoryGateway;
import com.prova.aeroporto.infraestrutura.persistence.AeroportoRepository;

@Configuration
public class Config {

    @Bean
    AeroportoInteractor aeroportoInteractor(AeroportoGateway aeroportoGateway) {
        return new AeroportoInteractor(aeroportoGateway);
    }

    @Bean
    AeroportoGateway aeroportoGateway(AeroportoRepository aeroportoRepository, AeroportoMapper aeroportoMapper) {
        return new AeroportoRepositoryGateway(aeroportoRepository, aeroportoMapper);
    }
}
