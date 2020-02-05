package com.company;

import java.util.Scanner;

public class e33c4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();

        for (int i = 0; i < filas; i++) {
            float suma = 0;
            for (int j = 0; j < columnas; j++) {
                int nota = scanner.nextInt();
                suma += nota;
                System.out.print(nota + " ");
            }
            System.out.println(suma/columnas);
        }
    }
}