package com.company;

import java.util.Scanner;

public class b3e2c {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dia = scanner.nextInt();
        int mes = scanner.nextInt();

        String nord = "";
        String sud = "";

        if (dia >= 21 && mes == 12 || mes >= 1 && mes <= 2 || dia < 21 && mes == 3) {
            nord = "Hivern";
            sud = "Estiu";
        } else if (dia >= 21 && mes == 3 || mes >= 4 && mes <= 5 || dia < 21 && mes == 6) {
            nord = "Primavera";
            sud = "Tardor";
        } else if (dia >= 21 && mes == 6 || mes >= 7 && mes <= 8 || dia < 23 && mes == 9) {
            nord = "Estiu";
            sud = "Hivern";
        } else {
            nord = "Tardor";
            sud = "Primavera";
        }

        System.out.println(nord);
        System.out.println(sud);
    }
}
