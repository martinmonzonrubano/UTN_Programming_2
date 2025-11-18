/**
 * Autor: Martin Monzon
 * Fecha: 18 nov 2025
 * Clase: Celular
 */

package ej2;

public class Celular {

    private final String imei; 
    private final String marca;
    private final String modelo;

    private final Bateria bateria; 
    private Usuario usuario; // Relación bidireccional

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; // El celular siempre tiene su batería
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario; // Asigno el usuario al celular
    }

    public String getMarca() {
        return marca;
    }

    // Info completa del celular
    public void mostrarInfoCompleta() {
        System.out.println("=== INFORMACION DEL CELULAR ===");
        System.out.println("IMEI: " + imei + ", Marca: " + marca + ", Modelo: " + modelo);

        if (bateria != null) {
            System.out.println("Contiene: " + bateria.mostrarInfo());
        }

        // Chequeo si este celular tiene un usuario asignado
        if (usuario != null) {
            System.out.println("Asignado a: " + usuario.getNombre() + " (Acceso desde el Celular)");
        }
    }
}
