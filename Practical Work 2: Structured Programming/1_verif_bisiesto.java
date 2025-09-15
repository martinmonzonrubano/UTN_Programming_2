package trabajopract2;


public class Trabajopract2 {

    
    public static void main(String[] args) {
    //Verificar anio bisiesto
    int[] anios= {2001, 2024, 1993, 1984, 2003};
          for (int i=0;i<anios.length;i++){
              if ((anios[i]%4==0 && anios[i]%100!=0) || (anios[i]%400==0)) {
              System.out.println("El año "+ anios[i] + " es bisiesto");
          } else{
                 System.out.println("El año "+ anios[i] + " no es bisiesto"); 
              }
          }  
    }
    
}
