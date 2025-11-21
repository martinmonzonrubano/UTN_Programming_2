/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Render
 */
package ej14;

public class Render {

    private final String formato;
    private final Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public void mostrarEstado() {
        System.out.println("Render finalizado en formato: " + formato);
        if (proyecto != null) {
            System.out.println("Basado en: " + proyecto.mostrarInfo());
        }
    }
}
