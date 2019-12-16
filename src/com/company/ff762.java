package com.company;

import java.util.Scanner;

public class ff762 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int GA = scanner.nextInt();
        int EA = scanner.nextInt();
        int PA = scanner.nextInt();
        int FA = scanner.nextInt();
        int CA = scanner.nextInt();

        int GB = scanner.nextInt();
        int EB = scanner.nextInt();
        int PB = scanner.nextInt();
        int FB = scanner.nextInt();
        int CB = scanner.nextInt();

        int puntsA = 3*GA + EA;
        int puntsB = 3*GB + EB;

        System.out.println(puntsA > puntsB || (puntsA == puntsB && FA-CA > FB-CB));
    }
}
