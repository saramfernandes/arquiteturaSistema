package com.api.aula01api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.aula01api.entities.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
    
}
