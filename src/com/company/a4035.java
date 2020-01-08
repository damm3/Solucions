package com.company;

import java.util.Scanner;

public class a4035 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++){
            numeros[i] = scanner.nextInt();
        }

        int iguals = 0;
        for (int i = 0; i < n-1; i++){
            if (numeros[i] == numeros[n-1]){
                iguals++;
            }
        }

        System.out.println(iguals);
    }
}
