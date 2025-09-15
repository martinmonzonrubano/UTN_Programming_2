package trabajopract2;
import java.util.Scanner;

public class ejer4_calculardto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el precio del producto: ");
        double precio = input.nextDouble();
        input.nextLine();
        System.out.println("Indique a que categoria pertenece el producto (A, B o C): ");
        char categoria = input.next().charAt(0);
        
        switch (categoria){
            case 'A':
                precio = precio-precio * 0.1;
                System.out.println("El precio del producto queda en: " + precio + "el descuento fue del 10%" );
                break;
            case 'B':
                precio = precio-precio * 0.15;
                System.out.println("El precio del producto queda en: " + precio + "el descuento fue del 15%" );
                break;
            case 'C':
                precio = precio-precio * 0.2;
                System.out.println("El precio del producto queda en: " + precio + "el descuento fue del 20%" );
                break;
            default:
                System.out.println("Categoria Inexistente, reinicie el programa");
        }
        
    }
}
