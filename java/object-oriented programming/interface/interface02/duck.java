package com.mycompany.mavenproject2;

public class Pato implements Animal {

    @Override
    public String emitirSom() {
        return "Quack!";
    }

    @Override
    public String comer() {
        return "Tectec!";
    }
    
}
