
package com.mycompany.hoja5ejercicio8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Hoja5ejercicio8 {

 public static Map<String, Double> generarResumen(
            ArrayList<Factura> facturas) {

        Map<String, Double> resumen = new HashMap<>();

        for (Factura factura : facturas) {

            String cliente = factura.getCliente();
            double monto = factura.getMonto();

            if (resumen.containsKey(cliente)) {

                resumen.put(
                        cliente,
                        resumen.get(cliente) + monto
                );

            } else {

                resumen.put(cliente, monto);
            }
        }

        return resumen;
    }

    public static void main(String[] args) {

        ArrayList<Factura> facturas = new ArrayList<>();

        facturas.add(new Factura(1, "Juan", 1500));
        facturas.add(new Factura(2, "Maria", 2500));
        facturas.add(new Factura(3, "Juan", 1000));
        facturas.add(new Factura(4, "Pedro", 3000));
        facturas.add(new Factura(5, "Maria", 500));

        Map<String, Double> resumen =
                generarResumen(facturas);

        System.out.println("RESUMEN DE FACTURACIÓN:");

        for (Map.Entry<String, Double> entrada : resumen.entrySet()) {

            System.out.println(
                    entrada.getKey()
                    + " → Q"
                    + entrada.getValue()
            );
        }
    }
}
