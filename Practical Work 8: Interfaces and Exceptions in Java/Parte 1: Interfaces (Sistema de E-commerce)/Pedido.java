/**
 * Autor: Martin Monzon
 * Fecha: 22 nov 2025
 * Clase: Pedido
 */
package ejer8;

import java.util.ArrayList;

// Un pedido contiene productos y calcula su total
public class Pedido implements Pagable {

    private final ArrayList<Producto> productos;
    private String estado;
    private Notificable cliente; // A quién notifico los cambios

    public Pedido() {
        productos = new ArrayList<>();
        this.estado = "Creado";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void setCliente(Notificable cliente) {
        this.cliente = cliente;
    }

    // Cambio de estado y notifico al cliente
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) cliente.notificar("Estado cambiado a: " + nuevoEstado);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
}
