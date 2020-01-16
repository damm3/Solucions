package com.company;

import java.util.Scanner;

public class e2368 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // llegim la primera sequencia
        int n1 = scanner.nextInt();
        int[] seq1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            seq1[i] = scanner.nextInt();
        }

        // llegim la segona sequencia
        int n2 = scanner.nextInt();
        int[] seq2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            seq2[i] = scanner.nextInt();
        }

        // si la primera sequencia es mes gran, no pot estar dintre de la segona
        if(n1 > n2){
            System.out.println("NO");
            return;
        }

        // anem recorrent la sequencia2 (la gran)
        // i buscarem en ella el primer numero de la sequencia1
        for (int i = 0; i < n2; i++) {

            // si trobem en la sequencia2
            // el primer numero de la sequencia1
            if(seq2[i] == seq1[0]){

                // la variable "i" ens marca la posicio de la sequencia2
                // on hem trobat el primer numero de la sequencia2

                // si els numeros que queden en la sequencia2
                // (a partir de la posicio on hem trobat el primer numero)
                // son menys que els que hi ha a la sequencia1
                // no pot estar dintre
                if(n1 > n2-i){
                    System.out.println("NO");
                    return;
                }

                // veiem si la resta de numeros de la sequencia1 (a partir del primer)
                // coincideixen amb els numeros de la sequencia2
                // a partir de la posicio on hem trobat el primer numero
                boolean esTrobaDintre = true;

                for (int j = 1; j < n1; j++) {
                    if(seq2[i+j] != seq1[j]){
                        esTrobaDintre = false;
                    }
                }

                if(esTrobaDintre){
                    System.out.println("SI");
                    return;
                }
            }

            // continuem el bucle a veure si tornem a trobar
            // el primer numero de la sequencia1 en la sequencia2
        }

        // si hem arribat aqui, es perque no s'ha trobat la "seq1" dintre de la "seq2"
        // ja quan la trobem, fem "return" i el programa acaba
        System.out.println("NO");
    }
}
