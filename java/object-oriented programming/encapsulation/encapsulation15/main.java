package com.mycompany.mavenproject2;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("A", "20", "1 Andar", "40000", "A", UnidadeFederativa.BAHIA);
        Cliente cliente1 = new Cliente("A", Sexo.FEMININO, EstadoCivil.CASADO, "01/01/01", "Ana", "1199999-9999", "ana@gmail.com", endereco1);
        PrestacaoServico prestador1 = new PrestacaoServico("20/01/01", "20/01/02", "444", "999", "Clara", "1198888-8888", "clara@gmail.com", endereco1);
        
        System.out.println(cliente1);
        System.out.println(prestador1);
    }
}