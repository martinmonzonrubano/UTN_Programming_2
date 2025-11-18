/**
 * Autor: Martin Monzon
 * Fecha: 18 nov 2025
 * Clase: Main_ej3
 */

package ejer3;

public class Main_ej3 {

    public static void main(String[] args) {

        // Creo un autor con nombre y nacionalidad
        Autor autorNuevo = new Autor("Gabriel Garcia Marquez", "Colombiana");
        
        // Creo la editorial con nombre y dirección
        Editorial editorialNueva = new Editorial("Sudamericana", "Av. Corrientes 532");

        // Creo el libro pasando todos los objetos anteriores
        Libro libroMagico = new Libro(
            "Cien anios de soledad", 
            "978-0307474474", 
            autorNuevo, 
            editorialNueva
        );

        // Llamo al método que muestra todo junto
        libroMagico.mostrarInfoCompleta();
    }
}
