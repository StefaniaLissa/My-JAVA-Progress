import java.util.*;

public class Practica_3_5_3{
    public static void main(String args[]){
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = sc.nextInt();

        if(num<1){System.out.println("El numero debe ser mayor que uno");
		}while(num<1){}

        System.out.println("Los números pares de 1 a "+num+" son: ");

        for (int i = 1; i<num; i++){
            if(i%2==0){
                System.out.println(i);
            } 
        }
    }
}