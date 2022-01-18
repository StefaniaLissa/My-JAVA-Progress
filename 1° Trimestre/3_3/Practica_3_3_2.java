 import java.util.Scanner;
 
 public class Practica_3_3_2{

public static void main(String args[]) {
 
        Scanner sn = new Scanner(System.in);
 
        System.out.println("Introduce un anio");
        int anio = sn.nextInt();
         
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) 
            System.out.println("El anio " + anio + " es bisiesto");
         else {
            System.out.println("El anio " + anio + " no es bisiesto");
        }
 
    }
 
}
