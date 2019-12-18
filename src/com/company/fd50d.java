package com.company;

import java.util.Scanner;

public class fd50d {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        int x2 = s.nextInt();
        int y2 = s.nextInt();

        boolean horitzontal = x == x2;
        boolean vertical = y == y2;
        boolean diagonal = x-y == x2-y2 || y-x == y2-x2 || x-y2 == x2-y || y-x2 == y2-x;

        System.out.println(horitzontal || vertical || diagonal);
    }
}
