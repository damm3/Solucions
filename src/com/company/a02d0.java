package com.company;

import java.util.Scanner;

public class a02d0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numeros = new int[n];

        for(int i=0; i<n; i++){
            numeros[i] = scanner.nextInt();
        }

        boolean capicua = true;
        for (int i=0; i<n/2; i++){
            if(numeros[i] != numeros[n-i-1]){
                capicua = false;
                break;
            }
        }

        if(capicua){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        // System.out.println(capicua ? "SI" : "NO");
    }
}
