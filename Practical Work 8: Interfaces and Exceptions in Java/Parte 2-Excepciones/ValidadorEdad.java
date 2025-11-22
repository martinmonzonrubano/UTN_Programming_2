/**
 * Autor: Martin Monzon
 * Fecha: 22 nov 2025
 * Clase: ValidadorEdad
 */
package parte2;

// Valida edad y lanza excepción personalizada si no es válida
public class ValidadorEdad {

    public static void validar(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad fuera del rango permitido.");
        }
    }
}
