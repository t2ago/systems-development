package com.mycompany.mavenproject4;

public enum Setor {
    FINANCEIRO("Financeiro"),
    RECUROS_HUMANOS("Recursos Humanos"),
    VENDAS("Vendas"),
    MARKETING("Marketing");
    
    private String setores;

    private Setor(String setores) {
        this.setores = setores;
    }

    public String getSetores() {
        return setores;
    }
}
