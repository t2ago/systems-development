package com.mycompany.mavenproject1;

public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    private String nome;
    private String siglas;

    private UnidadeFederativa(String nome, String siglas) {
        this.nome = nome;
        this.siglas = siglas;
    }

    public String getNome() {
        return nome;
    }

    public String getSiglas() {
        return siglas;
    }
}
