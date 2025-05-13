package com.revisao.arquiteturalimpa.infraestrutura.gateways;

import org.springframework.stereotype.Component;

import com.revisao.arquiteturalimpa.domain.Pessoa;
import com.revisao.arquiteturalimpa.infraestrutura.persistence.PessoaEntity;

@Component
public class PessoaMapper {
    
    public PessoaEntity toEntity(Pessoa pessoa){
        return new PessoaEntity(pessoa.nome(), pessoa.username(), pessoa.email(), pessoa.password());
    }

    public Pessoa toDomain(PessoaEntity entity) {
        return new Pessoa(entity.getNome(), entity.getUsername(), entity.getEmail(), entity.getPassword());
    }

}
