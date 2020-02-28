package com.company;

import java.util.Locale;
import java.util.Scanner;


class Fighter {
    String name;
    float strength;
    float speed;
    float agility;

    Fighter(String name, float strength, float speed, float agility) {
        this.name = name;
        this.strength = strength;
        this.speed = speed;
        this.agility = agility;
    }

    float getSum(){
        return strength + speed + agility;
    }
}

class Fight {
    Fighter winner(Fighter f1, Fighter f2){
        float b1 = f1.getSum();
        float b2 = f2.getSum();

        if(b1 > b2){
            return f1;
        } else if(b2 > b1){
            return f2;
        }
        return null;
    }
}

public class ebeac {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Fighter f1 = new Fighter(scanner.next(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
        Fighter f2 = new Fighter(scanner.next(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());

        System.out.println(f1.getSum());
        System.out.println(f2.getSum());
        Fighter winner = new Fight().winner(f1, f2);

        System.out.println(winner == null ? "DOUBLE KO" : winner.name);
    }
}
