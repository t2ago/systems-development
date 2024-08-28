package com.mycompany.mavenproject4;

public class Motoboy extends Funcionario {
    private String carteiraHabilitacao;

    public Motoboy(String carteiraHabilitacao, String nome, String dataNascimemto, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimemto, sexo, setor, salarioBase);
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    public String getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    public void setCarteiraHabilitacao(String carteiraHabilitacao) {
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    @Override
    public String toString() {
        return "Carteira de Habilitação: " + carteiraHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
