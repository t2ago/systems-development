package com.mycompany.mavenproject2;

public abstract class Produto {
    protected String marca;
    protected String Modelo;

    public Produto(String marca, String Modelo) {
        this.marca = marca;
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
}
