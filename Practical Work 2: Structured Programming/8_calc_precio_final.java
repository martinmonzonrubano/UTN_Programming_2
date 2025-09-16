package trabajopract2;

import java.util.Scanner;
public class ejer8_preciofinal {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Indique el precio base del producto: ");
        double base=input.nextDouble();
        System.out.println("Indique el porcentaje de impuesto del producto: ");
        double impuesto=input.nextDouble();
        System.out.println("Indique el porcentaje de descuento del producto: ");
        double descuento=input.nextDouble();
        impuesto=impuesto/100;
        descuento=descuento/100;
        calcularPrecioFinal(impuesto, descuento, base);
    }
    static void calcularPrecioFinal(double impuesto, double descuento, double precio_base){
        double precio_final=precio_base+(precio_base*impuesto)-(precio_base*descuento);
        System.out.println("El precio final del producto es de: "+precio_final);
    }
}
