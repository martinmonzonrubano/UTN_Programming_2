package trabajo_practico_3;


public class NaveEspacial {
    private String nombre;
    private int combustible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    public void despegar(){
        if (combustible>25){
            System.out.println("Despegando...");
            combustible-=25;
        }else{
            System.out.println("Combustible insuficiente para despegar");
        }
        
    }
    public void avanzar(int dist){
        if (dist<combustible){
            System.out.println("Se avanzo " + dist + "mil km");
            combustible-=dist;
        } else {
            System.out.println("No tiene suficiente combustible para avanzar esa distancia");
        }  
    }
    public void recargarCombustible (int cantidad){
        combustible+=cantidad;
    }
    public void mostrar_estado (){
        System.out.println("La nave "+nombre+" tiene un nivel de "+combustible+"% de combustible");
    }
}
