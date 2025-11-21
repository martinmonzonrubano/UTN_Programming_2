/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Main_ej3
 */
package ejer3;

import java.util.ArrayList;

public class Main_ej3 {

    public static void main(String[] args) {

        // Creo lista de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Macarena", 120000));
        empleados.add(new EmpleadoTemporal("Luis", 20, 3000));

        // Recorro todos los empleados
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " - Sueldo: " + e.calcularSueldo());

            // Distingo entre tipo de empleado usando pattern matching
            switch (e) {
                case EmpleadoPlanta empleadoPlanta -> {
                    System.out.println("Empleado de planta");
                    System.out.println("Sueldo base: " + empleadoPlanta.calcularSueldo());
                }
                case EmpleadoTemporal empleadoTemporal -> {
                    System.out.println("Empleado temporal");
                    System.out.println("Pago por día: " + empleadoTemporal.calcularSueldo());
                }
                default -> {
                }
            }
        }
    }
}
