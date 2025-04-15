package com.api.aula01api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
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

    public ResponseEntity<PessoaDto> buscaPorId(int id) {
        Optional<Pessoa> pessoaOptional = repository.findById(id);

        if (pessoaOptional.isPresent()) {
            Pessoa pessoa = pessoaOptional.get();
            return new ResponseEntity<>(converter.toDto(pessoa), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<String> excluir(int id) {
        repository.deleteById(id);
        return new ResponseEntity<>("Excluido com Sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> editar(Pessoa pessoa, int id) {
        Pessoa p = repository.findById(id).orElse(null);
        p = new Pessoa(id, pessoa.getNome(), pessoa.getCpf(), pessoa.getLogin(), pessoa.getSenha());
        repository.save(p);
        return new ResponseEntity<>("Editado com sucesso", HttpStatus.OK);
    }
}
