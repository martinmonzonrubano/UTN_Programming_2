/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Contribuyente
 */
package ej12;

public class Contribuyente {

    private final String nombre;
    private final String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String mostrarInfo() {
        return "Contribuyente: " + nombre + ", CUIL: " + cuil;
    }
}
