/**
 * Autor: Martin Monzon
 * Fecha: 22 nov 2025
 * Clase: TarjetaCredito
 */
package parte1;

// Pago con tarjeta que aplica un 10% de descuento
public class TarjetaCredito implements Pago, PagoConDescuento {

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando con tarjeta... Monto final: $" + monto);
    }
}
