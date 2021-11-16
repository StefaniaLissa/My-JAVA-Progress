import java.util.*;

public class P_6_2_1{
    public static void main (String args []) throws IOException{
        String cadena=new String();
        char silaba;
		char continua;

        Scanner sc = new Scanner (System.in);
		
		do{
        System.out.print("Ingrese una palabra: ");
        cadena = sc.nextLine();

        System.out.print("Ingrese una silava: ");
        silaba = (char) System.in.read();

        System.out.println("La silava "+silaba+" aparece por primera vez en la posicion"+(cadena.indexOf(silaba)+1));
		
		System.out.println("Desea continuar? S/N");
		continua =(char) System.in.read();
		}while(continua=='S');
    }
}
