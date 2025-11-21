/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Rectangulo
 */
package ejer2;

// Clase que representa un rectángulo, hereda de Figura
public class Rectangulo extends Figura {
    private final double base;
    private final double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Calcula el área del rectángulo
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
