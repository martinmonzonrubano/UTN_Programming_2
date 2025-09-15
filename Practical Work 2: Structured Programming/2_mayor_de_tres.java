package trabajopract2;
import java.util.Scanner;
public class ejer2_mayor_de_tres {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese tres numeros enteros");
    int[] numeros = new int[3];
    numeros[0]=input.nextInt();
    int mayor = numeros [0];
    for (int i=1; i<numeros.length;i++){
        numeros[i]=input.nextInt();
        if (numeros[i]>mayor){
            mayor=numeros[i];
        }
    }
    System.out.println("El mayor de los numeros es: "+mayor);
}}
