package com.revisao.arquiteturalimpa.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revisao.arquiteturalimpa.application.gateways.PessoaGateway;
import com.revisao.arquiteturalimpa.application.usecases.PessoaInteractor;
import com.revisao.arquiteturalimpa.infraestrutura.gateways.PessoaMapper;
import com.revisao.arquiteturalimpa.infraestrutura.gateways.PessoaRepositoryGateway;
import com.revisao.arquiteturalimpa.infraestrutura.persistence.PessoaRepository;

@Configuration
public class Config {

    @Bean
    PessoaInteractor pessoaInteractor(PessoaGateway pessoaGateway) {
        return new PessoaInteractor(pessoaGateway);
    }

    @Bean
    PessoaGateway pessoaGateway(PessoaRepository pessoaRepository, PessoaMapper pessoaMapper) {
        return new PessoaRepositoryGateway(pessoaRepository, pessoaMapper);
    }
}
