
package com.mycompany.hoja5ejercicio2;

public class Empleado {

    private String nombre;
    private String departamento;
    private double salario;

    public Empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + ", Departamento: " + departamento
                + ", Salario: Q" + salario;
    }
}