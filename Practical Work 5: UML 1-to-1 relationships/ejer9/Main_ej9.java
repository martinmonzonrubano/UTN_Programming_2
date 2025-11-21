/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Main_ej9
 */
package ej9;

public class Main {

    public static void main(String[] args) {

        // Creo un paciente y su profesional médico
        Paciente pacienteNuevo = new Paciente("Lucia Rodriguez", "Nobis N400");
        Profesional medico = new Profesional("Dr. Nicolas Usedo", "Cardiologia");

        // Creo la cita médica pasando paciente y profesional
        CitaMedica turno = new CitaMedica(
            "20-11-2025", 
            "16:00", 
            pacienteNuevo, 
            medico
        );
        
        // Muestro toda la información de la cita
        turno.mostrarInfoCompleta();
    }
}
