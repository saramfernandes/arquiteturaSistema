package com.api.aula01api.dto;

public class PessoaDto {

    private String nome;
    private String login;

    public PessoaDto() {

    }

    public PessoaDto(String nome, String login) {
        this.nome = nome;
        this.login = login;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    
}
