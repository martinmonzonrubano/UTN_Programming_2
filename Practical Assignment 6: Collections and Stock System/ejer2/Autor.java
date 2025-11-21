/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Autor
 */
package ejer2;

public class Autor {

    private final String id;
    private final String nombre;
    private final String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }

    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + " (" + nacionalidad + ") - ID: " + id);
    }
}
