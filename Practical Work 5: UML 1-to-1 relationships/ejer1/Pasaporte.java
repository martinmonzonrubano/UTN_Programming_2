/**
 * Autor: Martin Monzon
 * Fecha: 17 nov 2025
 * Clase: Pasaporte
 */

public class Pasaporte {

    private final int numero;
    private final String fechaEmision;

    private final Foto foto;
    private Titular titular; // Relación bidireccional

    public Pasaporte(int numero, String fechaEmision, String nombreImagen, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;

        // Creo la foto directo acá porque siempre viene con el pasaporte
        this.foto = new Foto(nombreImagen, formatoFoto);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    // Muestro toda la info del pasaporte
    public void mostrarInfoCompleta() {
        System.out.println("=== INFORMACION DEL PASAPORTE ===");
        System.out.println("Numero: " + numero);
        System.out.println("Emision: " + fechaEmision);
        System.out.println("Foto: " + foto.mostrarInfo());

        // Chequeo si tiene o no titular asignado
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre() + " (Acceso desde el Pasaporte)");
        } else {
            System.out.println("Titular: No asignado");
        }
    }
}
