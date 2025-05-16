package com.prova.aeroporto.application.gateways;

import java.util.List;

import com.prova.aeroporto.domain.Aeroporto;

public interface AeroportoGateway {
    
    Aeroporto createAeroporto(Aeroporto aeroporto);
    List<Aeroporto> listAeroporto();
}
