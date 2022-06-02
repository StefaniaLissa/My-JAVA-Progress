import java.util.*;

public class P_6_2_6{
    public static void main (String args[]){
        String str = new String();
        String silaba = new String();

        Scanner sc = new Scanner (System.in);

        System.out.print(" Introduce una palabra: ");
        str = sc.next();
		str = str.toLowerCase();

        System.out.print(" Introduce una silaba: ");
        silaba = sc.next();
		silaba = silaba.toLowerCase();

		if (str.startsWith(silaba)){
			System.out.println("Si, la palabra comienza con "+silaba);
		}else{
			System.out.println("La palabra no comienza con esa silaba");
		}
    }
}