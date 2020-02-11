package com.company;

import java.util.Scanner;

public class b28ef {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int producto = 1;
        int total = 0;

        int n = scanner.nextInt();
        while(n != -1){
            if(n%2 == 0){
                suma += n;
            } else {
                producto *= n;
            }
            total++;

            n = scanner.nextInt();
        }

        System.out.println(suma);
        System.out.println(producto);
        System.out.println(total);
    }
}
