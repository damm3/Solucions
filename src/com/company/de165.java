package com.company;

import java.util.Scanner;

public class de165 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edat = scanner.nextInt();
        String sexe = scanner.next();
        boolean arracades = scanner.nextBoolean();
        boolean benVestit = scanner.nextBoolean();
        boolean vip = scanner.nextBoolean();

        String sol = "";
        if(vip){
            sol = "ENTRA";
        } else {
            if(edat<18){
                sol = "NO ENTRA";
            } else {
                if(!benVestit){
                    sol = "NO ENTRA";
                }else{
                    if(sexe.equals("dona")){
                        sol = "ENTRA";
                    }else if(!arracades){
                        sol = "ENTRA";
                    }else{
                        sol = "NO ENTRA";
                    }
                }
            }
        }
        System.out.println(sol);
    }
}
