package com.mycompany.mavenproject3;

public class Principal {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Mutiplicacao mutiplicacao = new Mutiplicacao();
        
        System.out.println("Soma: " + soma.calcular(10, 10));
        System.out.println("Subtração: " + subtracao.calcular(10, 5));
        System.out.println("Divisão: " + divisao.calcular(10, 10));
        System.out.println("Mutiplicação: " + mutiplicacao.calcular(10, 10));
    }
}