/**
 * Autor: Martin Monzon
 * Fecha: 22 nov 2025
 * Clase: Main_parte1
 */
package parte1;

public class Main_parte1 {

    public static void main(String[] args) {

        // Creo algunos productos
        Producto p1 = new Producto("Mouse Gamer", 15000);
        Producto p2 = new Producto("Teclado Mecánico", 30000);
        Producto p3 = new Producto("Auriculares", 22000);

        // Armo un pedido
        Pedido pedido = new Pedido();
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        // Asigno cliente
        Cliente cli = new Cliente("Martín");
        pedido.setCliente(cli);

        // Calculo el total
        double total = pedido.calcularTotal();
        System.out.println("Total pedido: $" + total);

        // Pago con tarjeta con descuento
        TarjetaCredito tc = new TarjetaCredito();
        double totalConDesc = tc.aplicarDescuento(total);
        tc.procesarPago(totalConDesc);

        // Cambio de estado del pedido (notifica al cliente)
        pedido.cambiarEstado("En preparación");
        pedido.cambiarEstado("Enviado");
    }
}
