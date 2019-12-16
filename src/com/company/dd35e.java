package com.company;

import java.util.Scanner;

public class dd35e {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int prestatgeries = scanner.nextInt();
        int prestatgesXprestatgeria = scanner.nextInt();
        int llibresXprestatge = scanner.nextInt();

        int llibres = scanner.nextInt();


        System.out.println(prestatgeries * prestatgesXprestatgeria * llibresXprestatge >= llibres);
    }
}
