package com.company;

import java.util.Scanner;

public class e8b30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // nombre de linies de la imatge
        scanner.nextLine(); // descartem l'intro

        char[][] imatge = new char[n][];

        // llegim la imatge
        for (int i = 0; i < n; i++) {
            imatge[i] = scanner.nextLine().toCharArray();
        }

        int width = scanner.nextInt();  // factor d'escalat horitzontal
        int height = scanner.nextInt(); // factor d'escalat vertical

        for (int i = 0; i < imatge.length; i++) {
            for (int h = 0; h < height; h++) { // cada linia la repetim 'height' cops
                for (int j = 0; j < imatge[i].length; j++) {
                    for (int w = 0; w < width; w++) {  // cada columna la repetim 'width' cops
                        System.out.print(imatge[i][j]);
                    }
                }
                System.out.println();
            }
        }
    }
}

/*
9
_________________
`$$$$$$$$$$$$$$$'
 $$'`$'`$'`$'`$$
 $$bd$bd$bd$bd$$
 $$$$*"` `"*$$$$
 $$$`       `$$$
 $$[         ]$$
 $$[         ]$$
j$$[         ]$$$L
1 2


3
#..
.%.
..=
2 6



5
 ,od8888bn.      ,.od88bo,
d8P'   `*88bn. ,       `Y8b
88'      `*888b.        `D8
Y8b        ,`*Y8bn.    ,d8P
`*Y8bn,. ;     `*+88888P*'
1 3



9
_________________
`$$$$$$$$$$$$$$$'
 $$'`$'`$'`$'`$$
 $$bd$bd$bd$bd$$
 $$$$*"` `"*$$$$
 $$$`       `$$$
 $$[         ]$$
 $$[         ]$$
j$$[         ]$$$L
1 2

 */