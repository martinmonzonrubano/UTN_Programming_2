/**
 * Autor: Martin Monzon
 * Fecha: 17 nov 2025
 * Clase: Main_ej2
 */

package ej2;

public class Main_ej2 {

    public static void main(String[] args) {

        // Creo la batería del celular
        Bateria miBateria = new Bateria("BL-45", 3500);

        // Creo el usuario
        Usuario usuarioA = new Usuario("Zoe Alvarez", "45336888");

        // Creo el celular que va a usar Zoe
        Celular celularZoe = new Celular("3435596728", "Xiaomi", "Note 7", miBateria);

        // Relación bidireccional
        celularZoe.setUsuario(usuarioA);
        usuarioA.setCelular(celularZoe);

        // Muestro toda la info
        celularZoe.mostrarInfoCompleta();
        usuarioA.mostrarDatosCompletos();
    }
}
