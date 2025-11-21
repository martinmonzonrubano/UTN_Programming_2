/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Vaca
 */
package ejer3;

// Clase Vaca que hereda de Animal
public class Vaca extends Animal {

    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Muuuuu");
    }
}
