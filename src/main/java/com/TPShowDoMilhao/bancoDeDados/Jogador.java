package com.TPShowDoMilhao.bancoDeDados;

public class Jogador {

    protected String nome, email, senha;
    private int idjogador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdjogador() {
        return idjogador;
    }

    public void setIdjogador(int idjogador) {
        this.idjogador = idjogador;
    }

    public Jogador(String nome, String email, String senha, int idjogador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.idjogador = idjogador;


    }
}
