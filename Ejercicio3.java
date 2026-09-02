
package com.mycompany.hoja4.newpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        
        System.out.print("¿Cuántos nombres deseas ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres.add(scanner.nextLine());
        }

        System.out.println("\nLista de nombres registrados:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }
    }
}
