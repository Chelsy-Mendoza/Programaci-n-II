
package com.mycompany.hoja4.newpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.print("¿Cuántas notas va a ingresar? ");
        int n = scanner.nextInt();

        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
            suma += nota;
        }

        double promedio = notas.isEmpty() ? 0 : suma / notas.size();
        System.out.printf("\nLista de notas: %s\n", notas);
        System.out.printf("El promedio final es: %.2f\n", promedio);
    }
}