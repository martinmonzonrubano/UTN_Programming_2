/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Empleado
 */
package ejer3;

// Clase abstracta para empleados
public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto para calcular sueldo
    public abstract double calcularSueldo();
}
