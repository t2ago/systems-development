package com.mycompany.mavenproject1;

public abstract class CargoConfianca extends Funcionario {
    protected Bonificacao bonificao;

    public CargoConfianca(Bonificacao bonificao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.bonificao = bonificao;
    }

    public Bonificacao getBonificao() {
        return bonificao;
    }

    public void setBonificao(Bonificacao bonificao) {
        this.bonificao = bonificao;
    }
}
