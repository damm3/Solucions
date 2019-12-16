package com.company;

import java.util.Scanner;

public class f2381 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = scanner.nextInt();
        int s = scanner.nextInt();

        System.out.println(s*1024/v);
    }
}
