package com.prova.aeroporto.infraestrutura.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AeroportoRepository extends JpaRepository<AeroportoEntity, Integer> {
    
}
