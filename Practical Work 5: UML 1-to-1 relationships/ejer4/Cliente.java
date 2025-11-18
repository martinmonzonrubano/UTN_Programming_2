/**
 * Autor: Martin Monzon
 * Fecha: 18 nov 2025
 * Clase: Cliente
*/

package ejer4;

public class Cliente {
    private final String nombre;
    private final String dni;
    
    private TarjetaDeCredito tarjeta; // Puede ser null si no tiene tarjeta

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Asigno la tarjeta del cliente
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Muestro toda la info, incluyendo acceso a la tarjeta si existe
    public void mostrarDatosCompletos() {
        System.out.println("\n=== INFORMACION DEL CLIENTE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        
        if (tarjeta != null) {
            System.out.println("Tarjeta asociada: " + tarjeta.getNumero()
                + " (Acceso desde Cliente)");
        } else {
            System.out.println("Tarjeta: No tiene tarjeta asignada");
        }
    }
}
