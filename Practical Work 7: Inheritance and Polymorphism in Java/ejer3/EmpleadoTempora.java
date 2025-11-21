/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: EmpleadoTemporal
 */
package ejer3;

// Empleado temporal que cobra por días trabajados
public class EmpleadoTemporal extends Empleado {
    private final int diasTrabajados;
    private final double pagoPorDia;

    public EmpleadoTemporal(String nombre, int diasTrabajados, double pagoPorDia) {
        super(nombre);
        this.diasTrabajados = diasTrabajados;
        this.pagoPorDia = pagoPorDia;
    }

    @Override
    public double calcularSueldo() {
        return diasTrabajados * pagoPorDia;
    }
}
