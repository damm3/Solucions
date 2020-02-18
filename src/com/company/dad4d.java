package com.company;

import java.util.Locale;
import java.util.Scanner;

class Autor {
    String nombre;
    float rating;
}

class Libro {
    String titulo;
    String ISBN;
    float rating;
    Autor autor;
}

public class dad4d {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Libro libro = new Libro();
        libro.autor = new Autor();

        libro.titulo = scanner.nextLine();
        libro.ISBN = scanner.nextLine();
        libro.rating = scanner.nextFloat();
        scanner.nextLine();
        libro.autor.nombre = scanner.nextLine();
        libro.autor.rating = scanner.nextFloat();


        System.out.println(libro.ISBN);
        System.out.println(libro.titulo);
        System.out.println(new String(new char[(int)libro.rating]).replace("\0","*"));

        System.out.println(libro.autor.nombre);
        System.out.println(new String(new char[(int)libro.autor.rating]).replace("\0","*"));

    }
}
