package com.company;

import java.util.Scanner;

public class be233 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String paraula = s.nextLine();

        // 97=='a'   122=='z'

        int k = s.nextInt()%(123-97);

        char l1 = paraula.charAt(0);
        char l2 = paraula.charAt(1);
        char l3 = paraula.charAt(2);
        char l4 = paraula.charAt(3);


        System.out.print((char) ((l1 + k -97)%(123-97)+97));
        System.out.print((char) ((l2 + k -97)%(123-97)+97));
        System.out.print((char) ((l3 + k -97)%(123-97)+97));
        System.out.print((char) ((l4 + k -97)%(123-97)+97));
    }
}
