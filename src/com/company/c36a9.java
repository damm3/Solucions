package com.company;

import java.util.Scanner;

public class c36a9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int a = scanner.nextInt();
        int c = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();

        System.out.println(i*6 + a*8 + c*10 + m1*(2*s1) + m2*(4*s2));
    }
}
