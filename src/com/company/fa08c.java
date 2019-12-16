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

        System.out.println(
            (
                // tamany
                (axf-bxf <= axm-bxm && ayf-byf <= aym-bym)
                ||
                (axf-bxf <= aym-bym && ayf-byf <= axm-bxm)
            )
            &&
            (
                // proporcio
                (axf-bxf)/(ayf-byf) == (axm-bxm)/(aym-bym)
                ||
                (axf-bxf)/(ayf-byf) == (aym-bym)/(axm-bxm)
            )
        );
    }
}
