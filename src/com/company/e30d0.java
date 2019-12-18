package com.company;

import java.util.Scanner;

public class e30d0 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();
        int w = s.nextInt();
        int h = s.nextInt();

        int x2 = s.nextInt();
        int y2 = s.nextInt();
        int w2 = s.nextInt();
        int h2 = s.nextInt();

        boolean overlap = x < x2 + w2 && x + w > x2 && y < y2 + h2 && y + h > y2;

        System.out.println(overlap);
    }
}
