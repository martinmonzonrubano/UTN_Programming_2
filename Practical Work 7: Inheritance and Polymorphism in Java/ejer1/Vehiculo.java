/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Vehiculo
 */
package ejer1;

public class Vehiculo {
    private final String marca;
    private final String modelo;
    private final int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    // Muestra info genérica del vehículo
    public String mostrarInfo() {
        return marca + " " + modelo + " (" + anio + ")";
    }
}
