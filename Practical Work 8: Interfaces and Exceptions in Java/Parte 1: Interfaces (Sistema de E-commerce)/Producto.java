/**
 * Autor: Martin Monzon
 * Fecha: 22 nov 2025
 * Clase: Producto
 */
package ejer8;

// Un producto simple con nombre y precio
public class Producto implements Pagable {

    private final String nombre;
    private final double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularTotal() {
        return precio;
    }
}
