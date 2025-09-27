package trabajo_practico_3;


public class principal_libros {

    
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setTitulo("Rebelion en la granja");
        libro1.setAutor("George Orwell");
        libro1.setAnioPublicacion(-1945);
        libro1.mostrarLibro();
        libro1.setAnioPublicacion(1945);
        libro1.mostrarLibro();
        
    }
    
}
