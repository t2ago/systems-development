package com.mycompany.mavenproject4;

public class Principal {

    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("555", "Ana", "01/01/01", Sexo.FEMININO, Setor.RECURSOS_HUMANOS, 3000);
        Diretor diretor = new Diretor("Clara", "01/01/01", Sexo.FEMININO, Setor.FINANCEIROS, 6000);
        
        System.out.println(motoboy);
        System.out.println(diretor);
        
        diretor.demitir(motoboy);
    }
}
