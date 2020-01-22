package com.company;

import java.util.Scanner;

public class cb3c8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }



        int pastanagaABuscar = 1;

        int coluConill = n/2;  // columna on es troba el conill (centre)
        int filaConill = n/2;  // fila on es troba el conill (centre)

        int moviments = 0;

        boolean seguirBuscantPastanagues = true;

        while(seguirBuscantPastanagues) {

            seguirBuscantPastanagues = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (grid[i][j] == pastanagaABuscar) {

                        // sumem als moviments la distancia entre la posicio acutal del conill i la pastanaga
                        moviments +=  Math.abs(coluConill - i) + Math.abs(filaConill - j);

                        // coloquem el conill en la posicio de la pastanaga
                        coluConill = i;
                        filaConill = j;

                        // haurem de buscar la seguent pastanaga
                        pastanagaABuscar++;
                        seguirBuscantPastanagues = true;
                    }
                }
            }
        }

        System.out.println(moviments);
    }
}

/*
3
1 0 0
0 0 0
2 0 0

3
1 0 0
0 0 0
3 0 2



5
0 0 3 0 0
0 1 0 2 0
0 0 0 0 0
0 0 0 0 0
0 0 4 0 0

5
0 0 0 0 0
0 2 3 4 0
0 1 0 5 0
0 8 7 6 0
0 0 0 0 0

5
0 0 0 0 0
0 3 2 4 0
0 1 0 6 0
0 8 7 5 0
0 0 0 0 0

9
10  0  5  0  0  0  0  0 12
 0  0  0  0  0  4  0  0  0
 0  0  0  0  0  0  0  0  7
 1  0  0  0  0  0  0  0  0
 0  0  0  0  0  0 11  0  0
 0  0  0  0  0  0  0  0  0
 0  0  0  6  0  0  2  0  0
 0  3  0  0  0  0  0  0  0
 8  0  0  0  0  0  0  0  9


3
4 0 3
0 0 0
2 0 1
 */