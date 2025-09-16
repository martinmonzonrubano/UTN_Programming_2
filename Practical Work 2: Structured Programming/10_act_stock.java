package trabajopract2;
import java.util.Scanner;
public class ejer10_actualizar_stock {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Indique el stock actual: ");
        int stock_a=input.nextInt();
        System.out.println("Indique la cantidad vendida: ");
        int cant_vendida=input.nextInt();
        System.out.println("Indique la cantidad recibida: ");
        int cant_recibida=input.nextInt();
        int stock_actualizado=actualizarStock(stock_a,cant_vendida,cant_recibida);
        System.out.println("El nuevo stock del producto es de: "+stock_actualizado);
    }
    static int actualizarStock(int StockActual, int cantidadVendida, int cantidadRecibida){
        return StockActual+cantidadRecibida-cantidadVendida;
    }
}
