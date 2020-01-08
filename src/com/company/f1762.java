package com.company;

import java.util.Scanner;

public class f1762 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // emmagatzemem la sequencia A
        int nA = scanner.nextInt();
        int[] seqA = new int[nA];
        for (int i=0; i<nA; i++){
            seqA[i] = scanner.nextInt();
        }

        // emmagatzemem la sequencia B
        int nB = scanner.nextInt();
        int[] seqB = new int[nB];
        for (int i=0; i<nB; i++){
            seqB[i] = scanner.nextInt();
        }

        if (nA > nB){
            // la primera sequencia te mes numeros
            for (int i = 0; i < nB; i++) {
                System.out.print(seqA[i] + " " + seqB[i] + " ");
            }
            for (int i = nB; i < nA; i++) {
                System.out.print(seqA[i] + " ");
            }
        } else if (nB > nA) {
            // la segona sequencia te mes numeros
            for (int i = 0; i < nA; i++) {
                System.out.print(seqA[i] + " " + seqB[i] + " ");
            }
            for (int i = nA; i < nB; i++) {
                System.out.print(seqB[i] + " ");
            }
        } else {
            // les dues sequencies tenen igual numeros
            for (int i = 0; i < nA; i++) {
                System.out.print(seqA[i] + " " + seqB[i] + " ");
            }
        }
    }
}
