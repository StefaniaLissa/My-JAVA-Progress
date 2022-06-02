import java.util.*;

public class P_6_3_6{
    public static void main(String args[]){
        int base = 0;
        int rad = 0;
        String str = new String();
       
        Scanner sc = new Scanner (System.in);

        do{
            System.out.print(" Ingrese la base: ");
            base = sc.nextInt();

            System.out.print(" Ingrese el radical: ");
            rad = sc.nextInt();
                
            System.out.println(Math.pow(base, 1/rad));

                System.out.print(" Desea terminar? (fin): ");
                str = sc.next();
                str = str.toLowerCase();
        }while(!str.equals("fin"));

    }
}