/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Conductor
 */

package ejer7;

public class Conductor {

    private final String nombre;
    private final String licencia;
    private Vehiculo vehiculo; // Relación: un conductor maneja un vehículo

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // Se asigna el vehículo al conductor
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    // Muestra toda la info del conductor
    public void mostrarDatosCompletos() {
        System.out.println("\n INFORMACION DEL CONDUCTOR");
        System.out.println("Nombre: " + nombre);
        System.out.println("Licencia: " + licencia);

        if (vehiculo != null) {
            System.out.println(
                "Asignado a Vehiculo Patente: " 
                + vehiculo.getPatente() 
                + " (Acceso a traves del Conductor)"
            );
        } else {
            System.out.println("Vehículo: No tiene un vehículo asignado");
        }
    }
}
