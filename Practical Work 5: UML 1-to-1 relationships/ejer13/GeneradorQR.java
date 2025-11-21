/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: GeneradorQR
 */
package ej13;

public class GeneradorQR {

    public void generar(String valor, Usuario usuario) {

        CodigoQR nuevoQR = new CodigoQR(valor, usuario);

        System.out.println("GeneradorQR ha creado un CodigoQR en su metodo generar().");
        nuevoQR.mostrarQR();
    }
}
