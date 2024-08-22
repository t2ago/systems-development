package com.mycompany.mavenproject3;

public class Advogado extends Funcionario{
    private String aob;

    public Advogado(String aob, String cpf, String rg, String matricula, Setor setor, double salario, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.aob = aob;
    }

    public String getAob() {
        return aob;
    }

    public void setAob(String aob) {
        this.aob = aob;
    }
}
