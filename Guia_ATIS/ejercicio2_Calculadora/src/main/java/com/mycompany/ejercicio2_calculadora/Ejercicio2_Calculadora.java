/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_calculadora;

/**
 *
 * @author Vladimir Ascencio
 */


import java.util.Scanner;

public class Ejercicio2_Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            opcion = menu(entrada);

            switch (opcion) {
                case 1:
                    
                    System.out.println("=====================");
                    System.out.println("\t SUMA");
                    System.out.println("=====================");

                    double[] num = ingresarDatos(entrada, 2);
                    double suma = sumar(num[0], num[1]);
                    System.out.printf("\nLa suma total es: %.2f%n", suma);
                    
                    break;
                case 2:
                    System.out.println("=====================");
                    System.out.println("\t RESTA");
                    System.out.println("=====================");
                    
                    num = ingresarDatos(entrada, 2);
                    double resta = restar(num[0], num[1]);
                    System.out.printf("\nLa resta total es: %.2f%n", resta);
                    
                    break;
                case 3:
                    System.out.println("=====================");
                    System.out.println("\t MULTIPLICACION");
                    System.out.println("=====================");
                    
                    num = ingresarDatos(entrada, 2);
                    double multi = multiplicar(num[0], num[1]);
                    System.out.printf("\nLa multiplicacion total es: %.2f%n", multi);
                    
                    break;
                case 4:
                    System.out.println("=====================");
                    System.out.println("\t DIVISION");
                    System.out.println("====================="); 
                    
                    num = ingresarDatos(entrada, 2);
                    double divi = division(num[0], num[1]);
                    
                    if (num[1] !=0){
                        System.out.printf("\nLa division total es: %.2f%n", divi);
                    }
                    break;
                case 5:
                    System.out.println("=====================");
                    System.out.println("\t POTENCIA");
                    System.out.println("====================="); 
                    
                    num = ingresarDatos(entrada, 2);
                    double pot = potenciar(num[0], num[1]);
                    System.out.printf("\nLa potencia total es: %.2f%n", pot); 
                    
                    break;
                case 6:
                    System.out.println("=====================");
                    System.out.println("\t RAIZ CUADRADA");
                    System.out.println("=====================");    
                    
                    num = ingresarDatos(entrada, 1);
                    double raiz = raizCuadrada(num[0]);
                    
                    if (raiz != -1){
                        System.out.printf("\nLa raiz cuadrada de %.2f es %.2f%n", num[0], raiz);
                    }
                    
                    break;
                case 7:
                    System.out.println("\nFin del programa.");
                    break;
                default:
                    System.out.println("\nOpcion incorrecta.");
                    break;
            }
        } while (opcion != 7);

        entrada.close();
    }

    //  Metodos para evitar codigo repetido e innecesario 
    
    // Metodo para mostrar el menu y pedir la opcion
    public static int menu(Scanner entrada) {
        System.out.println("\n=====================");
        System.out.println("CALCULADORA AVANZADA");
        System.out.println("=====================");

        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Potencia");
        System.out.println("6. Raiz Cuadrada");
        System.out.println("7. Salir");

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


    //  Metodo para la suma
    public static double sumar(double a, double b) {
        return a + b;
    }

    
    //  Metodo para la resta
    public static double restar(double a, double b) {
        return a - b;
    }

    //  Metodo para la multiplicacion
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    
    //  Metodo para la division  
    public static double division(double a, double b) {
        // Si b es distinto a 0 procede la division      
        if (b != 0) {
            return a / b;
        }
        // Si no es asi se muestra el mensaje de error
        System.out.println("No se puede dividir un numero entre 0.");
        return 0;
    }

    
    //  Metodo para potenciar el primer numero con el segundo numero  
    public static double potenciar(double a, double b) {
        return Math.pow(a, b);
    }
    
    
    //  Metodo para calcular la raiz de un solo numero
    public static double raizCuadrada(double a){
        // Se verifica si el numero es negativo   
        if (a < 0){
            // Se muestra el mensaje de error
            System.out.print("\nNo se puede calcular la raiz de numeros negativos.");
            return -1;
        }
        // Si es positivo se calcula la raiz
        double raiz = Math.sqrt(a);
        return raiz;
    }

}