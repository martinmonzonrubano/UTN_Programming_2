/**
 * Autor: Martin Monzon
 * Fecha: 18 nov 2025
 * Clase: Libro
 */

package ejer3;

public class Libro {
    private final String titulo;
    private final String isbn;
    private final Autor autor; 
    private final Editorial editorial; 

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor; 
        this.editorial = editorial; 
    }

    // Muestro toda la info del libro.
    // Si el autor o la editorial no existen, simplemente no los muestro.
    public void mostrarInfoCompleta() {
        System.out.println("Titulo: " + titulo);
        System.out.println("ISBN: " + isbn);
        
        if (autor != null) {
            System.out.println("Escrito por: " + autor.mostrarInfo());
        }
        
        if (editorial != null) {
            System.out.println("Publicado por: " + editorial.mostrarInfo());
        }
    }
}
