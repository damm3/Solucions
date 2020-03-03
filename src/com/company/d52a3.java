package com.company;

import java.util.Locale;
import java.util.Scanner;

class Thermometer {
    float celsius;

    void printCelsius(){
        System.out.format("%7.2fC%n", celsius);
    }

    void printFahrenheit(){
        System.out.format("%7.2fF%n", celsius*1.8+32);
    }

    void printKelvin(){
        System.out.format("%7.2fK%n", celsius+273.15);
    }
}

public class d52a3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Thermometer thermometer1 = new Thermometer();
        Thermometer thermometer2 = new Thermometer();

        float a;
        while((a = scanner.nextFloat()) >= -273.1f) {
            thermometer1.celsius = a;
            thermometer2.celsius = scanner.nextFloat();

            System.out.println("Termometre 1");
            thermometer1.printCelsius();
            thermometer1.printFahrenheit();
            thermometer1.printKelvin();

            System.out.println("Termometre 2");
            thermometer2.printCelsius();
            thermometer2.printFahrenheit();
            thermometer2.printKelvin();

            System.out.println("--------");
        }
    }
}
