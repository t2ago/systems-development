package com.mycompany.mavenproject3;

public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro(String crea, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
    @Override
    public String toString() {
        return "\nEngenheiro" + 
               super.toString() +
               "\nCrea: " + crea;
    }
}
