/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Titular
 */
package ej10;

public class Titular {

    private final String nombre;
    private final String dni;
    private CuentaBancaria cuenta; 

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void mostrarDatosCompletos() {
        System.out.println("INFORMACION DEL TITULAR");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        
        if (cuenta != null) {
            System.out.println("Es titular de CBU: " + cuenta.getCbu() + " (Acceso a traves del Titular)");
        } else {
            System.out.println("Cuenta: No tiene cuenta asignada");
        }
    }
}
