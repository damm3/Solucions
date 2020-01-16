package com.company;

import java.util.Scanner;

public class f6471 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] alfabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        char[] text = scanner.nextLine().toCharArray();


        boolean estanTotesLesLletres = true;

        // anem mirant cada lletra de l'alfabet
        for (int i = 0; i < alfabet.length; i++) {
            boolean estaLaLletra = false;

            // busquem la lletra en el text
            for (int j = 0; j < text.length; j++) {
                if(alfabet[i] == text[j]){
                    estaLaLletra = true;
                }
            }

            // si no esta la lletra en el text, es que no estan totes les lletres
            if(!estaLaLletra){
                estanTotesLesLletres = false;
            }
        }

        System.out.println(estanTotesLesLletres);
    }
}
