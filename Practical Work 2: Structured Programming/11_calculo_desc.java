package trabajopract2;

import java.util.Scanner;
public class ejer11_calculo_desc {
    static double descuento=0.10;
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Indique el precio de su producto: ");
       double precio=input.nextDouble();
       calcularDescuentoEspecial(precio);
}
   static void calcularDescuentoEspecial(double precio){
       double resto=precio*descuento;
       double precio_final=precio-resto;
       System.out.println("El descuento especial aplicado es: " + resto);
       System.out.println("El precio final con descuento es: " + precio_final);
   }
}
