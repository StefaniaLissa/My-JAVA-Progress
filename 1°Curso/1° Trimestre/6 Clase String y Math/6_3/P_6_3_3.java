import java.util.*;

public class P_6_3_3{
    public static void main(String args[]){
        int num = 0;
       
        Scanner sc = new Scanner (System.in);

        do{
            System.out.print(" Ingrese un numero: ");
                num = sc.nextInt();
				if(num<0){
					System.out.println("El numero no puede ser negativo");
				}else{
                System.out.println(Math.sqrt(num));}
        }while(enteros!=0);

    }
}