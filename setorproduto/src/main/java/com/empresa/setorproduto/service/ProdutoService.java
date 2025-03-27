package com.empresa.setorproduto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.empresa.setorproduto.entities.Produto;
import com.empresa.setorproduto.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    ProdutoRepository repository;

    public ResponseEntity<String> cadastroProduto(Produto produto) {
        repository.save(produto);
        return new ResponseEntity<>("Cadastrado com Sucesso", HttpStatus.OK);
    }

    public ResponseEntity<List<Produto>> listaProduto() {
        List<Produto> produtoListado = repository.findAll();
        return new ResponseEntity<>(produtoListado, HttpStatus.OK);
    }
}
