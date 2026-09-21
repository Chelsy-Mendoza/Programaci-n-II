
package com.mycompany.hoja5ejercicio4;

public class Hoja5ejercicio4 {

    public static void main(String[] args) {

        HistorialNavegacion historial =
                new HistorialNavegacion();

        historial.visitarPagina("https://google.com");
        historial.visitarPagina("https://youtube.com");
        historial.visitarPagina("https://github.com");
        historial.visitarPagina("https://netbeans.apache.org");
        historial.visitarPagina("https://wikipedia.org");
        historial.visitarPagina("https://facebook.com");
        historial.visitarPagina("https://instagram.com");
        historial.visitarPagina("https://java.com");
        historial.visitarPagina("https://oracle.com");
        historial.visitarPagina("https://stackoverflow.com");
        historial.visitarPagina("https://openai.com");

        System.out.println("Historial:");

        historial.mostrarHistorial();
    }
}