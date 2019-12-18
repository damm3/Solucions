package com.company;

import java.util.Scanner;

public class e1070 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long n = s.nextLong();

        System.out.println(n*(n+1)*(2*n+1)/6);
    }
}
