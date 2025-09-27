package trabajo_practico_3;


public class principal_granja {

    
    public static void main(String[] args) {
        Gallina gallina1= new Gallina(), gallina2 = new Gallina();
        gallina1.setIdGallina(992);
        gallina2.setIdGallina(945);
        gallina1.setEdad(2);
        gallina2.setEdad(1);
        gallina1.setHuevosPuestos(200);
        gallina2.setHuevosPuestos(120);
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        gallina1.envejecer(1);
        gallina1.ponerHuevo(110);
        gallina2.envejecer(1);
        gallina2.ponerHuevo(200);
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
    
}
