/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Main_ej8
 */

package ej8;

public class Main_ej8 {

    public static void main(String[] args) {

        // Creo un usuario que firmará el documento
        Usuario usuarioFirmante = new Usuario("Martin Monzon", "martinmonzon@gmail.com");
       
        // Creo el documento y dentro creo su FirmaDigital
        Documento contrato = new Documento(
            "Contrato Laboral", 
            "El presente documento establece:", 
            "MM MONZON",
            "27-11-2025", 
            usuarioFirmante 
        );
        
        // Muestro toda la información
        contrato.mostrarInfoCompleta();
    }
}
