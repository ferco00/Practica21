/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ciclomedia;

/**
 *
 * @author Luis Fernando
 */
import java.util.Scanner;

public class CicloMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;

        while (true) {
            System.out.println("----- CicloMedia -----");
            System.out.println("1. Ingresar número");
            System.out.println("2. Calcular media");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 3) {
                System.out.println("Saliendo del programa...");
                break;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número: ");
                    int numero = scanner.nextInt();
                    suma += numero;
                    contador++;
                    break;
                case 2:
                    if (contador == 0) {
                        System.out.println("No se han ingresado números.");
                    } else {
                        double media = (double) suma / contador;
                        System.out.println("Conjunto de números ingresados: " + suma);
                        System.out.println("Media: " + media);
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

            System.out.println();
        }
    }
}