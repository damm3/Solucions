package com.company;

import java.util.Scanner;

public class abdf3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        scanner.nextLine();

        char[][] sprite = new char[height][];

        // llegim l'sprite
        for (int i = 0; i < height; i++) {
            sprite[i] = scanner.nextLine().toCharArray();
        }


        // mostrem l'spritesheet:

        // ORIGINAL
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < sprite[i].length; j++) {
                System.out.print(sprite[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        // HORITZONTAL
        for (int i = 0; i < height; i++) {
            for (int j = sprite[i].length-1; j >=0 ; j--) {
                System.out.print(sprite[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        // VERTICAL
        for (int i = height-1; i >= 0; i--) {
            for (int j = 0; j < sprite[i].length; j++) {
                System.out.print(sprite[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        // VERTICAL/HORITZONTAL
        for (int i = height-1; i >= 0; i--) {
            for (int j = sprite[i].length-1; j >=0 ; j--) {
                System.out.print(sprite[i][j]);
            }
            System.out.println();
        }
    }
}


/*
3
#..
#..
###


8
...###..
..###...
.#######
....###.
...###..
..###...
.###....
###.....















 */