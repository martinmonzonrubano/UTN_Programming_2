/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Vehiculo
 */

package ej7;

public class Vehiculo {

    private final String patente;
    private final String modelo;

    private final Motor motor; // Composición: un vehículo tiene un motor

    private Conductor conductor; // Asociación: un vehículo puede tener un conductor

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    // Se asigna un conductor al vehículo
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public String getPatente() {
        return patente;
    }

    // Muestra toda la info completa del vehículo
    public void mostrarInfoCompleta() {
        System.out.println(" INFORMACION DEL VEHICULO ");
        System.out.println("Patente: " + patente + ", Modelo: " + modelo);

        if (motor != null) {
            System.out.println("Tiene: " + motor.mostrarInfo());
        }

        if (conductor != null) {
            System.out.println(
                "Conductor Asignado: " 
                + conductor.getNombre() 
                + " (Acceso a traves del Vehiculo)"
            );
        }
    }
}
