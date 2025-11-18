/**
 * Autor: Martin Monzon
 * Fecha: 18 nov 2025
 * Clase: Editorial
 */

package ejer3;

public class Editorial {
    
    private final String nombre;
    private final String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Igual que en Autor: devuelvo la info lista para imprimir.
    public String mostrarInfo() {
        return "Editorial: " + nombre + ", Dir: " + direccion;
    }
}
