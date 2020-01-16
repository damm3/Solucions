package com.company;

import java.util.Scanner;

public class ddcb9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            System.out.print(numeros[i%n] + " ");
        }
    }
}
