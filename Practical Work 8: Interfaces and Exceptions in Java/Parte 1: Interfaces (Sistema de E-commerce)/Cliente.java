/**
 * Autor: Martin Monzon
 * Fecha: 22 nov 2025
 * Clase: Cliente
 */
package parte1;

// Cliente que recibe notificaciones del pedido
public class Cliente implements Notificable {

    private final String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre + " recibió notificación: " + mensaje);
    }
}
