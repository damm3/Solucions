package com.company;

import java.util.Scanner;

public class a116a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float pt1 = scanner.nextFloat();
        float pe1 = scanner.nextFloat();
        float ex1 = scanner.nextFloat();

        float pt2 = scanner.nextFloat();
        float pe2 = scanner.nextFloat();
        float ex2 = scanner.nextFloat();

        float pt3 = scanner.nextFloat();
        float pe3 = scanner.nextFloat();
        float ex3 = scanner.nextFloat();
        
        System.out.println(
                (
                    pe1/pt1 >= 0.75f && ex1 >= 4 || pe1/pt1 >= 0.5f && ex1 >= 5 || ex1 > 7
                )
                &&
                (
                    pe2/pt2 >= 0.75f && ex2 >= 4 || pe2 == pt2 || pe2/pt2 >= 0.5f && ex2 >=5
                )
                &&
                (
                    pe3 == pt3 && ex3 >= 5
                )
        );
    }
}
