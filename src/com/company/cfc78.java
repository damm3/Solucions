package com.company;

import java.util.Scanner;

public class cfc78 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineNum = 1;
        for(String l; !(l = scanner.nextLine()).equals("END");){
            System.out.printf("%2d | %s\n", lineNum, l);
            lineNum++;
        }
    }
}
