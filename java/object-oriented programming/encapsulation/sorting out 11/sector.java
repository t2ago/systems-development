package com.mycompany.mavenproject1;

public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico");
    
    private String setores;

    private Setor(String setores) {
        this.setores = setores;
    }

    public String getSetores() {
        return setores;
    }
}
