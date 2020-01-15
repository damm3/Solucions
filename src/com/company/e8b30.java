package com.company;

import java.util.Scanner;

public class e8b30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // nombre de linies de la imatge
        scanner.nextLine();


        char[][] imatge = new char[n][];

        // llegim la imatge
        for (int i = 0; i < n; i++) {
            imatge[i] = scanner.nextLine().toCharArray();
        }

        int width = scanner.nextInt();  // factor d'escalat horitzontal
        int height = scanner.nextInt(); // factor d'escalat vertical

        for (int i = 0; i < imatge.length; i++) {
            for (int h = 0; h < height; h++) {
                for (int j = 0; j < imatge[i].length; j++) {
                    for (int w = 0; w < width; w++) {
                        System.out.print(imatge[i][j]);
                    }
                }
                System.out.println();
            }
        }
    }
}
