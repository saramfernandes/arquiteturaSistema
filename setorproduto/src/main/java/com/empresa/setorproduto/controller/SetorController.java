package com.empresa.setorproduto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.setorproduto.entities.Setor;
import com.empresa.setorproduto.service.SetorService;

@RestController
@RequestMapping("/setor")
public class SetorController {
    
    @Autowired
    SetorService service;

    @PostMapping("/novo")
    public ResponseEntity<String> cadastraSetor(@RequestBody Setor setor) {
        return service.cadastroSetor(setor);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Setor>> listagemSetor() {
        return service.listaSetor();
    }
}
