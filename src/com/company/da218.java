package com.company;

import java.util.Scanner;

public class da218 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float km = scanner.nextFloat();
        float di = scanner.nextFloat();

        float preu = km*0.35f;

        if (di>7 && km > 800){
            preu = preu*0.7f;
        }

        System.out.format("%.2f", preu);
    }
}
