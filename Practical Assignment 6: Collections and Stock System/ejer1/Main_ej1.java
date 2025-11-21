/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Main_ej1
 */
package ejer1;

public class Main_ej1 {

    public static void main(String[] args) {

        // Creo el inventario donde voy guardando todos los productos
        Inventario inv = new Inventario();

        // Cargo productos de distintas categorías
        Producto p1 = new Producto("PX01", "Yerba Mate 1kg", 1950.0, 40, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("PX02", "Monitor 27'' 144Hz", 289000.0, 12, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("PX03", "Campera Invierno", 65000.0, 18, CategoriaProducto.ROPA);
        Producto p4 = new Producto("PX04", "Licuadora Industrial", 89000.0, 7, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("PX05", "Arvejas 350g", 980.0, 85, CategoriaProducto.ALIMENTOS);

        // Agrego al inventario
        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        System.out.println("\n Listado completo de productos ");
        inv.listarProductos();

        // Busco un producto
        System.out.println("\n Buscar producto con ID 'PX03' ");
        Producto busc = inv.buscarProductoPorId("PX03");
        if (busc != null) busc.mostrarInfo();
        else System.out.println("Producto no encontrado.");

        // Filtro por categoría
        System.out.println("\n Filtrar por categoria ROPA ");
        for (Producto p : inv.filtrarPorCategoria(CategoriaProducto.ROPA))
            p.mostrarInfo();

        // Elimino un producto puntual
        System.out.println("\n Eliminar producto PX02...");
        boolean eliminado = inv.eliminarProducto("PX02");
        System.out.println("Eliminado: " + eliminado);

        System.out.println("Listado tras eliminacion:");
        inv.listarProductos();

        // Actualizo un stock
        System.out.println("\n Actualizar stock de PX01 a 25 ");
        boolean actualizado = inv.actualizarStock("PX01", 25);
        System.out.println("Actualizado: " + actualizado);
        Producto prodPX01 = inv.buscarProductoPorId("PX01");
        if (prodPX01 != null) prodPX01.mostrarInfo();

        // Total de stock
        System.out.println("\n Total de stock disponible");
        System.out.println(inv.obtenerTotalStock());

        // Producto con mayor stock
        System.out.println("\n Producto con mayor stock ");
        Producto mayor = inv.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // Filtro por precio
        System.out.println("\n Productos con precio entre $1000 y $3000 ");
        for (Producto p : inv.filtrarProductosPorPrecio(1000.0, 3000.0))
            p.mostrarInfo();

        // Muestro las categorías del enum
        System.out.println("\n Categorias disponibles ");
        inv.mostrarCategoriasDisponibles();

        System.out.println("\n Proceso Finalizado ");
    }
}
