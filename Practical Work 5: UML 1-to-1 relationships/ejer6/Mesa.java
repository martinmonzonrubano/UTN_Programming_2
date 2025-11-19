/**
 * Autor: Martin Monzon
 * Fecha: 19 nov 2025
 * Clase: Mesa
 */

package ejer6;

public class Mesa {
    
    private final int numero;
    private final int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    // Por si tengo que saber que mesa es
    public int getNumero() {
        return numero;
    }
    
    // Info lista para mostrar
    public String mostrarInfo() {
        return "Mesa Nº " + numero + " (Capacidad: " + capacidad + " personas)";
    }
}
