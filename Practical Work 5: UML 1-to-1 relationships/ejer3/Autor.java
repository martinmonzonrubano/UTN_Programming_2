/**
 * Autor: Martin Monzon
 * Fecha: 18 nov 2025
 * Clase: Autor
 */

package ejer3;

public class Autor {
    private final String nombre;
    private final String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    // Devuelvo un texto ya formateado para no repetir código en otros lados.
    public String mostrarInfo() {
        return "Autor: " + nombre + " (" + nacionalidad + ")";
    }
}
