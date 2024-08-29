package com.mycompany.mavenproject1;

public class Advogado extends Funcionario {
    private String oab;

    public Advogado(String oab, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.oab = oab;
    }
    
    @Override
    public double getSalarioFinal() {
       double getSalarioFinal = 0;
       getSalarioFinal += super.salario;
       return getSalarioFinal;
    }
    
    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nOab: " + oab;
    }
}
