package com.desafio.hexagonal.infraestrutura.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.hexagonal.infraestrutura.persistence.entity.RegistroVotoEntity;

@Repository
public interface RegistroVotoRepository extends JpaRepository<RegistroVotoEntity, Integer> {
    boolean existsByUsuarioIdAndEnqueteId(String usuarioId, String enqueteId);
}
