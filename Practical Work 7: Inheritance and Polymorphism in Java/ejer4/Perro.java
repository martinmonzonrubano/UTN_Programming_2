/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Perro
 */
package ejer3;

// Clase Perro que hereda de Animal
public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}
