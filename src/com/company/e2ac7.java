package com.company;

import java.util.Locale;
import java.util.Scanner;

class Producto {
    String descripcion;
    float precio;

    Producto(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String toString() {
        return "Producto{" +
                "descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}

class Descuento {
    float valor;

    Descuento(float valor) {
        this.valor = valor;
    }

    void aplicar(Producto producto) {
        producto.precio -= valor/100*producto.precio;
    }
}

public class e2ac7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Producto producto = new Producto(scanner.next(), scanner.nextFloat());

        System.out.println(producto);

        Descuento descuento = new Descuento(scanner.nextFloat());

        descuento.aplicar(producto);

        System.out.println(producto);
    }
}

/*
producto1 10
15


 */