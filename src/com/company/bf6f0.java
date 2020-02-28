package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

class FunctionGame2 {
    boolean function1(int param){
        return param%2 == 0;
    }

    boolean function2(float param){
        return param >= 0;
    }

    String function3(int param1, String param2){
        String result = "";
        for (int i = 0; i < param1; i++) {
            result += param2;
        }
        return result;
    }

    int function4(int[] param){
        int suma = 0;
        for (int i = 0; i < param.length; i++) {
            suma += param[i];
        }
        return suma;
    }

    int[] function5(int[] param){
        int[] result = new int[param.length];
        for (int i = 0; i < param.length; i++) {
            result[i] = param[i]*2;
        }
        return result;
    }

    String[] function6(int param1, boolean param2){
        String[] result = new String[param1];
        for (int i = 0; i < param1; i++) {
            if(param2) result[i] = "cierto";
            else result[i] = "falso";
        }
        return result;
    }

    int function7(String[] param1){
        int count = 0;
        for (int i = 0; i < param1.length; i++) {
            if(param1[i].equals("java")){
                count++;
            }
        }
        return count;
    }

    int[] function8(int param1, int param2, int param3){
        int[] result = new int[3];
        if(param1 < param2 && param1 < param3) {
            result[0] = param1;
            if(param2 < param3){
                result[1] = param2;
                result[2] = param3;
            }else{
                result[1] = param3;
                result[2] = param2;
            }
        } else if(param2 < param3) {
            result[0] = param2;
            if(param1 < param3){
                result[1] = param1;
                result[2] = param3;
            }else{
                result[1] = param3;
                result[2] = param1;
            }
        } else {
            result[0] = param3;
            if(param2 < param1){
                result[1] = param2;
                result[2] = param1;
            }else{
                result[1] = param1;
                result[2] = param2;
            }
        }
        return result;
    }
}

public class bf6f0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        FunctionGame2 fg2 = new FunctionGame2();

        String functionName = scanner.next();

        switch (functionName) {
            case "function1":
                for (int i = 5; i-- > 0; ) {
                    int param = scanner.nextInt();
                    boolean returnValue = fg2.function1(param);
                    System.out.println(param + " -> " + returnValue);
                }
                break;
            case "function2":
                for (int i = 6; i-- > 0; ) {
                    float param = scanner.nextFloat();
                    boolean returnValue = fg2.function2(param);
                    System.out.println(param + " -> " + returnValue);
                }
                break;
            case "function3":
                for (int i = 4; i-- > 0; ) {
                    int param1 = scanner.nextInt();
                    String param2 = scanner.next();
                    String returnValue = fg2.function3(param1, param2);
                    System.out.println(param1 + "," + param2 + " -> " + returnValue);
                }
                break;
            case "function4":
                for (int i = 4; i-- > 0; ) {
                    int size = scanner.nextInt();
                    int[] param = new int[size];
                    for (int j = 0; j < size; j++) {
                        param[j] = scanner.nextInt();
                    }
                    int returnValue = fg2.function4(param);
                    System.out.println(Arrays.toString(param) + " -> " + returnValue);
                }
                break;
            case "function5":
                for (int i = 4; i-- > 0; ) {
                    int size = scanner.nextInt();
                    int[] param = new int[size];
                    for (int j = 0; j < size; j++) {
                        param[j] = scanner.nextInt();
                    }
                    int[] returnValue = fg2.function5(param);
                    System.out.println(Arrays.toString(param) + " -> " + Arrays.toString(returnValue));
                }
                break;
            case "function6":
                for (int i = 4; i-- > 0; ) {
                    int param1 = scanner.nextInt();
                    boolean param2 = scanner.nextBoolean();
                    String[] returnValue = fg2.function6(param1, param2);
                    System.out.println(param1 + "," + param2 + " -> " + Arrays.toString(returnValue));
                }
                break;
            case "function7":
                for (int i = 5; i-- > 0; ) {
                    int size = scanner.nextInt();
                    String[] param = new String[size];
                    for (int j = 0; j < size; j++) {
                        param[j] = scanner.next();
                    }
                    int returnValue = fg2.function7(param);
                    System.out.println(Arrays.toString(param) + " -> " + returnValue);
                }
                break;
            case "function8":
                for (int i = 9; i-- > 0; ) {
                    int param1 = scanner.nextInt();
                    int param2 = scanner.nextInt();
                    int param3 = scanner.nextInt();
                    int[] returnValue = fg2.function8(param1, param2, param3);
                    System.out.println(param1 + "," + param2 + "," + param3 + " -> " + Arrays.toString(returnValue));
                }
                break;
        }
    }
}
