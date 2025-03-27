package com.empresa.setorproduto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.empresa.setorproduto.entities.Setor;
import com.empresa.setorproduto.repository.SetorRepository;

@Service
public class SetorService {

    @Autowired
    SetorRepository repository;

    public ResponseEntity<String> cadastroSetor(Setor setor) {
        repository.save(setor);
        return new ResponseEntity<>("Cadastrado com Sucesso", HttpStatus.OK);
    }

    public ResponseEntity<List<Setor>> listaSetor() {
        List<Setor> setorListado = repository.findAll();
        return new ResponseEntity<>(setorListado, HttpStatus.OK);
    }
}
