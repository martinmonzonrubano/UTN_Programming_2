/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Main_ej2
 */
package ejer2;

public class Main_ej2 {

    public static void main(String[] args) {

        Biblioteca biblio = new Biblioteca("Biblioteca Sur");

        Autor a1 = new Autor("A10", "Mario Benedetti", "Uruguaya");
        Autor a2 = new Autor("A20", "Susan Collins", "Estadounidense");
        Autor a3 = new Autor("A30", "Isabel Allende", "Chilena");

        biblio.agregarLibro("ISBN100", "La Tregua", 1960, a1);
        biblio.agregarLibro("ISBN200", "Los Juegos del Hambre", 2008, a2);
        biblio.agregarLibro("ISBN300", "La Casa de los Espíritus", 1982, a3);
        biblio.agregarLibro("ISBN201", "En Llamas", 2009, a2);
        biblio.agregarLibro("ISBN101", "Gracias por el Fuego", 1965, a1);

        System.out.println("\n Listado de libros:");
        biblio.listarLibros();

        System.out.println("\n Buscar libro ISBN200:");
        Libro buscado = biblio.buscarLibroPorIsbn("ISBN200");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("\n Libros publicados en 2008:");
        for (Libro l : biblio.filtrarLibrosPorAnio(2008)) l.mostrarInfo();

        System.out.println("\n Eliminar ISBN300");
        boolean elim = biblio.eliminarLibro("ISBN300");
        System.out.println("Eliminado: " + elim);

        System.out.println("Listado tras eliminacion:");
        biblio.listarLibros();

        System.out.println("\n Cantidad total de libros:");
        System.out.println(biblio.obtenerCantidadLibros());

        System.out.println("\n Autores disponibles:");
        biblio.mostrarAutoresDisponibles();
    }
}
