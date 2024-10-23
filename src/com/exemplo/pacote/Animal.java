package com.exemplo.pacote;

public class Animal {
    public String nome;

    protected void fazerSom() {
        System.out.println("Som do animal");
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
