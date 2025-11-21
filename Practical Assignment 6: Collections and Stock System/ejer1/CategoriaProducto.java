/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: CategoriaProducto
 */
package ejer1;

public enum CategoriaProducto {
    ALIMENTOS("Alimentos y productos comestibles"),
    ELECTRONICA("Dispositivos y articulos electronicos"),
    ROPA("Prendas y vestimenta"),
    HOGAR("Articulos para el hogar");

    private final String descripcion;

    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
