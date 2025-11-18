/**
 * Autor: Martin Monzon
 * Fecha: 18 nov 2025
 * Clase: TarjetaDeCredito
*/

package ejer4;

public class TarjetaDeCredito {
    
    private final String numero;
    private final String fechaVencimiento;
    private final Banco banco; // Banco emisor (relación unidireccional)
    
    private Cliente cliente; // Relación bidireccional

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco; 
    }

    // Asigno el cliente titular de esta tarjeta
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String getNumero() {
        return numero;
    }
    
    // Muestro TODOS los datos de la tarjeta, incluidos su banco y su titular
    public void mostrarInfoCompleta() {
        System.out.println("\n=== INFORMACION DE LA TARJETA ===");
        System.out.println("Numero: " + numero);
        System.out.println("Vencimiento: " + fechaVencimiento);
        
        if (banco != null) {
            System.out.println("Emitida por: " + banco.mostrarInfo());
        }
        
        // Solo accedo si hay un cliente asignado
        if (cliente != null) {
            System.out.println("Titular: " + cliente.getNombre()
                + " (Acceso desde TarjetaDeCredito)");
        } else {
            System.out.println("Titular: No asignado");
        }
    }
}
