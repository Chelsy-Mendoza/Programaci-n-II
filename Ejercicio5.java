
package com.mycompany.hoja4.newpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> personas = new ArrayList<>();

        personas.add("Vielka");
        personas.add("Isabella");
        personas.add("Marcela");
        personas.add("Jesus");

        System.out.print("Ingresa un nombre para buscar en la lista: ");
        String busqueda = scanner.nextLine();

        if (personas.contains(busqueda)) {
            System.out.println("¡El nombre '" + busqueda + "' Si se encuentra en la lista!");
        } else {
            System.out.println("El nombre '" + busqueda + "' NO está en la lista.");
        }
    }
}