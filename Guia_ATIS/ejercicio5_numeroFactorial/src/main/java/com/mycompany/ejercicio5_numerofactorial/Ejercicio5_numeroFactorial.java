/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5_numerofactorial;

/**
 *
 * @author Vladimir Ascencio
 */

import java.util.Scanner;

public class Ejercicio5_numeroFactorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Numero factorial ingresado por el usuario
        System.out.println("\n============");
        System.out.println("\tFACTORIAL");
        System.out.println("\n============");

        while(true){ 
            // Declarar la variable
            System.out.print("\nIngrese el numero del factorial a calcular: ");
            int f = entrada.nextInt();

            if (f > 0){
                // Calcular el factorial
                int factorial = 1;
                for (int i = 1; i <= f; i++){
                    factorial *= i;
                    System.out.println("\nEl factorial de " + i + " es: " + factorial);
                }
                break;
            }else{
                System.out.print("\nEl numero debe ser positivo.");
            }
        }

        entrada.close();
    }
}