package ejercicio4;

import java.util.Scanner;
public class EjerciciosTP1 {

    
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre=input.nextLine();
        System.out.println("Ingrese su edad: ");
        edad=Integer.parseInt(input.nextLine());
        System.out.println(nombre + " tiene " + edad + " anios");
    }

}
