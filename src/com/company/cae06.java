package com.company;

import java.util.Scanner;

public class cae06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float x = s.nextFloat();
        float y = s.nextFloat();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));

        System.out.println((int) Math.ceil((25-distance)/5));
    }
}
