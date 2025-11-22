/**
 * Autor: Martin Monzon
 * Fecha: 22 nov 2025
 * Clase: Main_parte2
 */
package parte2;

public class Main_parte2 {

    public static void main(String[] args) {

        System.out.println("=== División segura ===");
        System.out.println("10 / 2 = " + DividirSeguro.dividir(10, 2));
        System.out.println("10 / 0 = " + DividirSeguro.dividir(10, 0)); // Maneja el error

        System.out.println("\n=== Conversión de texto a número ===");
        System.out.println("Convertir '123': " + ConvertirTextoNumero.convertir("123"));
        System.out.println("Convertir 'hola': " + ConvertirTextoNumero.convertir("hola")); // error controlado

        System.out.println("\n=== Lectura de archivo simple ===");
        LeerArchivo.leer("archivo.txt"); // si no existe, muestra error

        System.out.println("\n=== Validación de edad ===");
        try {
            ValidadorEdad.validar(30);
            System.out.println("Edad válida: 30");
            ValidadorEdad.validar(-10); // lanza excepción personalizada
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== Lectura con try-with-resources ===");
        LeerArchivoSeguro.leer("archivo2.txt"); // maneja errores correctamente
    }
}
