/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Usuario
 */
package ej8;

public class Usuario {

    private final String nombre;
    private final String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String mostrarInfo() {
        return "Usuario: " + nombre + ", Email: " + email;
    }
}
