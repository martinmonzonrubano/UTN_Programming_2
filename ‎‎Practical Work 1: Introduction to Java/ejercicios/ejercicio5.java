package ejercicio5;
import java.util.Scanner;
public class Ejer5tp1 {

    
    public static void main(String[] args) {
        int num1, num2, suma, resta, mult;
        double div;
        Scanner input=new Scanner(System.in);
        System.out.println("Indique el numero 1: ");
        num1=input.nextInt();
        System.out.println("Indique el numero 2: ");
        num2=input.nextInt();
        suma=num1+num2;
        resta=num1-num2;
        mult=num1*num2;
        div=num1/num2;
        System.out.println("Suma= " + suma);
        System.out.println("Resta= " + resta);
        System.out.println("Multiplicacion= "+mult);
        System.out.println("Division= "+div);
    }

}
