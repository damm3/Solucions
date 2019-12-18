package com.company;

import java.util.Scanner;

public class d71d4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("MENU:\n1.-SUMAR\n2.-RESTAR\n3.-MULTIPLICAR\n4.-DIVIDIR\nEsculli una opcio:");

        int op = sc.nextInt();

        if (op==1){
            System.out.println(n1+n2);
        } else if (op==2){
            System.out.println(n1-n2);
        } else if (op==3){
            System.out.println(n1*n2);
        } else if (op==4){
            System.out.println(n1/n2);
        }


        // NOTA: sustituir los if-else por un switch
    }
}
