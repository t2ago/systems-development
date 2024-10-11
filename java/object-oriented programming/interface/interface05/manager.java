package com.mycompany.mavenproject1;

public class Gerente extends CargoConfianca {

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }

    @Override
    public double getSalarioFinal() {
       double getSalarioFinal = 0;
       getSalarioFinal = super.salario * bonificacao.getValor();
       getSalarioFinal += super.salario;
       return getSalarioFinal;
    }
    
    public Bonificacao getBonificao() {
        return bonificacao;
    }

    public void setBonificao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "\nGerente: " + 
               super.toString() +
               "\nBonificação: " + bonificacao.getValor();
    }
}
