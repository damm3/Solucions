package com.company;

import java.util.Scanner;

public class a2ae3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidad = scanner.nextInt();

        // 500
        int monedas = cantidad/500;
        if (monedas == 1) {
            System.out.println("1 moneda de 500");
        } else if (monedas > 1){
            System.out.println(monedas + " monedes de 500");
        }
        cantidad = cantidad%500;

        // 100
        monedas = cantidad/100;
        if (monedas == 1) {
            System.out.println("1 moneda de 100");
        } else if (monedas > 1){
            System.out.println(monedas + " monedes de 100");
        }
        cantidad = cantidad%100;

        // 50
        monedas = cantidad/50;
        if (monedas == 1) {
            System.out.println("1 moneda de 50");
        } else if (monedas > 1){  // no puede ser nunca mas de 1 de 50, ya que por cada dos de 50 cojes una de 100
            System.out.println(monedas + " monedes de 50");
        }
        cantidad = cantidad%50;

        // 5
        monedas = cantidad/5;
        if (monedas == 1) {
            System.out.println("1 moneda de 5");
        } else if (monedas > 1){
            System.out.println(monedas + " monedes de 5");
        }
        cantidad = cantidad%5;

        // 1
        if(cantidad == 1){
            System.out.println("1 moneda de 1");
        } else if (cantidad > 1){
            System.out.println(cantidad + " monedes de 1");
        }
    }
}
