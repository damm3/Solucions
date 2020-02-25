package com.company;

import java.util.Locale;
import java.util.Scanner;

class Producte {
    String nom;
    String descripcio;
    float preu;
    int stock;
}

public class ec528 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Producte producte = new Producte();

        producte.nom = scanner.nextLine();
        producte.descripcio = scanner.nextLine();
        producte.preu = scanner.nextFloat();
        producte.stock = scanner.nextInt();

        System.out.println("Nom:        " + producte.nom);
        System.out.println("Descripcio: " + producte.descripcio);
        System.out.println("Preu:       " + producte.preu);
        System.out.println("Stock:      " + producte.stock);
    }
}
