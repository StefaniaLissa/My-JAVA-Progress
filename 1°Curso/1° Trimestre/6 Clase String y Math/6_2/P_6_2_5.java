import java.util.*;

public class P_6_2_5{
    public static void main (String args[]){
        String str = new String();
        String palabra = new String();

        Scanner sc = new Scanner (System.in);

        System.out.print(" Introduce una frase: ");
        str = sc.nextLine();

        System.out.print(" Introduce una palabra: ");
        palabra = sc.next();

        System.out.println("La palabra se encuentra en la posicion "+(str.lastIndexOf(palabra)+1));
    }
}