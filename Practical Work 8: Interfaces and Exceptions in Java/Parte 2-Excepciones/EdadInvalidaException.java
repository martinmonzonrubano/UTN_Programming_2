/**
 * Autor: Martin Monzon
 * Fecha: 22 nov 2025
 * Clase: EdadInvalidaException
 */
package parte2;

// Excepción personalizada para validar edades
public class EdadInvalidaException extends Exception {

    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
