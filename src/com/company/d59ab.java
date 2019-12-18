package com.company;

import java.util.Scanner;

public class d59ab {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long a = s.nextLong();

        long q1 = a/1000000000000L;
        long q2 = a/100000000%10000;
        long q3 = a/10000%10000;
        long q4 = a%10000;

        System.out.println(q1 == 1729 || q2 == 1729 || q3 == 1729 || q4 == 1729);
    }
}
