
package com.mycompany.hoja4.newpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(51, 8, 22, 9, 16, 1, 41, 13));
        ArrayList<Integer> pares = new ArrayList<>();

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }

        System.out.println("Lista completa: " + numeros);
        System.out.println("Números pares filtrados: " + pares);
    }
}