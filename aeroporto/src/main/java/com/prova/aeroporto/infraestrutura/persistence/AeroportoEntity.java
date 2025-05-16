package com.prova.aeroporto.infraestrutura.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aeroporto")
public class AeroportoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome; 
    private String cidade;
    private String estado;
    private String codigoATA;
    private String telefone;

    public AeroportoEntity(String nome, String cidade, String estado, String codigoATA, String telefone) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.codigoATA = codigoATA;
        this.telefone = telefone;
    }

    public AeroportoEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoATA() {
        return codigoATA;
    }

    public void setCodigoATA(String codigoATA) {
        this.codigoATA = codigoATA;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
