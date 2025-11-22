/**
 * Autor: Martin Monzon
 * Fecha: 22 nov 2025
 * Clase: PagoConDescuento
 */
package ejer8;

// Contrato para medios de pago que permiten descuento
public interface PagoConDescuento {
    double aplicarDescuento(double monto);
}
