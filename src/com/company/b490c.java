package com.company;

import java.util.Scanner;

public class b490c {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int bricks = scanner.nextInt();
        int lines = scanner.nextInt();

        System.out.print("-");
        for (int i = 0; i < bricks; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("-");
            }
            System.out.print("-");
        }
        System.out.println();

        for (int l = 0; l < lines; l++) {
            for (int h = 0; h < height; h++) {
                if(l%2==0) {
                    System.out.print("|");
                }
                for (int b = 0; b < bricks; b++) {
                    for (int w = l%2==1 && b==0?width/2:0; w < width; w++) {
                        System.out.print(" ");
                    }
                    System.out.print("|");
                }
                System.out.println();
            }

            System.out.print("-");
            for (int j = 0; j < bricks; j++) {
                for (int k = 0; k < width; k++) {
                    System.out.print("-");
                }
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
