package trabajopract2;

import java.util.Scanner;
public class ejer9_costo_envio {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Indique el precio del producto: ");
        double precio=input.nextDouble();
        System.out.println("Indique el peso del producto: ");
        double peso=input.nextDouble();
        System.out.println("Indique la zona del producto (Internacional o Nacional): ");
        input.nextLine();
        String zona=input.nextLine();
        while (!zona.equals("Nacional") && !zona.equals("Internacional")){
            System.out.println("Indique la zona del producto (Internacional o Nacional): ");
            zona=input.nextLine();
        }
        double costo=calcularCostoEnvio(peso, zona);
        double total=TotalCompra(precio, costo);
        System.out.println("El total a pagar es de: "+total);
    }
    static double calcularCostoEnvio(double peso, String zona){
        if (zona.equals("Nacional")){
            return peso*5;
        }else if(zona.equals("Internacional")){
            return peso*10;
        }
        return 0;
    }
    static double TotalCompra(double precio, double costo_envio){
        return precio+costo_envio;
    }
}
