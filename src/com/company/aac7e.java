package com.company;

import java.util.Locale;
import java.util.Scanner;

class FunctionGame {
    int function1(int param){
        return param+1;
    }

    int function2(int param){
        return param-3;
    }

    int function3(int param){
        return param*10;
    }

    int function4(int param){
        return param*2-1;
    }

    int function5(int param){
        return 6;
    }

    int function6(int param1, int param2){
        return param1+param2;
    }

    int function7(int param1, int param2){
        if(param1 > param2)
            return param1;
        return param2;
    }

    int function8(int param1, int param2, int param3){
        if(param1 < param2 && param1 < param3)
            return param1;
        if(param2 < param3)
            return param2;
        return param3;
    }
}

public class aac7e {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        FunctionGame functionGame = new FunctionGame();

        String functionName = scanner.next();

        if("function1".equals(functionName)){
            for (int i = 5; i-->0;) {
                int param = scanner.nextInt();
                int returnValue = functionGame.function1(param);
                System.out.println(param + " -> " + returnValue);
            }
        } else if("function2".equals(functionName)){
            for (int i = 5; i-->0;) {
                int param = scanner.nextInt();
                int returnValue = functionGame.function2(param);
                System.out.println(param + " -> " + returnValue);
            }
        } else if("function3".equals(functionName)){
            for (int i = 5; i-->0;) {
                int param = scanner.nextInt();
                int returnValue = functionGame.function3(param);
                System.out.println(param + " -> " + returnValue);
            }
        } else if("function4".equals(functionName)){
            for (int i = 5; i-->0;) {
                int param = scanner.nextInt();
                int returnValue = functionGame.function4(param);
                System.out.println(param + " -> " + returnValue);
            }
        } else if("function5".equals(functionName)){
            for (int i = 5; i-->0;) {
                int param = scanner.nextInt();
                int returnValue = functionGame.function5(param);
                System.out.println(param + " -> " + returnValue);
            }
        }  else if("function6".equals(functionName)){
            for (int i = 5; i-->0;) {
                int param1 = scanner.nextInt();
                int param2 = scanner.nextInt();
                int returnValue = functionGame.function6(param1, param2);
                System.out.println(param1 + "," + param2 + " -> " + returnValue);
            }
        } else if("function7".equals(functionName)){
            for (int i = 7; i-->0;) {
                int param1 = scanner.nextInt();
                int param2 = scanner.nextInt();
                int returnValue = functionGame.function7(param1, param2);
                System.out.println(param1 + "," + param2 + " -> " + returnValue);
            }
        } else if("function8".equals(functionName)){
            for (int i = 7; i-->0;) {
                int param1 = scanner.nextInt();
                int param2 = scanner.nextInt();
                int param3 = scanner.nextInt();
                int returnValue = functionGame.function8(param1, param2, param3);
                System.out.println(param1 + "," + param2 + "," + param3 + " -> " + returnValue);
            }
        }
    }
}
