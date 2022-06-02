import java.util.*;

public class P_6_3_2{
    public static void main(String args[]){
        int num = 0;
       
        Scanner sc = new Scanner (System.in);

            System.out.print(" Ingrese un numero: ");
                num = sc.nextInt();

        System.out.println(Math.exp(num));
    }
}