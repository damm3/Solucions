package com.company;

import java.util.Scanner;

public class bf99e {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] text = scanner.nextLine().toCharArray();
        char lletra = scanner.nextLine().charAt(0);

        boolean trobada = false;
        for (int i=0; i<text.length; i++){
            if(text[i] == lletra){
                trobada = true;
                System.out.println(i);
                break;
            }
        }

        if(!trobada){
            System.out.println("-1");
        }
    }
}
