package com.company;

import java.util.Scanner;

public class b6e14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        for(String paraula; !(paraula = scanner.next()).equals("END");){
            if(paraula.equals("class")){
                count++;
            }
        }
        System.out.println(count);
    }
}
