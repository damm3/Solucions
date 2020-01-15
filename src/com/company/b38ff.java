package com.company;

import java.util.Scanner;

public class b38ff {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt(); // files
        int n = scanner.nextInt(); // columnes

        // creem el tauler
        int[][] tauler = new int[m][n];

        // llegim l'identificador de cada casella
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tauler[i][j] = scanner.nextInt();
            }
        }

        // llegim l'identificador de la casella on explota la bomba
        int idCasellaExplota = scanner.nextInt();

        // esbrinem la fila i columna on esta la casella on ha explotat la bomba
        int filaExplota = 0;
        int columnaExplota = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if(tauler[i][j] == idCasellaExplota){
                    filaExplota = i;
                    columnaExplota = j;
                }

            }
        }

        // mostrem el resultat:
        // les caselles que estiguin a la fila O la columna on ha explotat, mostrem @
        // la resta de caselles, mostrem #

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if(i == filaExplota || j == columnaExplota){
                    System.out.print("@");
                } else {
                    System.out.print("#");
                }

            }
            System.out.println();
        }
    }
}
