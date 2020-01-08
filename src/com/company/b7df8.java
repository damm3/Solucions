package com.company;

import java.util.Scanner;

public class b7df8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // guardem la sequencia de numeros
        int n = scanner.nextInt();
        int[] seq = new int[n];
        for (int i=0; i<n; i++){
            seq[i] = scanner.nextInt();
        }

        // imprimim els que ocupen una posicio parell
        for (int i=0; i<n; i+=2){
            System.out.print(seq[i] + " ");
        }

        System.out.println();

        // imprimim els que ocupen una posicio imparell
        for (int i=1; i<n; i+=2){
            System.out.print(seq[i] + " ");
        }

        System.out.println();
        System.out.println();

        // imprimim els que tenen un valor parell
        for(int i=0; i<n; i++){
            if(seq[i]%2 == 0){
                System.out.print(seq[i] + " ");
            }
        }

        System.out.println();

        // imprimim els que tenen un valor imparell
        for (int i=0; i<n; i++){
            if(seq[i]%2 == 1){
                System.out.print(seq[i] + " ");
            }
        }
    }
}
