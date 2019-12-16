package com.company;

import java.util.Scanner;

public class cb246 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float h=scanner.nextFloat();
        float m=scanner.nextFloat();
        float s=scanner.nextFloat();

        float gh = 360*(h*60*60 + m*60 + s)/(12*60*60);
        float gm = 360*(m*60 + s)/(60*60);
        float gs = 360*s/60;

        System.out.println(gh);
        System.out.println(gm);
        System.out.println(gs);
    }
}
