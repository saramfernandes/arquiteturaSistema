package com.api.aula01api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.aula01api.entities.Pessoa;
import com.api.aula01api.repository.PessoaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    PessoaRepository repository;

    @GetMapping("/teste")
    public ResponseEntity<String> teste() {
        return new ResponseEntity<>("Resposta API", HttpStatus.OK);
    }

    @PostMapping("/novo")
    public ResponseEntity<String> cadastro(@RequestBody Pessoa pessoa) {
        repository.save(pessoa);
        return new ResponseEntity<>("Cadastrado com sucesso!", HttpStatus.OK);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Pessoa>> lista() {
        List<Pessoa> pessoaListada = repository.findAll();
        return new ResponseEntity<>(pessoaListada, HttpStatus.OK);
    }

}
