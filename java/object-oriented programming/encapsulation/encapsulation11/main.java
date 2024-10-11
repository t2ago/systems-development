package com.mycompany.mavenproject1;

public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(4444, "Ana", "111.222.333-44", "6363", "01/01/01", Sexo.FEMININO, Setor.SAUDE, 4000, "119999-9999", "ana@gmail.com",
                                   new Endereco("44", "1194444-4444", "1º Andar", "80444-444", "Salvador", UnidadeFederativa.BAHIA));
          
          System.out.println(funcionario1.toString());
        
//        System.out.println("Funcionario: ");
//        System.out.println("ID:" + funcionario1.getId());
//        System.out.println("Nome: " + funcionario1.getNome());
//        System.out.println("CPF: " + funcionario1.getCpf());
//        System.out.println("Matrícula: " + funcionario1.getMatricula());
//        System.out.println("Data de Nascimento: " + funcionario1.getDataNascimento());
//        System.out.println("Sexo: " + funcionario1.getSexo().getNome());
//        System.out.println("Setor: " + funcionario1.getSetor().getSetores());
//        System.out.println("Salário: " + funcionario1.getSalario());
//        System.out.println("Telefone: " + funcionario1.getTelefone());
//        System.out.println("Email: " + funcionario1.getEmail());
//        System.out.println("\nEndereço: ");
//        System.out.println("Logradouro: " + funcionario1.getEndereco().getLogradouro());
//        System.out.println("Numero: " + funcionario1.getEndereco().getNumero());
//        System.out.println("Complemento: " + funcionario1.getEndereco().getComplemento());
//        System.out.println("CEP: " + funcionario1.getEndereco().getCep());
//        System.out.println("Cidade: " + funcionario1.getEndereco().getCidade());
//        System.out.println("UF: " + funcionario1.getEndereco().getUf());
    }
}
