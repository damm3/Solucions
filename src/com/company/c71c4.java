package com.company;

import java.util.Scanner;

class LineSeparator {
    int size;

    void print(){
        for (int i = 0; i < size; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}

public class c71c4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LineSeparator lineSeparator = new LineSeparator();
        int n;
        while((n = scanner.nextInt()) != -1){
            System.out.format("Aqui sota hi surt una line de %d guions%n", n);
            lineSeparator.size = n;
            lineSeparator.print();
        }
    }
}
