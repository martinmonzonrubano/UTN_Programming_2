/**
 * Autor: Martin Monzon
 * Fecha: 22 nov 2025
 * Clase: DividirSeguro
 */
package parte2;

// División segura controlando división por cero
public class DividirSeguro {

    public static double dividir(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
            return 0;
        }
    }
}
