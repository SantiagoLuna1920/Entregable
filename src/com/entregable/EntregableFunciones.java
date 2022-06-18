package com.entregable;

import java.util.Scanner;

public class EntregableFunciones {
    public static void main(String[] args) {

        int number;
        double result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del producto de tipo entero: ");

        number = scanner.nextInt();


        System.out.println("Precio del producto con el iva incluido");
        System.out.println("iva estandar en colombia, 19%");

        result = precioProductoIva(number);

        System.out.println("El precio del producto junto a su iva es de: " + result);

    }
    static double precioProductoIva(int number) {
        return (number*0.19) + number;
    }
}
