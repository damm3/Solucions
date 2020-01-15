package com.company;

import java.util.Scanner;

public class cc442 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt(); // files
        int n = scanner.nextInt(); // columnes

        // creem el tauler
        int[][] tauler = new int[m][n];

        // llegim el tauler
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tauler[i][j] = scanner.nextInt();
            }
        }

        // anem llegint les posicions
        int fila = scanner.nextInt();
        int columna = scanner.nextInt();

        while (fila != 0 && columna != 0) {
            // restem 1 a la fila i columna, ja que a l'entrada comencen per 1, pero a la matriu comencen per 0.
            if(tauler[fila-1][columna-1] == 1){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            fila = scanner.nextInt();
            columna = scanner.nextInt();
        }
    }
}
