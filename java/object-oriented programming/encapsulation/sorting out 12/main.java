package com.mycompany.mavenproject2;

public class Principal {

    public static void main(String[] args) {
        Fisica fisica1 = new Fisica("111.222.333-44", "444", "01/01/01", "Ana", "119999-9999");
        Juridica juridica1 = new Juridica("444", "RS", "Clara", "1198888-8888");
        
        System.out.println(fisica1);
        System.out.println(juridica1);
    }
}