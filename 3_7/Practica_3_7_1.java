import java.util.*;

public class Practica_3_7_1{
    public static void main(String args[]){
        int n, m, r;

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce dos números para calcular el máximo común divisor");
        n = sc.nextInt();
        do{
        m = sc.nextInt();
         }while(m==0);
         
        r=n%m;

        while(r=!0){
            n=m;
            m=r;
            r=n%m;
        }
        System.out.println("El máximo común divisor es "+m);
    }
}
