package com.company;

import java.util.Scanner;

public class b8703 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n-1; i++) {
            System.out.print(n + ",");
        }
        System.out.println(n);
    }
}
