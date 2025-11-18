/**
 * Autor: Martin Monzon
 * Fecha: 18 nov 2025
 * Clase: Banco
*/

package ejer4;

public class Banco {
    
    private final String nombre;
    private final String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Devuelvo la info formateada para imprimirla desde otras clases
    public String mostrarInfo() {
        return "Banco: " + nombre + ", CUIT: " + cuit;
    }
}
