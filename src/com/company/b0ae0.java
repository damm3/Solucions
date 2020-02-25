package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

class Car {
    String model;
    int topSpeed;
    float acceleration;
    float braking;
    float cornering;

    Car(String model, int topSpeed, float acceleration, float braking, float cornering) {
        this.model = model;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.braking = braking;
        this.cornering = cornering;
    }
}

public class b0ae0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int numCars = scanner.nextInt();
        scanner.nextLine();

        Car[] cars = new Car[numCars];

        for (int i = 0; i < numCars; i++) {
            cars[i] = new Car(scanner.nextLine(), scanner.nextInt(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
            scanner.nextLine();
        }

        Arrays.sort(cars, Comparator.comparingInt(a -> -a.topSpeed));
        for (int i = 0; i < numCars; i++) {
            System.out.format("%-20s  %4d  %4.2f  %4.2f  %4.2f %n", cars[i].model, cars[i].topSpeed, cars[i].acceleration, cars[i].braking, cars[i].cornering);
        }
    }
}

/*
6
PAGANI HUAYRA BC
370 2.29 28.9 1.66
BUGATTI CHIRON SPORT
420 2.40 28.9 1.60
HENNESSEY VENOM GT
434 2.70 25.9 1.67
JAGUAR C-X75
389 2.60 25.9 1.62
KOENIGSEGG AGERA RS
447 2.59 28.3 1.60
FERRARI FXX K EVO
370 2.50 24.3 1.48


4
CHEVROLET CAMARO SS
225 6 47.5 0.77
SHELBY COBRA GT500
222 6.19 48.7 0.8
DODGE CHARGER RT
210 6.44 48.1 0.72
LAMBORGHINI MIURA
299 5.9 34.1 0.92
 */