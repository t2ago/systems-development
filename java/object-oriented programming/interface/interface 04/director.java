package com.mycompany.mavenproject4;

public class Diretor extends Funcionario implements Contratacao {
    
    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimemto, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimemto, sexo, setor, salarioBase);
    }

    @Override
    public double getSalarioFinal() {
       double salarioFinal = 0;
       salarioFinal = super.salarioBase * PREMIO;
       salarioFinal += super.salarioBase;
       return salarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\nAdmitindo Funcionário.");
        System.out.println("Dados do funcionário: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("\nDemitindo Funcionário");
        System.out.println("Dados do funcionário");
        System.out.println(funcionario.toString());
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return super.toString() +
        "\nPREMIO: " + PREMIO;
    }
}
