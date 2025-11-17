/**
 * Autor: Martin Monzon
 * Fecha: 17 nov 2025
 * Clase: Main_ej1
 */

public class Main_ej1 {

    public static void main(String[] args) {

        System.out.println("GESTION DE PASAPORTE Y TITULAR\n");

        // Creo al titular
        Titular titularPersona = new Titular("Mora Monzon", "45333999");

        // Creo el pasaporte
        Pasaporte pasaporteViajero = new Pasaporte(
                123456,
                "11-11-2025",
                "foto_mora.png",
                "PNG"
        );

        // Enlazo ambas entidades (relación bidireccional)
        pasaporteViajero.setTitular(titularPersona);
        titularPersona.setPasaporte(pasaporteViajero);

        // Muestro todo
        pasaporteViajero.mostrarInfoCompleta();
        titularPersona.mostrarInfoCompleta();
    }
}
