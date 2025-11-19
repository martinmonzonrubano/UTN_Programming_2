/**
 * Autor: Martin Monzon
 * Fecha: 19 nov 2025
 * Clase: Cliente
 */

package ejer6;

public class Cliente {
    
    private final String nombre;
    private final String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Devuelvo solo el nombre si hace falta acceder desde otra clase
    public String getNombre() {
        return nombre;
    }

    // Devuelvo la info lista para imprimir
    public String mostrarInfo() {
        return "Cliente: " + nombre + " | Telefono: " + telefono;
    }
}
