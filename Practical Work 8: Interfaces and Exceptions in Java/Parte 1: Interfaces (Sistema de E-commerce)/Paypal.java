/**
 * Autor: Martin Monzon
 * Fecha: 22 nov 2025
 * Clase: PayPal
 */
package ejer8;

// PayPal no tiene descuento
public class PayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando con PayPal... Total: $" + monto);
    }
}
