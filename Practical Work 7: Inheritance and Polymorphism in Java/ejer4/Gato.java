/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Gato
 */
package ejer3;

// Clase Gato que hereda de Animal
public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}
