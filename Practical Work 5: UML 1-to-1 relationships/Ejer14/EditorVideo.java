/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: EditorVideo
 */
package ej14;

public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render nuevoRender = new Render(formato, proyecto);

        System.out.println(" Comenzado el proceso de exportacion...");
        nuevoRender.mostrarEstado();
    }
}
