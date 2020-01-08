package com.company;

import java.util.Scanner;

public class c9ac3 {

    /*
        Los algoritmos de ordenación mas estudiados suelen ser:
            * Bubblesort
            * Mergesort
            * Quiksort
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // guardamos los numeros
        int n = scanner.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = scanner.nextInt();
        }

        boolean intercambio = false;
        while(!intercambio) {
             intercambio = false;

            for (int i = 1; i < n; i++) {
                if (seq[i-1] < seq[i]){

                }
            }
        };


    }
}
