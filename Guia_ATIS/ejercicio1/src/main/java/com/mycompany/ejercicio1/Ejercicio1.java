/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author Vladimir Ascencio
 */

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
          
          Scanner entrada = new Scanner(System.in);
          
          double saldo = 500.00;
          int opcion;
          
          do{
              
              System.out.println("=====================");
              System.out.print("CAJERO AUTOMATICO");
              System.out.println("=====================");

              System.out.print("\n1. Consultar saldo");
              System.out.print("2. Depositar");
              System.out.print("3. Retirar");
              System.out.print("4. Salir");
              
              System.out.print("\nSelecciona una opcion: ");
              opcion = entrada.nextInt();
              
              switch(opcion){
                  case 1:
                      System.out.printf("\nSaldo actual: %.2f%n", saldo);
                      break;
                  case 2:
                      System.out.print("\nIngrese la cantidad a depositar: $");
                      double deposito = entrada.nextDouble();
                      if (deposito > 0){
                          saldo += deposito;
                          System.out.printf("\nDeposito exitoso. Nuevo saldo: %.2f%n", saldo);
                      }else{
                          System.out.printf("\nCantidad invalida");
                      }
                      break;
                  case 3:
                      System.out.printf("\nIngrese la cantidad a retirar: $");
                      double retiro = entrada.nextDouble();
                      if(retiro > 0 && retiro <= saldo){
                          saldo -= retiro;
                          System.out.printf("\nRetiro exitoso. Nuevo saldo: %.2f%n", saldo);
                      }else{
                          System.out.print("\nCantidad invalida o fondos insuficientes");
                      }
                      break;
                  case 4:
                      System.out.print("\nGracias por usar el servicio.");
                      break;
                  default:
                      System.out.print("\nOpcion invalida. Intenta de nuevo.");
                      
                      
              }
              System.out.print("");
          }while(opcion != 4);
    }
}