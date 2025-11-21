/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Profesor
 */
package ejer3;

import java.util.ArrayList;

public class Profesor {

    private final String id;
    private final String nombre;
    private final String especialidad;
    private final ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public ArrayList<Curso> getCursos() { return cursos; }

    // Agrego un curso al profesor
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    // Elimino la asociación con un curso
    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println(c.getCodigo() + " - " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (" + especialidad + ")");
        System.out.println("Cantidad de cursos asignados: " + cursos.size());
    }
}
