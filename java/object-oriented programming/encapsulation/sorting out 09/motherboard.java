package com.mycompany.mavenproject2;

public class Placamae extends Produto {
    private String soquete;

    public Placamae(String soquete, String marca, String Modelo) {
        super(marca, Modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    } 
}
