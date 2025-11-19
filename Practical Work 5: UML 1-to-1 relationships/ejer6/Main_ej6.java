/**
 * Autor: Martin Monzon
 * Fecha: 19 nov 2025
 * Clase: Main_ej6
 */

package ejer6;

public class Main_ej6 {

    public static void main(String[] args) {
        
        // Creo un cliente de ejemplo
        Cliente clienteNuevo = new Cliente("Mora Benitez", "3435596728");
        
        // Creo una mesa del restaurante
        Mesa mesaOcupada = new Mesa(12, 6);
        
        // Creo una reserva completa con cliente y mesa
        Reserva reservaNoche = new Reserva(
            "22-12-2025", 
            "22:00", 
            clienteNuevo, 
            mesaOcupada
        );

        // Muestro toda la info
        reservaNoche.mostrarInfoCompleta();
    }
}
