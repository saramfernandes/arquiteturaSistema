package com.locadora.locacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locadora.locacao.entities.Veiculo;
import com.locadora.locacao.service.VeiculoService;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    VeiculoService service;

    @PostMapping("/novo")
    public ResponseEntity<String> cadastraVeiculo(@RequestBody Veiculo veiculo) {
        return service.cadastroVeiculo(veiculo);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Veiculo>> listagemVeiculo() {
        return service.listaVeiculo();
    }
}
