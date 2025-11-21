/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Main_ej11
 */
package ej11;

public class Main {

    public static void main(String[] args) {

        System.out.println("GESTION DE REPRODUCTOR Y CANCIONES");

        Artista DJProductor = new Artista("Armin Van Buuren", "Trance Progresivo");
        
        Cancion cancionExitosa = new Cancion("Blue Fear", DJProductor);
        Reproductor reproductor = new Reproductor(); 
        
        System.out.println("\n Prueba de Dependencia ");
        reproductor.reproducir(cancionExitosa);
    }
}
