/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Figura
 */
package ejer2;

// Clase abstracta que representa una figura geométrica
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto para calcular área
    public abstract double calcularArea();
}
