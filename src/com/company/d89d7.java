package com.company;

import java.util.Scanner;

public class d89d7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        boolean[] haPujat = new boolean[n];  // en aquest array anirem marcant els que han pujat

        // anem veient cada nen que ha pujat
        for (int i = 0; i < n; i++) {
            int numeroNen = scanner.nextInt() - 1; // restem 1, ja que l'array comenca per 0.

            // comprovem que el numero del nen es valid
            if(numeroNen < n) {
                // el marquem com que ha pujat
                haPujat[numeroNen] = true;
            }
        }


        // recorrem l'array i veiem si hi ha algun nen que no ha pujat
        boolean hanPujatTots = true;
        for (int i = 0; i < n; i++) {


            if(!haPujat[i]){
                // si algun nen no ha pujat, aleshores es que no han pujat tots
                hanPujatTots = false;
            }
        }

        if(hanPujatTots){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
