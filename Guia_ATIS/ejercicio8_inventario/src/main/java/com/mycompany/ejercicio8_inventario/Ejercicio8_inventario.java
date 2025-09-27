/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8_inventario;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Vladimir Ascencio
 */


public class Ejercicio8_inventario {

    static ArrayList<String> productos = new ArrayList<>();
    static  ArrayList<Double> precios = new ArrayList<>();
    static ArrayList<Integer> cantidades = new ArrayList<>();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do { 
            System.out.println("\nINVENTARIO VLADI");
            System.out.println("1. Agregar producto.");
            System.out.println("2. Mostrar productos.");
            System.out.println("3. Total de inventario.");
            System.out.println("4. Salir.");

            System.out.print("\nIngresa una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    agregarProducto(entrada);
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    totalInventario();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (opcion != 4);

        entrada.close();
    }

    // Metodo para Agregar el producto
    //#region Agregar Producto
    public static void agregarProducto(Scanner entrada){

        System.out.print("\nNombre del producto: ");
        String nombreProducto = entrada.next();

        System.out.print("Precio del producto: $");
        double precioProducto = entrada.nextDouble();

        System.out.print("Cantidad: ");
        int cantProducto = entrada.nextInt();

        productos.add(nombreProducto);
        precios.add(precioProducto);
        cantidades.add(cantProducto);

        System.out.println("\nProducto agregado exitosamente.");
    }
    //#endregion


    // Metodo para Mostrar los productos
    //#region Mostrar Productos
    public static void mostrarProductos(){
        if(productos.isEmpty()){
            System.err.println("\nNo hay productos en el inventario.");
        }else{
            System.out.println("\nProductos del inventario:\n");
            for (int i = 0; i < productos.size(); i++){
                System.out.println("Producto: " + productos.get(i));
                System.out.println("Precio: $" + precios.get(i));
                System.out.println("Cantidad: " + cantidades.get(i));
                System.out.println("-------------------------");
            }
        }
    }
    //#endregion


    // Metodo para calcular el total del inventario
    //#region Calcular Total
    public static void totalInventario(){
        
        if (productos.isEmpty()){
            System.out.print("\nNo hay productos en el inventario.");
        }else{
            double total = 0;
            for (int i = 0; i < productos.size(); i++){
                total += precios.get(i) * cantidades.get(i);
            }
            System.out.printf("\nEl total del inventario es de: $%.2f%n\n", total);
        }
    }
    //#endregion

}