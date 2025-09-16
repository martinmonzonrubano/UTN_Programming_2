package trabajopract2;
import java.util.Scanner;
public class ejer12_modif_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] precios={199.99, 299.5, 149.75, 399.0, 89.99};
        for (int i=0; i<precios.length;i++){
            System.out.println(precios[i]);
        }
        precios[2]=129.99;
        for (int i=0; i<precios.length;i++){
            System.out.println(precios[i]);
        }
    }
}
