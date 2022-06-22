package com.entregable;

import java.util.Scanner;

public class EntregableDatosArray {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String[] cadenas = new String[5];
        int i = 0;

        while( i<5 ) {
            System.out.println("Ingresa el nombre: " + (i+1));
            cadenas[i] = scanner.nextLine();
            if( cadenas[i].trim() == "" ) {
                System.out.println("Debes ingresar un nombre valido.");
            } else {
                i++;
            }
        }
        for( int j = 0; j<cadenas.length; j++ ) {
            System.out.println("El nombre numero "+ (j+1) +" es: " + cadenas[j]);
        }
    }
}
