package com.mycompany.mavenproject1;

public class Main {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("333", "20E", "1º Andar", "40444-444", "B", UnidadeFederativa.SAO_PAULO);
        Endereco endereco2 = new Endereco("222", "30A", "3º Andar", "80333-333", "A", UnidadeFederativa.RIO_DE_JANEIRO);
        Fisica fisica1 = new Fisica(Sexo.FEMININO, "01/01/01", "Ana", "1199999-9999", "ana@gmail.com", endereco1);
        Juridica juridica1 = new Juridica("444", "RS", "Clara", "1198888-8888", "clara@gmail.com", endereco2);
        
        System.out.println(fisica1);
        System.out.println(juridica1);
    }
}
