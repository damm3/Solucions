package com.company;

import java.util.Scanner;

public class f67de {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] institutos = new String[n];

        for (int i = 0; i < n; i++) {
            institutos[i] = scanner.next();
        }

        for (int i = 0; i < n; i++) {
            int iguales = 0;
            for (int j = 0; j < i; j++) {
                if(institutos[i].equals(institutos[j])){
                    iguales++;
                }
            }
            System.out.print(iguales + " ");
        }
    }
}
