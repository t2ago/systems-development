package com.mycompany.mavenproject3;

public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
}
