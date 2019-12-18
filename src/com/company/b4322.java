package com.company;

import java.util.Scanner;

public class b4322 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        float[] a = new float[n];

        for (int i=0; i<n; i++){
            a[i] = scanner.nextFloat();
        }

        float m = scanner.nextFloat();

        for (int i=0; i<n; i++){

            if (a[i] >= m){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

        }
    }
}
