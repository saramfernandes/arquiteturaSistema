package com.empresa.setorproduto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.setorproduto.dto.ProdutoDto;
import com.empresa.setorproduto.entities.Produto;
import com.empresa.setorproduto.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @PostMapping("/novo")
    public ResponseEntity<String> cadastraProduto(@RequestBody Produto produto) {
        return service.cadastroProduto(produto);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Produto>> listagemProduto() {
        return service.listaProduto();
    }

    @GetMapping("/buca/{id}")
    public ResponseEntity<ProdutoDto> buscaPorId(@PathVariable("id") int id) {
        return service.buscaPorId(id);
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<String> excluir(@PathVariable("id") int id) {
        return service.excluir(id);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editar(@RequestBody Produto produto, @PathVariable("id") int id) {
        return service.editar(produto, id);
    }
}
