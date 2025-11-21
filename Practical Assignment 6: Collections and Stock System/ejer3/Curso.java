/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Curso
 */
package ejer3;

public class Curso {

    private final String codigo;
    private final String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) {
        // Si ya tenía profesor, lo desasocio
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }

        this.profesor = p;

        // Aseguro la relación bidireccional
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.print("Curso: " + codigo + " - " + nombre);
        if (profesor != null) {
            System.out.println(" | Profesor: " + profesor.getId() + " - " + profesor.getNombre());
        } else {
            System.out.println(" | Profesor: No asignado");
        }
    }
}
