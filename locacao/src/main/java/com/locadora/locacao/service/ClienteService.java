package com.locadora.locacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.locadora.locacao.entities.Cliente;
import com.locadora.locacao.repository.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    ClienteRepository repository;
    
    public ResponseEntity<String> cadastroCliente(Cliente cliente) {
        repository.save(cliente);
        return new ResponseEntity<>("Cadastrado com Sucesso", HttpStatus.OK);
    }
    
    public ResponseEntity<List<Cliente>> listaCliente() {
        List<Cliente> clienteListado = repository.findAll();
        return new ResponseEntity<>(clienteListado, HttpStatus.OK);
    }
}
