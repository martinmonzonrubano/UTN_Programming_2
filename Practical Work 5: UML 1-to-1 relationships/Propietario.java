/**
 * Autor: Martin Monzon
 * Fecha: 19 nov 2025
 * Clase: Propietario
*/

package ejer5;

public class Propietario {
    
    private final String nombre;
    private final String dni;
    
    private Computadora computadora; // Puede no tener PC

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Asigno la computadora del propietario
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public String getNombre() {
        return nombre;
    }
    
    // Muestro toda la info del propietario
    public void mostrarDatosCompletos() {
        System.out.println("\n=== INFORMACION DEL PROPIETARIO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        
        if (computadora != null) {
            System.out.println("Computadora asignada: " + computadora.getMarca()
                + " (Acceso desde Propietario)");
        } else {
            System.out.println("Computadora: No tiene una computadora asignada");
        }
    }

}
