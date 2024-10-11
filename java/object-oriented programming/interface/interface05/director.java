package com.mycompany.mavenproject1;

public class Diretor extends CargoConfianca implements Contratacao {
    private final double PREMIO = 0.5;
    private final double valorTotal = PREMIO + bonificacao.getValor();
    
    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }
    
    @Override
    public double getSalarioFinal() {
       double getSalarioFinal = 0;
       getSalarioFinal = super.salario * bonificacao.getValor();
       getSalarioFinal += super.salario;
       return getSalarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\nAdmitindo Funcionario.");
        System.out.println("Dados do funcionario: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("\nDemitindo Funcionario.");
        System.out.println("Dados do funcionario: ");
        System.out.println(funcionario.toString());
    }
    
    public double getPREMIO() {
       return PREMIO;
    }

    @Override
    public String toString() {
        return  "\nDiretor: " + 
                super.toString() + 
                "\nBonificação: " + bonificacao.getValor() +
                "\nPREMIO: " + PREMIO;
    }
}
