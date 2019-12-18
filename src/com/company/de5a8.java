package com.company;

import java.util.Scanner;

public class de5a8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota = scanner.nextFloat();

        if(nota < 5){
            System.out.println("INSUFICIENT");
        } else if(nota < 6){
            System.out.println("SUFICIENT");
        } else if(nota < 7){
            System.out.println("BE");
        } else if(nota < 8.5f){
            System.out.println("NOTABLE");
        } else if(nota < 10){
            System.out.println("EXCEL.LENT");
        } else {
            System.out.println("MATRICULA");
        }
    }
}
