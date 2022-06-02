import java.util.*;

public class P_6_2_9{
    public static void main (String args[]){
        String str = new String();
        int posicion, caracteres;
        
        Scanner sc = new Scanner (System.in);

        System.out.print(" Introduce una frase ");
        str = sc.nextLine();
        
        posicion = str.lastIndexOf(" ");
        srt = srt.substring(0, posicion);

        System.out.println(srt);
    }
}