/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3_numerosprimos;

/**
 *
 * @author Vladimir Ascencio
 */

import java.util.Scanner;

public class Ejercicio3_numerosPrimos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do{
            opcion = menu(entrada);
            
            switch(opcion){
                case 1:
                    System.out.println("\n=====================");
                    System.out.println("\t NUMERO PRIMO");
                    System.out.println("=====================");

                    double[] num = ingresarDatos(entrada, 1);
                    int np = (int) num[0];
                    
                    if (numPrimo(np)){
                        System.out.println("El numero " + np + " es primo.");
                    }else{
                        System.out.println("El numero " + np + " no es primo.");
                    }

                    break;
                case 2:
                    System.out.print("\nFin del programa.");
                    break;
                default:
                    System.out.print("\nOpcion invalida.");
                    break;
        }
            
        }while(opcion != 2);
        
    }
    
    // Metodo para mostrar el menu y pedir la opcion
    public static int menu(Scanner entrada) {
        System.out.println("\n=====================");
        System.out.println("NUMEROS PRIMOS");
        System.out.println("=====================");

        System.out.println("1. Verificar numero");
        System.out.println("2. Salir");

        System.out.print("\nSelecciona una opcion: ");
        return entrada.nextInt();
    }
    
    
    // Metodo para ingresar los numeros deseados, 2 y 1 en este caso
    public static double[] ingresarDatos(Scanner entrada, int cant){
        // Se guardan en una lista double
        double[] numeros = new double[cant];
        
        // Se itera por cada uno de ellos solicitandolos
        for (int i = 0; i < cant; i++){
            System.out.print("\nIngresa el " + (i + 1) + "° numero: ");
            // Se guarda cada numero iterado en la lista
            numeros[i] = entrada.nextDouble();
        }
        return numeros;
    }


    // Metodo para verificar si un numero es primo o no
    public static boolean numPrimo(int a){
        if (a < 2){
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(a); i++){
            if (a % i == 0){
                return false;
            }
        }
        return true;   
    }
    
}