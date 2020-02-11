package com.company;

import java.util.Scanner;

public class d06aa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int comensales = scanner.nextInt();
        float precioKgArroz = scanner.nextFloat();
        float precioKgGambas = scanner.nextFloat();

        float kgArroz = comensales*0.5f/4;
        float kgGambas = comensales*0.25f/4;

        float costeArroz = precioKgArroz * kgArroz;
        float costeGambas = precioKgGambas * kgGambas;

        float costeTotal = costeArroz + costeGambas;

        System.out.println(kgArroz + " kg arros");
        System.out.println(kgGambas + " kg gambes");
        System.out.println(costeArroz + "e arros");
        System.out.println(costeGambas + "e gambes");
        System.out.println("TOTAL: " + costeTotal + "e");
    }
}
