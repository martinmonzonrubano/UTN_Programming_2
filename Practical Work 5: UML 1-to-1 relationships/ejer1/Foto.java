/**
 * Autor: Martin Monzon
 * Fecha: 17 nov 2025
 * Clase: Foto
 */

public class Foto {
    private final String imagen;
    private final String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }
    
    // Info simple de la foto
    public String mostrarInfo() {
        return "Imagen: " + imagen + ", Formato: " + formato;
    }
}
