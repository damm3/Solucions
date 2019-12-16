package com.company;

import java.util.Scanner;

public class dcbf4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean l1 = scanner.nextBoolean();
        boolean l2 = scanner.nextBoolean();
        boolean l3 = scanner.nextBoolean();
        boolean l4 = scanner.nextBoolean();

        System.out.println(!l1 && !l2 && !l3 && !l4);
    }
}
