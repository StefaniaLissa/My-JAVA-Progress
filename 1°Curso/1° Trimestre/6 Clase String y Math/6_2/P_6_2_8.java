import java.util.*;

public class P_6_2_8{
    public static void main (String args[]){
        String str = new String();
        int palabras= 1;
        int posicion;

        Scanner sc = new Scanner (System.in);

        System.out.print(" Introduce una frase: ");
        str = sc.nextLine();
		str = str.trim();
		str = str.replace('  ', ' ');
        
        posicion = str.indexOf(" ");
		
        do{
            palabras++;
            posicion = str.indexOf(" ",posicion+1);
        }while(posicion != -1);
		
		System.out.println("La frace tiene "+palabras+" palabras.");
    }
}