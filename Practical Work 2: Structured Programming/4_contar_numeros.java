package trabajopract2;
import java.util.Scanner;
public class ejer6_contador_de_numeros {
    public static void main(String[] args) {
        int positivos=0, negativos=0, ceros=0;
        Scanner input = new Scanner(System.in);
        for (int i= 1; i<11; i++){
        System.out.println("Ingrese el numero "+i+":");
        int num = input.nextInt();
        if (num>0){
            positivos++;
        } else if (num<0){
            negativos++;
        } else {
            ceros++;
        }    
    }
        System.out.println("Resultados:\n Positivos: "+positivos+"\n Negativos: "+negativos+"\n Ceros: "+ceros);
    }
}
