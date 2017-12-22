package com.example.livre.carlululite;

public class Registro {
    private String nome,endereco,telefone;

    public Registro(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome(){return nome;}
    public String getEndereco(){return endereco;}
    public String getTelefone(){return telefone;}
}