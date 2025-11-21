/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Main_ej3
 */
package ejer3;

import java.util.ArrayList;

public class Main_ej3 {

    public static void main(String[] args) {

        // Creo lista de animales
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Baco"));
        animales.add(new Gato("Apolo"));
        animales.add(new Vaca("Lola"));

        // Recorro y muestro cada animal y su sonido
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); 
        }
    }
}
