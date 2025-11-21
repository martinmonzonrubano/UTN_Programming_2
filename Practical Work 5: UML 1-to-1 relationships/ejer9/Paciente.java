/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Paciente
 */
package ej9;

public class Paciente {

    private final String nombre;
    private final String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String mostrarInfo() {
        return "Paciente: " + nombre + ", Obra Social: " + obraSocial;
    }
}
