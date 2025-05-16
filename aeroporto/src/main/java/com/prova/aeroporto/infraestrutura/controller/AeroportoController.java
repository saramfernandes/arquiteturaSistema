package com.prova.aeroporto.infraestrutura.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.aeroporto.application.usecases.AeroportoInteractor;

@RestController
@RequestMapping("/aeroporto")
public class AeroportoController {
    
    @Autowired
    AeroportoInteractor interactor;

    @Autowired
    AeroportoDtoMapper mapper;

    @PostMapping("/novo")
    public AeroportoResponse salvar(@RequestBody AeroportoRequest request) {
        return mapper.toResponse(interactor.createAeroporto(mapper.toDomain(request)));
    }

    @GetMapping("/lista")
    public List<AeroportoResponse> lista() {
        List<AeroportoResponse> listas = interactor.listaAeroporto().stream().map(mapper::toResponse).collect(Collectors.toList());
        return listas;
    }


}
