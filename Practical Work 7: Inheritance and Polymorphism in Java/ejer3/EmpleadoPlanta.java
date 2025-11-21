/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: EmpleadoPlanta
 */
package ejer3;

// Empleado de planta con sueldo fijo
public class EmpleadoPlanta extends Empleado {
    private final double sueldoBase;

    public EmpleadoPlanta(String nombre, double sueldoBase) {
        super(nombre);
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }
}
