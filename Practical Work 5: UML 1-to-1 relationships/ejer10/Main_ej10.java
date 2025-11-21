/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Main_ej10
 */
package ej10;

public class Main {

    public static void main(String[] args) {
        
        // Creo al titular y la cuenta bancaria
        Titular titularCuenta = new Titular("Mora", "21986024");
        CuentaBancaria cuenta1 = new CuentaBancaria(
            "26187462", 
            100800.30, 
            "2839", 
            "27-11-2025"
        );
        
        // Vinculo ambas clases como en los ejercicios anteriores
        cuenta1.setTitular(titularCuenta); 
        titularCuenta.setCuenta(cuenta1);

        // Muestro la información
        cuenta1.mostrarInfoCompleta();
        System.out.println();
        titularCuenta.mostrarDatosCompletos();
    }
}
