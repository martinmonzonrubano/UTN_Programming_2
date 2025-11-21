/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Main
 */

package ejer7;

public class Main_ej7 {

    public static void main(String[] args) {

        // Motor creado para el vehículo
        Motor motorNuevo = new Motor("Diesel", "ABC-98765");

        // Conductor cargado
        Conductor chofer = new Conductor("Julia Perez", "1124931");

        // Vehículo con patente, modelo y motor
        Vehiculo miAuto = new Vehiculo(
            "GHA-324",
            "Toyota Corolla",
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
