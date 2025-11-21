/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Motor
 */

package ej7;

public class Motor {

    private final String tipo;
    private final String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    // Devuelve la info formateada del motor
    public String mostrarInfo() {
        return "Motor Tipo: " + tipo + ", Serie: " + numeroSerie;
    }
}
