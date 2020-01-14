package com.company;

import java.util.Scanner;

public class c9ac3 {

    /*
        Los algoritmos de ordenacion mas estudiados suelen ser:
            * Bubblesort
            * Mergesort
            * Quicksort

            Para este ejercicio implementamos el Bubblesort, ya que es
            el mas sencillo de los tres.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // guardamos los numeros
        int n = scanner.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = scanner.nextInt();
        }

        boolean intercambio;
        do {
             intercambio = false;

            for (int i = 1; i < n; i++) {
                if (seq[i-1] > seq[i]){
                    // intercambiamos los valores que hay en las
                    // posiciones [i-1] y [i]

                    int v = seq[i-1];
                    seq[i-1] = seq[i];
                    seq[i] = v;
                    intercambio = true;
                }
            }
        } while(intercambio);
        // cuando ya no se haya hecho ningun intercambio
        // es porque todos los valores del array ya estaban
        // ordenados


        // mostramos el array
        for (int i = 0; i < n; i++) {
            System.out.print(seq[i] + " ");
        }
    }
}
