/**
 * Autor: Martin Monzon
 * Fecha: 22 nov 2025
 * Clase: LeerArchivo
 */
package parte2;

import java.io.*;

// Lectura simple de archivo (maneja FileNotFound y IOException)
public class LeerArchivo {

    public static void leer(String ruta) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo.");
        }
    }
}
