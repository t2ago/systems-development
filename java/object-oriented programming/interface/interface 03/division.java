package com.mycompany.mavenproject3;

public class Divisao implements OperacaoMatematica {

    @Override
    public double calcular(double a, double b) {
        return a / b;
    }
    
}