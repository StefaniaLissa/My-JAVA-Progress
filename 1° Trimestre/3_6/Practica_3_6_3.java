import java.util.*;

public class Practica_3_6_3{
    public static void main(String args[]){
        int num=0, total=0;

 Scanner sc = new Scanner(System.in);

        do{
        System.out.println("Introduce un numero para sumar");
        num = sc.nextInt();

        total=total+num;

        System.out.println("= "+total);
        }while(num==num);
    }
}