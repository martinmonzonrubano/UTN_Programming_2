/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Main_ej2
 */
package ejer2;

public class Main_ej2 {

    public static void main(String[] args) {

        // Creo la biblioteca donde voy a guardar los libros
        Biblioteca biblio = new Biblioteca("Biblioteca Sur");

        // Cargo algunos autores para reutilizar
        Autor a1 = new Autor("A10", "Mario Benedetti", "Uruguaya");
        Autor a2 = new Autor("A20", "Susan Collins", "Estadounidense");
        Autor a3 = new Autor("A30", "Isabel Allende", "Chilena");

        // Agrego libros a la biblioteca
        biblio.agregarLibro("ISBN100", "La Tregua", 1960, a1);
        biblio.agregarLibro("ISBN200", "Los Juegos del Hambre", 2008, a2);
        biblio.agregarLibro("ISBN300", "La Casa de los Espíritus", 1982, a3);
        biblio.agregarLibro("ISBN201", "En Llamas", 2009, a2);
        biblio.agregarLibro("ISBN101", "Gracias por el Fuego", 1965, a1);

        // Listo todo lo cargado
        System.out.println("\n Listado de libros:");
        biblio.listarLibros();

        // Busco un libro puntual
        System.out.println("\n Buscar libro ISBN200:");
        Libro buscado = biblio.buscarLibroPorIsbn("ISBN200");
        if (buscado != null) buscado.mostrarInfo();

        // Filtro por año de publicación
        System.out.println("\n Libros publicados en 2008:");
        for (Libro l : biblio.filtrarLibrosPorAnio(2008)) l.mostrarInfo();

        // Elimino uno de los libros
        System.out.println("\n Eliminar ISBN300");
        boolean elim = biblio.eliminarLibro("ISBN300");
        System.out.println("Eliminado: " + elim);

        // Muestro cómo quedó después de eliminar
        System.out.println("Listado tras eliminacion:");
        biblio.listarLibros();

        // Cuento cuántos quedaron
        System.out.println("\n Cantidad total de libros:");
        System.out.println(biblio.obtenerCantidadLibros());

        // Listo los autores que quedaron disponibles
        System.out.println("\n Autores disponibles:");
        biblio.mostrarAutoresDisponibles();
    }
}
