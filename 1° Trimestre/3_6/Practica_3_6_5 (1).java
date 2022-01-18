import java.util.*;

public class Practica_3_6_5{
    public static void main(String args[]){
        int n, i, n1=1, n2=0, n3=0;

        Scanner sc = new Scanner (System.in);
		do{
        System.out.println("Introduce en Nésimo término");
        n = sc.nextInt();
		}while (n <= 0);
		
        for(i=0; i<n; ++i){
        n3=n1+n2;
        System.out.print(n3+" ");
        n1=n2;
        n2=n3;
        }

    }
}

