/**
 * Autor: Martin Monzon
 * Fecha: 19 nov 2025
 * Clase: Computadora
*/

package ejer5;

public class Computadora {
    
    private final String marca;
    private final String numeroSerie;
    private final PlacaMadre placaMadre; // La PC siempre tiene una placa madre
    
    private Propietario propietario; // Puede ser null

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        // Como siempre viene con una placa madre, la creo directamente acá
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca); 
    }

    // Asigno el propietario de esta computadora
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    public String getMarca() {
        return marca;
    }
    
    // Muestro todos los datos de la PC, incluida su placa y su propietario
    public void mostrarInfoCompleta() {
        System.out.println("\n=== INFORMACION DE LA COMPUTADORA ===");
        System.out.println("Marca: " + marca + " | Numero de Serie: " + numeroSerie);
        
        if (placaMadre != null) {
            System.out.println("Placa Madre: " + placaMadre.mostrarInfo());
        }
        
        if (propietario != null) {
            System.out.println("Propietario: " + propietario.getNombre()
                + " (Acceso desde Computadora)");
        } else {
            System.out.println("Propietario: No asignado");
        }
    }
}
