package com.company;

import java.util.Scanner;

public class fa08c {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // foto
        float axf = s.nextFloat();
        float ayf = s.nextFloat();
        float bxf = s.nextFloat();
        float byf = s.nextFloat();

        // marc
        float axm = s.nextFloat();
        float aym = s.nextFloat();
        float bxm = s.nextFloat();
        float bym = s.nextFloat();

        float baseFoto = axf-bxf;
        float alturaFoto = ayf-byf;

        float baseMarc = axm-bxm;
        float alturaMarc = aym-bym;

        System.out.println(

                // tamany
                baseFoto*alturaFoto <= baseMarc*alturaMarc

                &&

                //proporció
                (
                    baseFoto/alturaFoto == baseMarc/alturaMarc
                    ||
                    baseFoto/alturaFoto == alturaMarc/baseMarc
                )
        );
    }
}
