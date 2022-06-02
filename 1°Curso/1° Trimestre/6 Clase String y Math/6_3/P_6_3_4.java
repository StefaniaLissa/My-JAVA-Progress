import java.util.*;

public class P_6_3_4{
    public static void main(String args[]){
        double num = 0;
       
        Scanner sc = new Scanner (System.in);

        do{
            System.out.print(" Ingrese un numero: ");
                num = sc.nextInt();
				System.out.println((int)num);
				
				if(num>0)
                System.out.println(Math.floor(num));
				else
                System.out.println(Math.ceil(num));
        }while(num!=0);

    }
}