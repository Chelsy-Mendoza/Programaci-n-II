

package com.mycompany.hoja5ejerccicio1;
import java.util.ArrayList;

public class Hoja5ejerccicio1 

 {

    public static void aumentarPrecios(
            ArrayList<Producto> productos,
            double porcentaje) {

        for (Producto producto : productos) {

            if (producto.getStock() < 10) {

                double aumento =
                        producto.getPrecio() * porcentaje / 100;

                double nuevoPrecio =
                        producto.getPrecio() + aumento;

                producto.setPrecio(nuevoPrecio);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Producto> productos =
                new ArrayList<>();

        productos.add(
                new Producto(1, "Laptop", 5000, 5));

        productos.add(
                new Producto(2, "Mouse", 100, 15));

        productos.add(
                new Producto(3, "Teclado", 250, 7));

        productos.add(
                new Producto(4, "Monitor", 1500, 12));

        System.out.println("ANTES DEL AUMENTO:");

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        aumentarPrecios(productos, 10);

        System.out.println("\nDESPUÉS DEL AUMENTO:");

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}