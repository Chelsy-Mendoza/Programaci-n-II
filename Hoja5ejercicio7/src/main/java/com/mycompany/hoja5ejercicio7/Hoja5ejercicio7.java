
package com.mycompany.hoja5ejercicio7;

public class Hoja5ejercicio7 {

    public static void main(String[] args) {

        CarritoCompras carrito = new CarritoCompras();

        carrito.agregarItem("Laptop", 1, 5000);
        carrito.agregarItem("Mouse", 2, 100);
        carrito.agregarItem("Teclado", 1, 250);

        // Producto repetido
        carrito.agregarItem("Mouse", 3, 100);

        System.out.println("PRODUCTOS DEL CARRITO:");

        carrito.mostrarItems();

        System.out.println("\nTOTAL: Q"
                + carrito.calcularTotal());

        carrito.eliminarItem("Teclado");

        System.out.println("\nDESPUÉS DE ELIMINAR TECLADO:");

        carrito.mostrarItems();

        System.out.println("\nTOTAL: Q"
                + carrito.calcularTotal());
    }
}