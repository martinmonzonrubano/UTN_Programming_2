package trabajo_practico_3;


public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anio) {
        if (anio>=0){
        anioPublicacion = anio;
    }
    }
    
    public void mostrarLibro(){
            System.out.println(titulo);
            System.out.println(autor);
            System.out.println(anioPublicacion);
}
}
