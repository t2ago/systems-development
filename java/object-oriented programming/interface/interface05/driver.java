package com.mycompany.mavenproject1;

public class Motorista extends Funcionario {
    private String carteiraHabilitacao;

    public Motorista(String carteiraHabilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
       double getSalarioFinal = 0;
       getSalarioFinal += super.salario;
       return getSalarioFinal;
    }
    
    public String getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    public void setCarteiraHabilitacao(String carteiraHabilitacao) {
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    @Override
    public String toString() {
        return  "\nMotorista: " + 
                super.toString() + 
                "\nCarteira de Habilitação: " + carteiraHabilitacao;
    }
}
