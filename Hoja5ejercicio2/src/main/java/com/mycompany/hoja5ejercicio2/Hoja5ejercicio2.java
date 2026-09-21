

package com.mycompany.hoja5ejercicio2;
import java.util.ArrayList;

public class Hoja5ejercicio2 {

    public static ArrayList<Empleado> buscarEmpleados(
        ArrayList<Empleado> empleados,
        String departamento) {

        ArrayList<Empleado> resultado = new ArrayList<>();

        for (Empleado empleado : empleados) {
            if (empleado.getDepartamento().equalsIgnoreCase(departamento)
                && empleado.getSalario() > 5000) {
                resultado.add(empleado);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Ana", "Ventas", 6000));
        empleados.add(new Empleado("Luis", "IT", 4500));
        empleados.add(new Empleado("Carlos", "Ventas", 7000));

        ArrayList<Empleado> filtrados = buscarEmpleados(empleados, "Ventas");

        for (Empleado e : filtrados) {
            System.out.println(e);
        }
    }
}
