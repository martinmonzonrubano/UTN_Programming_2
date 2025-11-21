/**
 * Autor: Martin Monzon
 * Fecha: 20 nov 2025
 * Clase: Main_ej9
 */
package ej9;

public class Main {

    public static void main(String[] args) {

        // Creo un paciente y su profesional médico
        Paciente pacienteNuevo = new Paciente("Brenda Villalba", "San Martín 842");
        Profesional medico = new Profesional("Dra. Julieta Mendez", "Dermatología");

        // Creo la cita médica pasando paciente y profesional
        CitaMedica turno = new CitaMedica(
            "05-12-2025", 
            "09:45", 
            pacienteNuevo, 
            medico
        );
        
        // Muestro toda la información de la cita
        turno.mostrarInfoCompleta();
    }
}

