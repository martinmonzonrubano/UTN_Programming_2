/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Inventario
 */
package ejer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventario {

    private final ArrayList<Producto> productos;

    public Inventario() {
        // Acá guardo todos los productos del sistema
        this.productos = new ArrayList<>();
    }

    // Agrego un producto al inventario
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // Recorro y muestro todo
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    // Busco producto por su ID
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    // Elimino el producto usando un iterator (forma segura)
    public boolean eliminarProducto(String id) {
        Iterator<Producto> it = productos.iterator();
        while (it.hasNext()) {
            Producto p = it.next();
            if (p.getId().equalsIgnoreCase(id)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    // Actualizo la cantidad disponible
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    // Filtro por categoría
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> salida = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) salida.add(p);
        }
        return salida;
    }

    // Total del stock sumado
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) total += p.getCantidad();
        return total;
    }

    // Devuelvo el producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;

        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayor.getCantidad()) mayor = p;
        }
        return mayor;
    }

    // Filtro según rango de precios
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> lista = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) lista.add(p);
        }
        return lista;
    }

    // Muestro todos los valores del enum
    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorias disponibles:");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println("- " + c + ": " + c.getDescripcion());
        }
    }
}
