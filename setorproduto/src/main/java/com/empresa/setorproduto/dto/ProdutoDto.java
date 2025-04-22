package com.empresa.setorproduto.dto;

public class ProdutoDto {

    private String nome;

    public ProdutoDto() {

    }

    public ProdutoDto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
