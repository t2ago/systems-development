package com.mycompany.mavenproject1;

public class Gerente extends CargoConfianca {

    public Gerente(Bonificacao bonificao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(bonificao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }

    @Override
    public double getSalarioFinal() {
       double getSalarioFinal = 0;
       getSalarioFinal += super.salario;
       return getSalarioFinal;
    }
    
    public Bonificacao getBonificao() {
        return bonificao;
    }

    public void setBonificao(Bonificacao bonificao) {
        this.bonificao = bonificao;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
