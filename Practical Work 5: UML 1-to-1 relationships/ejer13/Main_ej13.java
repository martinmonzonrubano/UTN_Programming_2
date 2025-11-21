/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Main_ej13
 */
package ej13;

public class Main_ej13 {

    public static void main(String[] args) {

        Usuario usuarioAPP = new Usuario("Matias Roldan", "mroldan@hotmail.com");
       
        GeneradorQR generador = new GeneradorQR();
       
        generador.generar("url:app.com/mr908", usuarioAPP);
    }
}
