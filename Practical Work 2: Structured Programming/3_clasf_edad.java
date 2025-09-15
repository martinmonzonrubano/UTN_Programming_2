package trabajopract2;
import java.util.Scanner;
public class ejer3_clasfedad {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Indique su edad: ");
       int edad=input.nextInt();
       if (edad<12 && edad>=0){
           System.out.println("Su edad es de Niño");
       }
       else if (edad<=17 && edad>=12){
           System.out.println("Su edad es de Adolescente");
       }
        else if (edad<=59 && edad>=18){
           System.out.println("Su edad es de Adulto");
       }
        else if (edad>=60){
           System.out.println("Su edad es de Adulto mayor");
       } else{
            System.out.println("Edad invalida");
        }
   } 
}
