/**
 * Autor: Martin Monzon
 * Fecha: 19 nov 2025
 * Clase: Reserva
 */

package ejer6;

public class Reserva {
    
    private final String fecha;
    private final String hora;
    private final Cliente cliente; 
    private final Mesa mesa; 

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente; 
        this.mesa = mesa; 
    }

    // Muestro toda la informacion de la reserva
    public void mostrarInfoCompleta() {
        System.out.println("\n=== INFORMACION DE LA RESERVA ===");
        System.out.println("Fecha: " + fecha + " | Hora: " + hora);
        
        if (cliente != null) {
            System.out.println("A nombre de: " + cliente.mostrarInfo());
        }
        
        if (mesa != null) {
            System.out.println("Mesa Asignada: " + mesa.mostrarInfo());
        }
    }
}
