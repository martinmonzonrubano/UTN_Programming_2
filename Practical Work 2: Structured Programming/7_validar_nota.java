package trabajopract2;

import java.util.Scanner;

public class ejer7_validacion_nota {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int nota;
        do {
            System.out.println("Ingrese una nota (0-10):");
            nota = input.nextInt();       
        }while (nota<0 || nota>10);
    }
}
