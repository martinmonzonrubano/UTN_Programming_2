package trabajopract2;

import java.util.Scanner;
public class ejer5_sumadepares {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero (0 para terminar): ");
        Scanner input=new Scanner(System.in);
        int suma_pares=0;
        double num = input.nextDouble();
        while (num != 0){
            if (num%2==0){
                suma_pares=(int)num+suma_pares;
            }
            System.out.println("Ingrese un numero (0 para terminar): ");
            num = input.nextDouble();
        }
        System.out.println("La suma de los numeros pares es de: "+ suma_pares);
    }
}
