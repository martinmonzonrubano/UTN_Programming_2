/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Animal
 */
package ejer3;

// Clase base de todos los animales
public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Sonido genérico de un animal
    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }

    // Descripción del animal
    public void describirAnimal() {
        System.out.println("Soy un animal llamado " + nombre);
    }
}
