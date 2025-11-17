/**
 * Autor: Martin Monzon
 * Fecha: 17 nov 2025
 * Clase: Titular
 */

public class Titular {

    private final String nombre;
    private final String dni;
    private Pasaporte pasaporte; // Relación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    // Info completa del titular
    public void mostrarInfoCompleta() {
        System.out.println("\n=== INFORMACION DEL TITULAR ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);

        // Si tiene pasaporte, lo muestro
        if (pasaporte != null) {
            System.out.println("Pasaporte Num: " + pasaporte.getNumero() + " (Acceso desde el Titular)");
        } else {
            System.out.println("Pasaporte: No asignado");
        }
    }
}
