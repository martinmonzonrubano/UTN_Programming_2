/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Biblioteca
 */
package ejer2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca {

    private final ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        // Acá guardo todos los libros que se cargan
        this.libros = new ArrayList<>();
    }

    // Agrego un libro directamente creando la instancia acá
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    // Recorro y muestro cada libro
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    // Busco por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) return l;
        }
        return null;
    }

    // Elimino usando un Iterator para evitar errores de modificación
    public boolean eliminarLibro(String isbn) {
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            Libro l = it.next();
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    // Cantidad total de libros guardados
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    // Devuelvo una lista solo con los libros de ese año
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> salida = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) salida.add(l);
        }
        return salida;
    }

    // Muestro los autores asociados a los libros cargados
    public void mostrarAutoresDisponibles() {
        System.out.println("Autores disponibles en la biblioteca:");
        for (Libro l : libros) {
            l.getAutor().mostrarInfo();
        }
    }
}
