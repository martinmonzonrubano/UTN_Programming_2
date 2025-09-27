package trabajo_practico_3;


public class funcionprincipal {

    
    public static void main(String[] args) {
        Estudiantes alum1= new Estudiantes();
        alum1.setNombre("Martin");
        alum1.setApellido("Monzon");
        alum1.setCurso(6);
        alum1.setCalificacion(9);
        alum1.showInfo();
        alum1.subirCalificacion(1);
        alum1.showInfo();
        alum1.bajarCalificacion(5);
        alum1.showInfo();
    }
    
}
