/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4_fibonacci;

/**
 *
 * @author Vladimir Ascencio
 */

import java.util.Scanner;

public class Ejercicio4_Fibonacci {

    public static void main(String[] args) {
        // Serie Fibonacci ingresada por n del usuario
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n=====================");
        System.out.println("\tFIBONACCI");
        System.out.println("=====================");

        while (true) {
            System.out.print("\nIngrese un numero entero positivo: ");
            
            if (entrada.hasNextInt()) {
                int n = entrada.nextInt();
                
                if (n > 0) {
                    int a = 0;
                    int b = 1;

                    System.out.println("\nSerie Fibonacci:\n");

                    for (int i = 0; i < n; i++) {
                        System.out.print(a + " ");
                        int s = a + b;
                        a = b;
                        b = s;
                    }
                    break;
                } else {
                    System.out.println("Error: El numero debe ser positivo.");
                }
                
            } else {
                System.out.println("Error: Entrada invalida. Por favor, ingrese un numero entero positivo.");
                entrada.next();
            }
        }

        entrada.close();
    }
}