/**
 * Autor: Martin Monzon
 * Fecha: 22 nov 2025
 * Clase: LeerArchivoSeguro
 */
package parte2;

import java.io.*;

// Lectura con try-with-resources (buena práctica)
public class LeerArchivoSeguro {

    public static void leer(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error manejando el archivo: " + e.getMessage());
        }
    }
}
