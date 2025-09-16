package trabajopract2;

import java.util.Scanner;
public class ejer13_recur_array_modif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                double[] precios={199.99, 299.5, 149.75, 399.0, 89.99};
        mostrar_array(precios,0);
        precios[2]=129.99;
        mostrar_array(precios,0);
    }
    static void mostrar_array(double[] precios, int indice){
        if (indice==precios.length){
            return;
            }
        System.out.println(precios[indice]);
         mostrar_array(precios, indice + 1);
    }
}
