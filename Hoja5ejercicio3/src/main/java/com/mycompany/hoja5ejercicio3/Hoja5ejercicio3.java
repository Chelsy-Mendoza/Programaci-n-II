
package com.mycompany.hoja5ejercicio3;

import java.util.ArrayList;
public class Hoja5ejercicio3 {

     
        public static double calcularPromedio(ArrayList<Double> ventas) {

        double suma = 0;

        for (double venta : ventas) {
            suma += venta;
        }

        return suma / ventas.size();
    }

    public static double calcularMaximo(ArrayList<Double> ventas) {

        double maximo = ventas.get(0);

        for (double venta : ventas) {

            if (venta > maximo) {
                maximo = venta;
            }
        }

        return maximo;
    }

    public static double calcularMinimo(ArrayList<Double> ventas) {

        double minimo = ventas.get(0);

        for (double venta : ventas) {

            if (venta < minimo) {
                minimo = venta;
            }
        }

        return minimo;
    }

    public static int diasSobrePromedio(ArrayList<Double> ventas) {

        double promedio = calcularPromedio(ventas);
        int contador = 0;

        for (double venta : ventas) {

            if (venta > promedio) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        ArrayList<Double> ventas = new ArrayList<>();

        ventas.add(500.0);
        ventas.add(750.0);
        ventas.add(900.0);
        ventas.add(400.0);
        ventas.add(1000.0);
        ventas.add(650.0);

        System.out.println("Promedio: Q" + calcularPromedio(ventas));
        System.out.println("Máximo: Q" + calcularMaximo(ventas));
        System.out.println("Mínimo: Q" + calcularMinimo(ventas));
        System.out.println("Días sobre el promedio: "
                + diasSobrePromedio(ventas));
    }
}
    

