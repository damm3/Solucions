package com.company;

import java.util.Scanner;


class Date {
    int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

        if(month > 12){
            month = 12;
        } else if(month < 1){
            month = 1;
        }

        if(day < 1){
            day = 1;
        } else if(day > 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)){
            day = 31;
        } else if(day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)){
            day = 30;
        } else if(day > 28){
            day = 28;
        }
    }
}

public class e679d {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Date date = new Date(22, 3, 2001);

        System.out.println();
    }
}
