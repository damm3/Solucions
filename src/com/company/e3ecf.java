package com.company;

import java.util.Scanner;

public class e3ecf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lletra = scanner.next();

        int punts = 0;
        switch (lletra){
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "L":
            case "N":
            case "R":
            case "S":
            case "T":
                punts = 1;
                break;
            case "D":
            case "G":
                punts = 2;
                break;
            case "B": case "C": case "M": case "P":
                punts = 3;
                break;
            case "F": case "H": case "V": case "W": case "Y":
                punts = 4;
                break;
            case "K":
                punts = 5;
                break;
            case "J": case "X":
                punts = 8;
                break;
            case "Q": case "Z":
                punts = 10;
                break;
        }

        System.out.println(punts);
    }
}
