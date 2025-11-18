/**
 * Autor: Martin Monzon
 * Fecha: 18 nov 2025
 * Clase: Bateria
 */

package ej2;

public class Bateria {

    private final String modelo;
    private final int capacidad; // Capacidad en mAh

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    // Info simple de la batería
    public String mostrarInfo() {
        return "Bateria Modelo: " + modelo + ", Capacidad: " + capacidad + "mAh";
    }
}
