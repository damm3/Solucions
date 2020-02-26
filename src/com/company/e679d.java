package com.company;

class Level {
    int value;
    int max;
}

class Enemy {
    Level health;
    Level weapon;

    Enemy(String type){
        health = new Level();
        weapon = new Level();

        switch (type) {
            case "guerrero":
                health.max = health.value = 50;
                weapon.max = weapon.value = 60;
                break;
            case "amazona":
                health.max = health.value = 40;
                weapon.max = weapon.value = 70;
                break;
            case "brujo":
                health.max = health.value = 30;
                weapon.max = weapon.value = 80;
                break;
        }
    }
}

public class e679d {

    public static void main(String[] args) {

        Enemy guerrero = new Enemy("guerrero");
        Enemy amazona = new Enemy("amazona");
        Enemy brujo = new Enemy("brujo");

        System.out.println("GUERRERO  " +
                "Health: " + guerrero.health.value + "/" + guerrero.health.max + "   " +
                "Weapon: " + guerrero.weapon.value + "/" + guerrero.weapon.max);

        System.out.println("AMAZONA   " +
                "Health: " + amazona.health.value + "/" + amazona.health.max + "   " +
                "Weapon: " + amazona.weapon.value + "/" + amazona.weapon.max);

        System.out.println("BRUJO     " +
                "Health: " + brujo.health.value + "/" + brujo.health.max + "   " +
                "Weapon: " + brujo.weapon.value + "/" + brujo.weapon.max);

    }
}
