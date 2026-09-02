
package com.mycompany.hoja4.newpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String entrada;

        System.out.println("Ingresa datos (escribe 'fin' para terminar):");
        while (true) {
            System.out.print("> ");
            entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }
            lista.add(entrada);
        }

        System.out.println("Datos ingresados: " + lista);
    }
}