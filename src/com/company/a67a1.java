package com.company;

import java.util.Scanner;

public class a67a1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for(int i=0; i<n; i++){
            numeros[i] = scanner.nextInt();
        }

        for(int i=n-1; i>=0; i--){
            System.out.print(numeros[i] + " ");
        }
    }
}
