/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Auto
 */
package ejer3;

public class Auto extends Vehiculo {
    private final int puertas;
    private final String equipamiento;

    public Auto(String marca, String modelo, int anio, int puertas, String equipamiento) {
        super(marca, modelo, anio);
        this.puertas = puertas;
        this.equipamiento = equipamiento;
    }

    public int getPuertas() {
        return puertas;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    // Muestra info completa del auto
    @Override
    public String mostrarInfo() {
        return "Auto: " + getMarca() + " " + getModelo() +
               " (" + getAnio() + "), Puertas: " + puertas +
               ", Equipamiento: " + equipamiento;
    }
}
