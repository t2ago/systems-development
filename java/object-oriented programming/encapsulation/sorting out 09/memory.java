package com.mycompany.mavenproject2;

public class Memoria extends Produto {
    private String armazenamento;

    public Memoria(String armazenamento, String marca, String Modelo) {
        super(marca, Modelo);
        this.armazenamento = armazenamento;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    
}
