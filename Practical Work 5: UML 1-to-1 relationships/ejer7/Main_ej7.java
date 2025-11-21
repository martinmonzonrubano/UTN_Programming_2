/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Main
 */

package ejer7;

public class Main_ej7 {

    public static void main(String[] args) {

        // Motor creado para el vehículo
        Motor motorNuevo = new Motor("Nafta Premium", "XZL-55210");

        // Conductor cargado
        Conductor chofer = new Conductor("Federico Ramos", "9843127");

        // Vehículo con patente, modelo y motor
        Vehiculo miAuto = new Vehiculo(
            "KTD-781",
            "Honda Civic",
            motorNuevo
        );

        // Asignaciones cruzadas (relación bidireccional)
        miAuto.setConductor(chofer);
        chofer.setVehiculo(miAuto);

        // Mostramos todo
        miAuto.mostrarInfoCompleta();
        chofer.mostrarDatosCompletos();
    }
}

