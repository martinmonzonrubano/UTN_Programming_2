/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Circulo
 */
package ejer2;

// Clase que representa un círculo, hereda de Figura
public class Circulo extends Figura {
    private final double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // Calcula el área del círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
