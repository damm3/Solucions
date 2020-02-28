package com.company;

import java.util.Locale;
import java.util.Scanner;

class Bike {
    int speed;

    public Bike(int speed) {
        this.speed = speed;
    }
}

class Race {
    Bike[] bikes;

    Bike fastest(){
        Bike fastest = null;
        for (int i = 0; i < bikes.length; i++) {
            if(fastest == null || fastest.speed < bikes[i].speed){
                fastest = bikes[i];
            }
        }
        return fastest;
    }
}

public class dbb58 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Race race = new Race();

        int numBikes = scanner.nextInt();
        race.bikes = new Bike[numBikes];

        for (int i = 0; i < numBikes; i++) {
            race.bikes[i] = new Bike(scanner.nextInt());
        }

        Bike fastest = race.fastest();

        System.out.println(fastest == null ? "No bikes" : fastest.speed);
    }
}
