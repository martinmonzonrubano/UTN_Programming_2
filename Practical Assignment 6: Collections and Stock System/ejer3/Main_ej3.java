/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Main_ej3
 */
package ejer3;

public class Main_ej3 {

    public static void main(String[] args) {

        // Creo la universidad donde voy a cargar profes y cursos
        Universidad uni = new Universidad("UNLAM");

        // Profesores de prueba
        Profesor p1 = new Profesor("PR01", "Sofia Ramirez", "Analisis Matematico");
        Profesor p2 = new Profesor("PR02", "Gustavo Lopez", "Programación");
        Profesor p3 = new Profesor("PR03", "Mariana Torres", "Inglés Tecnico");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        // Cursos disponibles
        Curso c1 = new Curso("CUR101", "Matematica I");
        Curso c2 = new Curso("CUR102", "Java Inicial");
        Curso c3 = new Curso("CUR103", "Ingles Tecnico I");
        Curso c4 = new Curso("CUR104", "Base de Datos I");
        Curso c5 = new Curso("CUR105", "Algoritmos");

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asigno profesores a los cursos
        uni.asignarProfesorACurso("CUR101", "PR01");
        uni.asignarProfesorACurso("CUR102", "PR02");
        uni.asignarProfesorACurso("CUR104", "PR02");
        uni.asignarProfesorACurso("CUR103", "PR03");
        uni.asignarProfesorACurso("CUR105", "PR01");

        System.out.println("\n Listado de cursos ");
        uni.listarCursos();

        System.out.println("\n Listado de profesores ");
        uni.listarProfesores();

        // Cambio de profesor para un curso puntual
        System.out.println("\n Cambiar profesor del curso CUR104 a PR03...");
        uni.asignarProfesorACurso("CUR104", "PR03");
        uni.listarCursos();

        // Elimino un curso
        System.out.println("\n Eliminar curso CUR102...");
        uni.eliminarCurso("CUR102");
        uni.listarCursos();

        // Elimino un profesor
        System.out.println("\n Eliminar profesor PR01...");
        uni.eliminarProfesor("PR01");
        uni.listarCursos();
    }
}
