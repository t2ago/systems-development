package com.mycompany.mavenproject3;

public class Principal {

    public static void main(String[] args) {
        Motoboy motoboy1 = new Motoboy("444", "Ana", "111.222.333-44", "444", 3000);
        Engenheiro engenheiro1 = new Engenheiro("999", "Clara", "555.666.777-88", "555", 6000);
        Medico medico1 = new Medico("333", "Luiza", "222.333.444-55", "222", 12000);
        
        System.out.println(motoboy1);
        System.out.println(engenheiro1);
        System.out.println(medico1);
    }
}
