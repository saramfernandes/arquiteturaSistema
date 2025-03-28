package com.locadora.locacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.locadora.locacao.entities.Veiculo;
import com.locadora.locacao.repository.VeiculoRepository;

@Service
public class VeiculoService {
    
    @Autowired
    VeiculoRepository repository;

    public ResponseEntity<String> cadastroVeiculo(Veiculo veiculo) {
        repository.save(veiculo);
        return new ResponseEntity<>("Cadatrado com Sucesso", HttpStatus.OK);
    }

    public ResponseEntity<List<Veiculo>> listaVeiculo() {
        List<Veiculo> veiculoListado = repository.findAll();
        return new ResponseEntity<>(veiculoListado, HttpStatus.OK);
    }
}
