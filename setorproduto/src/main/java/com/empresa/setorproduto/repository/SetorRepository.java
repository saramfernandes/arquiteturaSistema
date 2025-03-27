package com.empresa.setorproduto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.setorproduto.entities.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Integer>{
    
}
