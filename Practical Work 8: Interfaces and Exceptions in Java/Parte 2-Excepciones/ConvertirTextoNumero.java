/**
 * Autor: Martin Monzon
 * Fecha: 22 nov 2025
 * Clase: ConvertirTextoNumero
 */
package parte2;

// Convierte texto a número controlando errores
public class ConvertirTextoNumero {

    public static int convertir(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto no es un número válido.");
            return 0;
        }
    }
}
