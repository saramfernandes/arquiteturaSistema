package com.locadora.locacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locadora.locacao.entities.Cliente;
import com.locadora.locacao.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    ClienteService service;

    @PostMapping("/novo")
    public ResponseEntity<String> cadastraProduto(@RequestBody Cliente cliente) {
        return service.cadastroCliente(cliente);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Cliente>> listagemCliente() {
        return service.listaCliente();
    }
}
