package com.mycompany.livros;

public class Main {

    public static void main(String[] args) {
        Books book = new Books("A Arte da Guerra", "Sun Tzu", 128, 70);
        
        System.out.println("Título: " + book.getTitulo());
        System.out.println("Autor: " + book.getAutor());
        System.out.println("Número de páginas: " + book.getPags());
        System.out.println("Preço: " + book.getPreco());
    }
}
