package com.prova.paciente.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.paciente.hospital.entities.Paciente;
import com.prova.paciente.hospital.service.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteService service;

    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastraPaciente(@RequestBody Paciente paciente) {
        return service.cadastroPaciente(paciente);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Paciente>> listagemPaciente() {
        return service.listaPaciente();
    }
}
