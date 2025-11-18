/**
 * Autor: Martin Monzon
 * Fecha: 18 nov 2025
 * Clase: Main_ej4
 */

package ejer4;

public class Main_ej4 {

    public static void main(String[] args) {

        // Creo un banco emisor de ejemplo
        Banco bancoEmisor = new Banco("Banco Río del Sur", "30-99887766-5");
        
        // Creo un cliente cualquiera para probar la composición
        Cliente clienteNuevo = new Cliente("Julian Pereyra", "30123456");

        // Creo una tarjeta que pertenece al banco pero todavía no tiene cliente asignado
        TarjetaDeCredito tarjetaVisa = new TarjetaDeCredito(
            "4111-5522-8899-3322", 
            "05/2029", 
            bancoEmisor
        );
        
        // Asigno la tarjeta al cliente y viceversa (relación bidireccional)
        tarjetaVisa.setCliente(clienteNuevo); 
        clienteNuevo.setTarjeta(tarjetaVisa); 
        
        // Muestro primero la info de la tarjeta con su titular
        tarjetaVisa.mostrarInfoCompleta();
        
        // Y después la info del cliente con su tarjeta
        clienteNuevo.mostrarDatosCompletos();
    }
}
