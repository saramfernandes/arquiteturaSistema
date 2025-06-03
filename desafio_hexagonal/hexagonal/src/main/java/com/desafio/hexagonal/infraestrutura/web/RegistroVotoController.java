package com.desafio.hexagonal.infraestrutura.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.hexagonal.application.converter.RegistroVotoConverter;
import com.desafio.hexagonal.application.dto.RegistroVotoDto;
import com.desafio.hexagonal.application.port.in.RegistroVotoServicePort;

@RestController
@RequestMapping("/registrovoto")
public class RegistroVotoController {
    
    @Autowired
    RegistroVotoServicePort registroVotoServicePort;

    @Autowired
    RegistroVotoConverter registroVotoConverter;

    @PostMapping
    public RegistroVotoDto create(@RequestBody RegistroVotoDto registroVotoDto) {
        return registroVotoConverter.toDto(registroVotoServicePort.createRegistroVoto(registroVotoConverter.toDomain(registroVotoDto)));
    }

}
