import java.util.*;

public class P_6_2_2{
    public static void main (String args[]){
        String str = new String ();

        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese una frase: ");
        str = sc.nextLine();

        str= str.replace('a', 'A').replace('e', 'E').replace('i', 'I').replace('o', 'O').replace('u', 'U');

        System.out.print(str);
    }
}