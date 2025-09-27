package trabajo_practico_3;

       
public class Estudiantes {
      private String nombre;
      private String apellido;
      private int curso;
      private int calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    public void showInfo(){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(curso);
        System.out.println(calificacion);
    }
    public void subirCalificacion(int puntos){
        if (puntos>=0){
            calificacion+=puntos;
        }
    }
    public void bajarCalificacion(int puntos){
        if (puntos>=0){
            calificacion-=puntos;
        }
    }
}
