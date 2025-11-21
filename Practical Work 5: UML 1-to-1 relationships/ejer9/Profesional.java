/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Profesional
 */
package ej9;

public class Profesjonal {

    private final String nombre;
    private final String especialidad;

    public Profesjonal(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String mostrarInfo() {
        return "Profesional: " + nombre + ", Especialidad: " + especialidad;
    }
}
