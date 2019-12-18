package com.company;

import java.util.Scanner;

public class f605c {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p1 = 0;
        int p2 = 0;

        String j = scanner.next();
        while (!j.equals("END")){

            if (j.equals("@%") || j.equals("#@") || j.equals("%#")){
                p1++;
            } else if (j.equals("@#") || j.equals("#%") || j.equals("%@")){
                p2++;
            }

            j=scanner.next();
        }

        if (p1 > p2){
            System.out.println(1);
        } else if (p2 > p1){
            System.out.println(2);
        } else {
            System.out.println("-");
        }
    }
}
