package com.company;

import java.util.Scanner;

public class ba4d0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = scanner.nextInt();


        if(v == 1 | v == 2){
            System.out.println("petit");
        } else if(v == 3 || v == 4){
            System.out.println("mitja");
        }else if(v == 5 || v == 6 || v == 7){
            System.out.println("gran");
        }else if(v == 8 || v==9 || v==10){
            System.out.println("molt gran");
        }else{
            System.out.println("mida incorrecta");
        }


//        // amb switch
//        switch (v){
//            case 1: case 2:
//                System.out.println("petit");
//                break;
//            case 3: case 4:
//                System.out.println("mitja");
//                break;
//            case 5: case 6: case 7:
//                System.out.println("gran");
//                break;
//            case 8: case 9: case 10:
//                System.out.println("molt gran");
//                break;
//            default:
//                System.out.println("mida incorrecta");
//        }
    }
}
