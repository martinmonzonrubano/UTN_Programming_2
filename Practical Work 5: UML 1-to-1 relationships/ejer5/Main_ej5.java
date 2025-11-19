/**
 * Autor: Martin Monzon
 * Fecha: 19 nov 2025
 * Clase: Main_ej5
 */

package ejer5;

public class Main_ej5 {  

    public static void main(String[] args) {
        
        // Creo un propietario de prueba
        Propietario propietarioNuevo = new Propietario("Zoe Villalba", "45336888");
        
        // Creo una computadora con su placa madre interna (composición)
        Computadora pcZoe = new Computadora(
            "SAMSUNG", 
            "22662662739", 
            "Mother 1150 Intel",
            "I5"
        );
        
        // Relación bidireccional: conecto la PC con su propietario
        pcZoe.setPropietario(propietarioNuevo); 
        propietarioNuevo.setComputadora(pcZoe); 
        
        // Muestro primero la info de la computadora
        pcZoe.mostrarInfoCompleta();
        
        // Y después la info del propietario
        propietarioNuevo.mostrarDatosCompletos();
    }    
}
