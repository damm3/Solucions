package com.company;

import java.util.Scanner;

public class f13d9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int d = s.nextInt();
        int m = s.nextInt();
        int y = s.nextInt();

        int d2 = s.nextInt();
        int m2 = s.nextInt();
        int y2 = s.nextInt();

        boolean caducat = y < y2 || y == y2 && (m < m2 || (m == m2 && d < d2));

        System.out.println(caducat);
    }
}
