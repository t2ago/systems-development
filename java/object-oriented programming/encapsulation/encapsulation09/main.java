package com.mycompany.mavenproject2;

public class Principal {

    public static void main(String[] args) {
        Processador processador1 = new Processador(4.4, "Asus1", "xxx1");
        Memoria memoria1 = new Memoria("32GB", "Asus2", "xxx2");
        Placamae placamae1 = new Placamae("xxx3", "Asus3", "xxx4");
        Armazenamento armazenamento1 = new Armazenamento("SATA", "Asus4", "xxx5");
        
        System.out.println("\nProcessador: ");
        System.out.println("Marca: " + processador1.getMarca());
        System.out.println("Modelo: " + processador1.getModelo());
        System.out.println("Frequência: " + processador1.getFrequencia());
        
        System.out.println("\nMemoria: ");
        System.out.println("Marca: " + memoria1.getMarca());
        System.out.println("Modelo: " + memoria1.getModelo());
        System.out.println("Armazenamento: " + memoria1.getArmazenamento());
        
        System.out.println("\nPlaca mãe: ");
        System.out.println("Marca: " + placamae1.getMarca());
        System.out.println("Modelo: " + placamae1.getModelo());
        System.out.println("Soquete: " + placamae1.getSoquete());
        
        System.out.println("\nArmazenamnto: ");
        System.out.println("Marca: " + armazenamento1.getMarca());
        System.out.println("Modelo: " + armazenamento1.getModelo());
        System.out.println("Tipo de conexão: " + armazenamento1.getTipoConexao());   
    }
}
