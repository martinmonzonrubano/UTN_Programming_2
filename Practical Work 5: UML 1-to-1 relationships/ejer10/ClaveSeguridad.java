/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: ClaveSeguridad
 */
package ej10;

public class ClaveSeguridad {

    private final String codigo;
    private final String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String mostrarInfo() {
        return "Clave: " + codigo + ", Ultima Modificacion: " + ultimaModificacion;
    }
}
