package com.empresa.setorproduto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.empresa.setorproduto.converter.ProdutoConverter;
import com.empresa.setorproduto.dto.ProdutoDto;
import com.empresa.setorproduto.entities.Produto;
import com.empresa.setorproduto.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repository;

    @Autowired
    ProdutoConverter converter;

    public ResponseEntity<String> cadastroProduto(Produto produto) {
        repository.save(produto);
        return new ResponseEntity<>("Cadastrado com Sucesso", HttpStatus.OK);
    }

    public ResponseEntity<List<Produto>> listaProduto() {
        List<Produto> produtoListado = repository.findAll();
        return new ResponseEntity<>(produtoListado, HttpStatus.OK);
    }

    public ResponseEntity<ProdutoDto> buscaPorId(int id) {
        Optional<Produto> produtoOptional = repository.findById(id);

        if (produtoOptional.isPresent()) {
            Produto produto = produtoOptional.get();
            return new ResponseEntity<>(converter.toDto(produto), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<String> excluir(int id) {
        repository.deleteById(id);
        return new ResponseEntity<>("Excluido com Sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> editar(Produto produto, int id) {
        Produto p = repository.findById(id).orElse(null);
        p = new Produto(id, produto.getNome(), produto.getSetor());
        repository.save(p);
        return new ResponseEntity<>("Editado com Sucesso", HttpStatus.OK);
    }
}
