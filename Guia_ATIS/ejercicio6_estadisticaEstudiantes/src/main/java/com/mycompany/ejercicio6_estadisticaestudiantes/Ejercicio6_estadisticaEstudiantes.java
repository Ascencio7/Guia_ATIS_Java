/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6_estadisticaestudiantes;

/**
 *
 * @author Vladimir Ascencio
 */

import java.util.Scanner;

public class Ejercicio6_estadisticaEstudiantes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while(true){
            System.out.println("\n======================");
            System.out.println("\tESTADISTICA DE LOS ESTUDIANTES");
            System.out.println("\n======================");

            System.out.print("\nIngresa el numero de estudiantes: ");
            int n = entrada.nextInt();

            if (n > 0){

                double suma = 0; // Variable para almacenar la suma
                double[] notas = new double[n]; // Arreglo para almacenar las notas

                // Iterar para ingresar las notas de los estudiantes
                for (int i = 1; i <= n; i++){
                    System.out.print("\nIngresa la nota del estudiante " + i + ": ");
                    notas[i - 1] = entrada.nextDouble(); // Almacena la nota en el arreglo
                    // Se suma la nota a la acumuladora
                    suma += notas[i - 1];
                }

                // Mostrar el promedio, nota mayor y menor
                double promedio = suma / n; // Se calcula el promedio

                System.out.printf("\nEl promedio general es %.2f%n", promedio);

                // Se encuentra la nota mayor y menor
                double notaMayor = Math.max(suma/n, notas[0]);
                double notaMenor = Math.min(suma/n, notas[0]);

                // Se itera el arreglo para encontrar el mayor y menor
                for (int i = 1; i < notas.length; i++){
                    if (notas[i] > notaMayor){
                        notaMayor = notas[i];
                    }
                    if (notas[i] < notaMenor){
                        notaMenor = notas[i];
                    }
                }

                System.out.printf("La nota mayor es %.2f%n", notaMayor);
                System.out.printf("La nota menor es %.2f%n", notaMenor);

                break;
            }else{
                System.out.print("\nEl numero debe ser positivo.");
            }
        }
        entrada.close();
    }
}