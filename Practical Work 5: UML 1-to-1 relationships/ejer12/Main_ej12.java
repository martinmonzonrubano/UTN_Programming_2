/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Main_ej12
 */
package ej12;

public class Main_ej12 {

    public static void main(String[] args) {

        Contribuyente persona = new Contribuyente("Marcos Benitez", "23-30987412-7");
        
        Impuesto deuda = new Impuesto(7280.0, persona);

        Calculadora calc = new Calculadora();
       
        calc.calcular(deuda);
    }
}
