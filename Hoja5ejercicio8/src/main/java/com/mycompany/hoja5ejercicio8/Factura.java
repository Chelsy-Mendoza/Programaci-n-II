
package com.mycompany.hoja5ejercicio8;

public class Factura {

    private int idFactura;
    private String cliente;
    private double monto;

    public Factura(int idFactura, String cliente, double monto) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        this.monto = monto;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }
}