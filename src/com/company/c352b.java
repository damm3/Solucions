package com.company;

import java.util.Scanner;

public class c352b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println((23-h)*60 + 60-m);
    }
}
