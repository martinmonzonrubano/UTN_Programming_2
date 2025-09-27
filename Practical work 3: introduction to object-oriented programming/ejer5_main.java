package trabajo_practico_3;


public class principal_nave {

    
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Enterprise");
        nave.setCombustible(50);
        nave.despegar();
        nave.avanzar(50);
        nave.recargarCombustible(50);
        nave.avanzar(50);
        nave.mostrar_estado();
    }
    
}
