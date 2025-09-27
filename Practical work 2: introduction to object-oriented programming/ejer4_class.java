package trabajo_practico_3;


public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    public void ponerHuevo(int huevos){
        huevosPuestos+=huevos;
    }
    public void envejecer(int anios){
        edad+=anios;
    }
    public void mostrarEstado(){
        System.out.println("Gallina id: " + idGallina );
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos + "\n");
    }
}
