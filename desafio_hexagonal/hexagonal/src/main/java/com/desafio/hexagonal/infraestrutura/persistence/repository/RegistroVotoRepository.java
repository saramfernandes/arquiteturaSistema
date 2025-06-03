package com.desafio.hexagonal.infraestrutura.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.hexagonal.application.port.in.RegistroVoto;

@Repository
public interface RegistroVotoRepository extends JpaRepository<RegistroVoto, Integer>{
    
}
