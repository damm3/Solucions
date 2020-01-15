package com.company;

import java.util.Scanner;

public class d74f9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt(); // files
        int n = scanner.nextInt(); // columnes

        // creem el tauler
        int[][] tauler = new int[m][n];

        // legim el tauler
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tauler[i][j] = scanner.nextInt();
            }
        }

        // creem un segon tauler on anirem fent el recompte de mines
        // És necessari per tal de no tocar el tauler original, per que si no
        // confondriem el numero 1 que indica si hi ha mina, amb els numeros del recompte
        int[][] tauler2 = new int[m][n];

        // recorrem el tauler original
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if(tauler[i][j] == 1){
                    // si a l'original hi ha una mina, no hem de fer el recompte
                    tauler2[i][j] = 1;
                } else {
                    // si en la casella original NO hi ha mina:

                    // recorrem les caselles al voltant
                    for (int u = -1; u < 2; u++) {
                        for (int v = -1; v < 2; v++) {
                            //comprovem que no ens sortim dels límits del tauler
                            if(i+u >= 0 && i+u < m && j+v >=0 && j+v < n){
                                if(tauler[i+u][j+v] == 1) {
                                    // si en la casella adjacent hi ha mina
                                    // sumem 1 al comptador de mines
                                    tauler2[i][j]++;
                                }
                            }
                        }
                    }
                }
            }
        }

        // mostrem el tauler amb el recompte
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tauler2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
