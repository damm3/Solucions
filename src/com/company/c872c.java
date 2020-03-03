package com.company;

import java.util.Scanner;

class OLed {
    boolean state;

    void switchOn(){
        state = true;
    }

    void switchOff(){
        state = false;
    }

    void draw(){
        if(state){
            System.out.print("(*)");
        } else {
            System.out.print("( )");
        }
    }
}

class LedArray {
    OLed[] OLeds;

    LedArray(int size){
        OLeds = new OLed[size];
        for (int i = 0; i < size; i++) {
            OLeds[i] = new OLed();
        }
    }

    void switchLed(int position){
        if(OLeds[position].state){
            OLeds[position].switchOff();
        }else {
            OLeds[position].switchOn();
        }
    }

    void draw(){
        for(OLed OLed : OLeds){
            OLed.draw();
        }
    }
}

public class c872c {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LedArray ledArray = new LedArray(5);

        int position;
        while((position = scanner.nextInt()) != -1){
            ledArray.switchLed(position);

            ledArray.draw();
            System.out.println();
        }
    }
}
