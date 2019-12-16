package com.company;

import java.util.Scanner;

public class e31b2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String lletra = scanner.next();

            if(lletra.equals("a") || lletra.equals("e") || lletra.equals("i") || lletra.equals("o") || lletra.equals("u")){
                System.out.println(lletra);
            }
        }
    }
}
