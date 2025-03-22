package com.senai.ads.aula01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.ads.aula01.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    
}
