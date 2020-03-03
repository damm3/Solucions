package com.company;

import java.util.Locale;
import java.util.Scanner;

class AdvancedLineSeparator {
    int size;
    char charSeparator;
    void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(charSeparator);
        }
        System.out.println();
    }
}

public class d85a9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvancedLineSeparator lineSeparator = new AdvancedLineSeparator();

        String line;
        while(!(line = scanner.nextLine()).equals("__END__")) {
            lineSeparator.charSeparator = line.charAt(0);
            lineSeparator.size = scanner.nextInt();
            scanner.nextLine();

            System.out.format("Aqui sota apareix una linea de %s %s%n", lineSeparator.size,lineSeparator.charSeparator);
            lineSeparator.print();
        }
    }
}
