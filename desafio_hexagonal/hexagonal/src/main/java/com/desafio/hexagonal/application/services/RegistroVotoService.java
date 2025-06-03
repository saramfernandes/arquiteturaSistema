package com.desafio.hexagonal.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.hexagonal.application.port.in.RegistroVoto;
import com.desafio.hexagonal.application.port.in.RegistroVotoServicePort;
import com.desafio.hexagonal.application.port.out.RegistroVotoRepositoryPort;

@Service
public class RegistroVotoService implements RegistroVotoServicePort{
    
    @Autowired
    RegistroVotoRepositoryPort registroVotoRepositoryPort;

   @Override
   public RegistroVoto createRegistroVoto(RegistroVoto registroVoto) {
       return registroVotoRepositoryPort.create(registroVoto);
   }
    
}
