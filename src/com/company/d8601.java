package com.company;

import java.util.Scanner;

public class d8601 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a+1; i <= b; i++) {
            if (i%3 == 0) {
                System.out.println(i);
            }
        }
    }
}
