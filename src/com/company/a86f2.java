package com.company;

import java.util.Scanner;

public class a86f2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] s = new int[n];

        for(int i=0; i<n; i++){
            s[i] = scanner.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.print((s[i]+s[n-1]) + " ");
        }
    }
}
