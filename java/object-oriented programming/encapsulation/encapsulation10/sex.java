package com.mycompany.mavenproject4;

public enum Sexo {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    private String sexos;
    private char caractere;

    private Sexo(String sexos, char caractere) {
        this.sexos = sexos;
        this.caractere = caractere;
    }

    public String getSexos() {
        return sexos;
    }

    public char getCaractere() {
        return caractere;
    }
}
