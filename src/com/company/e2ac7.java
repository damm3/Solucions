package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

class Seguro implements Comparable<Seguro> {
    float precio;
    boolean lunas;
    boolean asistencia;

    public Seguro(float precio, boolean lunas, boolean asistencia) {
        this.precio = precio;
        this.lunas = lunas;
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "Seguro{" +
                "precio=" + precio +
                ", lunas=" + lunas +
                ", asistencia=" + asistencia +
                '}';
    }

    @Override
    public int compareTo(Seguro otro) {
        if(precio > otro.precio){
            return -1;
        }
        if(precio < otro.precio){
            return 1;
        }
//        if(lunas && lunas)

        return 0;
    }
}

class Comparador {

    Seguro[] comparar(Seguro[] seguros){
        Arrays.sort(seguros);
        return seguros;
    }
}
public class e2ac7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Comparador comparador = new Comparador();

        Seguro[] comparacion = comparador.comparar(new Seguro[]{
                new Seguro(345, true, true),
                new Seguro(345, false, true),
                new Seguro(345, true, false),
                new Seguro(500, true, true)
        });

        System.out.println();
    }
}
