package com.prova.paciente.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prova.paciente.hospital.entities.Paciente;
import com.prova.paciente.hospital.repository.PacienteRepository;

@Service
public class PacienteService {
    
    @Autowired
    PacienteRepository repository;

    public ResponseEntity<String> cadastroPaciente(Paciente paciente) {
        repository.save(paciente);
        return new ResponseEntity<>("Paciente cadastrado.", HttpStatus.OK);
    }

    public ResponseEntity<List<Paciente>> listaPaciente() {
        List<Paciente> pacienteListado = repository.findAll();
        return new ResponseEntity<>(pacienteListado,HttpStatus.OK);
    }
}
