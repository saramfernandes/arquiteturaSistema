package com.api.aula01api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.api.aula01api.converters.PessoaConverter;
import com.api.aula01api.dto.PessoaDto;
import com.api.aula01api.entities.Pessoa;
import com.api.aula01api.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository repository;
    
    @Autowired
    PessoaConverter converter;

    public ResponseEntity<String> cadastro(Pessoa pessoa) {
        repository.save(pessoa);
        return new ResponseEntity<>("Cadastrado com Sucesso", HttpStatus.OK);
    }

    public ResponseEntity<List<PessoaDto>> lista() {
        List<Pessoa> pessoaListada = repository.findAll();
        return new ResponseEntity<>(converter.toDto(pessoaListada), HttpStatus.OK);
    }

    public ResponseEntity<PessoaDto> buscaPorId(@PathVariable("id") int id) {
        Pessoa pessoa = new Pessoa();
        pessoa = repository.findById(id).orElse(null);
        return new ResponseEntity<>(converter.toDto(pessoa), HttpStatus.OK);
    }
}
