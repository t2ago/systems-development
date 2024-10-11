package com.mycompany.mavenproject4;

public class Principal {

    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios("444", "Ana", 3000, Setor.MARKETING, Sexo.FEMININO, 23);
        
        System.out.println("Funcionário: ");
        System.out.println("ID: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Setor: " + funcionario.getSetor().getSetores());
        System.out.println("Sexo: " + funcionario.getSexo().getCaractere());
        System.out.println("Idade: " + funcionario.getIdade());  
    }
}
