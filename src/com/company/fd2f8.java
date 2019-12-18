package com.company;

import java.util.Scanner;

public class fd2f8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int horaIni = s.nextInt();
        int minutsIni = s.nextInt();
        int segonsIni = s.nextInt();

        float tarifa = s.nextFloat();
        float diners = s.nextFloat();

        int segonsFi = horaIni*3600 + minutsIni*60 + segonsIni +  (int) (diners*tarifa*60);

        int hores = segonsFi / 3600;
        int minuts = (segonsFi - hores*3600) / 60;
        int segons = segonsFi - hores*3600 - minuts*60;

        System.out.println(hores + ":" + minuts + ":" + segons);
    }
}
