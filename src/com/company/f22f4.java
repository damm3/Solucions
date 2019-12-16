package com.company;

import java.util.Scanner;

public class f22f4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println(Math.abs(x1-x2)*2+Math.abs(y1-y2)*2);
    }
}
