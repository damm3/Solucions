package com.company;

import java.util.Scanner;

public class d87f8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int cx = s.nextInt();
        int cy = s.nextInt();

        int p1x = s.nextInt();
        int p1y = s.nextInt();

        int p2x = s.nextInt();
        int p2y = s.nextInt();

        int c1x = cx -2;
        int c1y = cy -1;

        int c2x = cx +2;
        int c2y = cy -1;

        int c3x = cx -2;
        int c3y = cy +1;

        int c4x = cx +2;
        int c4y = cy +1;

        int c5x = cx -1;
        int c5y = cy -2;

        int c6x = cx +1;
        int c6y = cy -2;

        int c7x = cx -1;
        int c7y = cy +2;

        int c8x = cx +1;
        int c8y = cy +2;

        int a = 0;

        a += c1x == p1x && c1y == p1y ? 1 : 0;
        a += c1x == p2x && c1y == p2y ? 1 : 0;

        a += c2x == p1x && c2y == p1y ? 1 : 0;
        a += c2x == p2x && c2y == p2y ? 1 : 0;

        a += c3x == p1x && c3y == p1y ? 1 : 0;
        a += c3x == p2x && c3y == p2y ? 1 : 0;

        a += c4x == p1x && c4y == p1y ? 1 : 0;
        a += c4x == p2x && c4y == p2y ? 1 : 0;

        a += c5x == p1x && c5y == p1y ? 1 : 0;
        a += c5x == p2x && c5y == p2y ? 1 : 0;

        a += c6x == p1x && c6y == p1y ? 1 : 0;
        a += c6x == p2x && c6y == p2y ? 1 : 0;

        a += c7x == p1x && c7y == p1y ? 1 : 0;
        a += c7x == p2x && c7y == p2y ? 1 : 0;

        a += c8x == p1x && c8y == p1y ? 1 : 0;
        a += c8x == p2x && c8y == p2y ? 1 : 0;


        System.out.println(a);
    }
}
