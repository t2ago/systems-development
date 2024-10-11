package com.mycompany.mavenproject2;

public class Processador extends Produto {
    private double frequencia; 

    public Processador(double frequencia, String marca, String Modelo) {
        super(marca, Modelo);
        this.frequencia = frequencia;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    } 
}
