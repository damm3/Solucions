package com.company;

import java.util.Scanner;

public class f1dc8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] alfabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] text = scanner.nextLine().toCharArray();

        for (int i = 0; i < text.length; i++){
            for (int j = 0; j < alfabet.length; j++){
                if (text[i] == alfabet[j]){
                    System.out.println(j);
                }
            }
        }
    }
}
