package com.mycompany.mavenproject4;

public enum Setor {
    RECURSOS_HUMANOS("Recursos Humanos"),
    FINANCEIROS("Financeiros"),
    OPERACOES("Operações");
    
    private String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
