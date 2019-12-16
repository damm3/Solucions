package com.company;

import java.util.Scanner;

public class dbcc6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ous = scanner.nextInt();

        System.out.println((ous%24==0 ? ous/24 : ous/24+1) + " " + (ous%24==0 ? 0 : 24-ous%24));
    }
}
