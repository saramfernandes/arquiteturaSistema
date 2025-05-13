package com.revisao.arquiteturalimpa.application.usecases;

import com.revisao.arquiteturalimpa.application.gateways.PessoaGateway;
import com.revisao.arquiteturalimpa.domain.Pessoa;

public class PessoaInteractor {
    
    public final PessoaGateway gateway;

    public PessoaInteractor(PessoaGateway gateway) {
        this.gateway = gateway;
    }

    public Pessoa createPessoa(Pessoa pessoa) {
        return gateway.createPessoa(pessoa);
    }

}
