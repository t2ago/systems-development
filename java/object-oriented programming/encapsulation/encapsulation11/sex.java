package com.mycompany.mavenproject1;

public enum Sexo {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    private String nome;
    private char caractere;

    private Sexo(String nome, char caractere) {
        this.nome = nome;
        this.caractere = caractere;
    }
    
    public String getNome() {
        return nome;
    }
    
    public char getCaractere() {
        return caractere;
    }
}
