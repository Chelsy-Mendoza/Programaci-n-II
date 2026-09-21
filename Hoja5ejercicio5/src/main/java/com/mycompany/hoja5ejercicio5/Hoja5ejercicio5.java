
package com.mycompany.hoja5ejercicio5;
import java.util.ArrayList;
public class Hoja5ejercicio5{

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
                new Producto(1, "Protoboard", 5000, 5));

        productos.add(
                new Producto(2, "Resistencia", 100, 15));

        productos.add(
                new Producto(3, "Capacitor", 250, 7));

        productos.add(
                new Producto(4, "Inductores", 1500, 12));

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