package com.desafio.hexagonal.infraestrutura.persistence.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registroVoto")
public class RegistroVotoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String usuarioId;
    private String enqueteId;
    private String tipoVoto;

    public RegistroVotoEntity(int id, String usuarioId, String enqueteId, String tipoVoto) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.enqueteId = enqueteId;
        this.tipoVoto = tipoVoto;
    }

    public RegistroVotoEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getEnqueteId() {
        return enqueteId;
    }

    public void setEnqueteId(String enqueteId) {
        this.enqueteId = enqueteId;
    }

    public String getTipoVoto() {
        return tipoVoto;
    }

    public void setTipoVoto(String tipoVoto) {
        this.tipoVoto = tipoVoto;
    } 

}
