package com.company;

import java.util.Scanner;

public class ca7df {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();    // nombre de discs
        int[] ocupacio = new int[n];  // ocupacio d'espai de cada disc

        // llegim les ocupacions inicials de cada disc
        for(int i=0; i<n; i++){
            ocupacio[i] = scanner.nextInt();
        }

        // anem llegint la sequencia dels blocs
        for(int bloc = scanner.nextInt(); bloc != 0; bloc = scanner.nextInt()){

            // busquem el disc menys ocupat
            int discMenysOcupat = 0;
            for(int i=0; i<n; i++){
                if(ocupacio[i] < ocupacio[discMenysOcupat]){
                    discMenysOcupat = i;
                }
            }

            // afegim el bloc al disc menys ocupat
            ocupacio[discMenysOcupat] += bloc;
        }

        // mostrem la ocupacio final de cada disc
        for(int i=0; i<n; i++){
            System.out.print(ocupacio[i] + " ");
        }
    }
}
