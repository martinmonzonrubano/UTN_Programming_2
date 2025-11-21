/**
 * Autor: Martin Monzon
 * Fecha: 21 nov 2025
 * Clase: Main_ej1
 */
package ejer1;

public class Main_ej1 {

    public static void main(String[] args) {

        // Creo varios autos para probar
        Auto auto1 = new Auto("Honda", "Civic", 2024, 4, "Sport");
        Auto auto2 = new Auto("Toyota", "Corolla", 2025, 4, "Full");
        Auto auto3 = new Auto("Ford", "Mustang", 2023, 2, "GT");

        // Muestro la info de cada auto
        System.out.println(auto1.mostrarInfo());
        System.out.println(auto2.mostrarInfo());
        System.out.println(auto3.mostrarInfo());
    }
}
