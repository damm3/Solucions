package com.company;

import java.util.Scanner;

public class c7e8d {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float cx = s.nextFloat();
        float cy = s.nextFloat();
        float ri = s.nextFloat();
        float re = s.nextFloat();

        float dx = s.nextFloat();
        float dy = s.nextFloat();

        double dc = Math.sqrt(Math.pow(dx-cx,2) + Math.pow(dy-cy, 2));

        System.out.println(dc > ri && dc < re);
    }
}
