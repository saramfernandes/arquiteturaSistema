package com.prova.aeroporto.application.usecases;

import java.util.List;

import com.prova.aeroporto.application.gateways.AeroportoGateway;
import com.prova.aeroporto.domain.Aeroporto;

public class AeroportoInteractor {
    
    public final AeroportoGateway gateway;

    public AeroportoInteractor(AeroportoGateway gateway) {
        this.gateway = gateway;
    }

    public Aeroporto createAeroporto(Aeroporto aeroporto) {
        return gateway.createAeroporto(aeroporto);
    }

    public List<Aeroporto> listaAeroporto() {
        return gateway.listAeroporto();
    }
}
