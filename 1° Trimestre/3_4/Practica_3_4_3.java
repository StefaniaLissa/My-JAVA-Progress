import java.util.*;

public class Practica_3_4_3{

    public static void main(String args[]) {
        byte b1;
        byte b2;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introducir un valor para b1");
         b1 = sc.nextByte();
         do {
             b1++;
             System.out.println(b1);
            }while(b1>0);
        System.out.println("El valor máximo es "+b1);
        
         sc.nextByte();
         System.out.println("Introducir un valor para b2");
         b2 = sc.nextByte();
         do {
             b2--;
             System.out.println(b2);
            }while(b2<0);
        System.out.println("El valor minimo es "+b2);
        
    }
}