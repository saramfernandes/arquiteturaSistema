package com.prova.paciente.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prova.paciente.hospital.entities.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
   
}
