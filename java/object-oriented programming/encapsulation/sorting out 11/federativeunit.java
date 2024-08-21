package com.mycompany.mavenproject1;

public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    private String estado;
    private String sigla;

    private UnidadeFederativa(String estado, String sigla) {
        this.estado = estado;
        this.sigla = sigla;
    }

    public String getEstado() {
        return estado;
    }

    public String getSigla() {
        return sigla;
    }
}
