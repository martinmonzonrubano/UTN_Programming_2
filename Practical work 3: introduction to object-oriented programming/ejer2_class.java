package trabajo_practico_3;


public class Mascotas {
    private String nombre;
    private String especie;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=0){
        this.edad = edad;
        }
    }
    
    public void mostrarInfo(){
       System.out.println(nombre);
       System.out.println(especie);
       System.out.println(edad);
   }
    public void cumplirAnios(int anio){
        if (anio>0){
            edad+=anio;
        }
    }
}
