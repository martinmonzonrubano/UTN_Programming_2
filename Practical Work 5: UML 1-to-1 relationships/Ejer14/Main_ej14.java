/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Main_ej14
 */
package ej14;

public class Main_ej14 {

    public static void main(String[] args) {

        Proyecto proyectoFinal = new Proyecto("Spot Publicitario", 3);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MKV H.265", proyectoFinal);
    }
}
