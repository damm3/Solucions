package com.company;

import java.util.Scanner;

public class e9ac5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();
        int e = scanner.nextInt();
        int t = scanner.nextInt();

        System.out.println((int) (100 - (float) e*100/l));
        System.out.println((int) ((float) l/5 / ((float) t/60)));
    }
}
