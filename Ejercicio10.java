
package com.mycompany.hoja4.newpackage;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        Random random = new Random();

        // Genera 20 números aleatorios entre 1 y 100
        for (int i = 0; i < 20; i++) {
            numerosAleatorios.add(random.nextInt(100) + 1);
        }

        System.out.println("Los 20 números aleatorios generados son:");
        System.out.println(numerosAleatorios);
    }
}