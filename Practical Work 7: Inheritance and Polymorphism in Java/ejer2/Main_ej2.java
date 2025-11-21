/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Main_ej2
 */
package ejer2;

public class Main_ej2 {

    public static void main(String[] args) {

        // Creo un arreglo de figuras
        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo("Círculo", 5);
        figuras[1] = new Rectangulo("Rectángulo", 4, 6);

        // Muestro el nombre y área de cada figura
        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " - Área: " + f.calcularArea());
        }
    }
}
