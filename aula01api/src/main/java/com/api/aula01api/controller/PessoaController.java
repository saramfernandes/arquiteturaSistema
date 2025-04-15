package com.api.aula01api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.aula01api.dto.PessoaDto;
import com.api.aula01api.entities.Pessoa;
import com.api.aula01api.service.PessoaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    PessoaService service;

    @GetMapping("/teste")
    public ResponseEntity<String> teste() {
        return new ResponseEntity<>("Resposta API", HttpStatus.OK);
    }

    @PostMapping("/novo")
    public ResponseEntity<String> cadastro(@RequestBody Pessoa pessoa) {
        // repository.save(pessoa);
        // return new ResponseEntity<>("Cadastrado com sucesso!", HttpStatus.OK);
        return service.cadastro(pessoa);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<PessoaDto>> listagem() {
        return service.lista();
    }

    @GetMapping("/busca/{id}")
    public ResponseEntity<PessoaDto> buscaPorId(@PathVariable("id") int id) {
        return service.buscaPorId(id);
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<String> excluir(@PathVariable("id") int id) {
        return service.excluir(id);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editar(@RequestBody Pessoa pessoa, @PathVariable("id") int id) {
        return service.editar(pessoa, id);
    }
}
