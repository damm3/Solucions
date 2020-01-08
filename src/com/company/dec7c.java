package com.company;

import java.util.Scanner;

public class dec7c {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] apunts = new String[n];

        for(int i=0; i<n; i++){
            int numeroPagina = scanner.nextInt();
            String text = scanner.nextLine();

            apunts[numeroPagina-1] = text;
        }

        for(int i=0; i<n; i++){
            System.out.println((i+1) + apunts[i]);
        }
    }
}
