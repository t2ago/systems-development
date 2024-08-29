package com.mycompany.mavenproject1;

public class Principal {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("222", "20", "2º Andar", "44.555-66", "A", UnidadeFederativa.SAO_PAULO);
        Advogado advogado = new Advogado("444", "Ana", "111.222.333-44", "22", endereco, Setor.JURIDICO, Sexo.FEMININO, 3000, "01/01/01");
        Motorista motorista = new Motorista("B", "Andre", "abc123", "kkkkkk", endereco, Setor.RECURSOS_HUMANOS, Sexo.MASCULINO, 1000, "02/02/02");
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Clara", "863853", "dsudsh", endereco, Setor.OPERACOES, Sexo.FEMININO, 5000, "03/04/05");
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Laura", "56487546", "59847958", endereco, Setor.JURIDICO, Sexo.FEMININO, 10000, "05/05/05");

        System.out.println(advogado);
        System.out.println(motorista);
        System.out.println(gerente);
        System.out.println(diretor); 
    }   
}
