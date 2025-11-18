/**
 * Autor: Martin Monzon
 * Fecha: 18 nov 2025
 * Clase: Usuario
 */

package ej2;

public class Usuario {

    private final String nombre;
    private final String dni;
    private Celular celular; // Relación bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular; // Le asigno un celular al usuario
    }

    public String getNombre() {
        return nombre;
    }

    // Info completa del usuario
    public void mostrarDatosCompletos() {
        System.out.println("\n=== INFORMACION DEL USUARIO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);

        if (celular != null) {
            System.out.println("Tiene Celular Marca: " + celular.getMarca() + " (Acceso desde el Usuario)");
        } else {
            System.out.println("Celular: No tiene un celular asignado");
        }
    }
}
