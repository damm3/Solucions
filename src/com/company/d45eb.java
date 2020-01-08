package com.company;

import java.util.Scanner;

public class d45eb {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // tamany de la sequencia A
        int nA = scanner.nextInt();

        // array per a guardar la sequencia A
        int[] numerosA = new int[nA];

        // llegim i guardem la sequencia A
        for(int i=0; i<nA; i++){
            numerosA[i] = scanner.nextInt();
        }

        // tamany de la sequencia B
        int nB = scanner.nextInt();

        if(nA != nB){
            // si no tenen el mateix tamany, imprimim 'false'
            System.out.println(false);
        } else {
            // si tenen el mateix tamany:
            //    - suposem que son iguals
            //    - si trobem algun numero *diferent*
            //      canviem la suposició a false
            boolean iguals = true;

            for(int i=0; i<nA; i++){
                int numeroB = scanner.nextInt();

                if(numeroB != numerosA[i]){
                    iguals = false;
                    break;
                }
            }
            System.out.println(iguals);
        }
    }
}
