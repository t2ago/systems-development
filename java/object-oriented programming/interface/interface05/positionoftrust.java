package com.mycompany.mavenproject1;

public abstract class CargoConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificao() {
        return bonificacao;
    }

    public void setBonificao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
