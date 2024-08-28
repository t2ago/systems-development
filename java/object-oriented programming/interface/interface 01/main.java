package com.mycompany.mavenproject1;

public class Principal {

    public static void main(String[] args) {
        Cachorro toto = new Cachorro();
        Gato gato = new Gato();
        
        System.out.println(toto.emitirSom());
        System.out.println(gato.emitirSom());
    }
}