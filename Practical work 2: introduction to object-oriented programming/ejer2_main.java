package trabajo_practico_3;


public class principal_mascortas {

   
    public static void main(String[] args) {
        Mascotas perro = new Mascotas();
        perro.setNombre("Morus");
        perro.setEspecie("Cocker");
        perro.setEdad(2);
        perro.mostrarInfo();
        perro.cumplirAnios(1);
        perro.mostrarInfo();
        
    }
    
}
