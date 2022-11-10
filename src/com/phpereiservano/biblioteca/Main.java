package com.phpereiservano.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main (String[]args) {

        Libro libro = new Libro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el id del libro:");
        libro.setID(scanner.nextInt());

        System.out.println("Introduce el ISBN del libro:");
        libro.setISBN(scanner.nextInt());

        System.out.println("Introduce el titulo del libro:");
        libro.setTitulo(scanner.next());

        System.out.println("Introduce el autor del libro:");
        libro.setAutor(scanner.next());

        System.out.println("Introduce el genero del libro:");
        libro.setGenero(scanner.next());

        System.out.println("Introduce la fecha de publicacion del libro:");
        libro.setFechaPublicacion(scanner.next());


    }


}