/**
 * Autor: Martin Monzon
 * Fecha: 19 nov 2025
 * Clase: PlacaMadre
*/

package ejer5;

public class PlacaMadre {
    
    private final String modelo;
    private final String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() {
        return modelo;
    }
    
    // Devuelvo la info lista para ser usada en los prints de la PC
    public String mostrarInfo() {
        return modelo + " | Chipset: " + chipset;
    }
}
